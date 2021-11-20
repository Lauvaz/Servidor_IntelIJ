package edu.upc.dsa;

import edu.upc.dsa.models.Track;

import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class ServerGameManagerImpl implements ServerGameManager {
    private static ServerGameManager instance;
    protected List<Track> tracks;
    final static Logger logger = Logger.getLogger(ServerGameManagerImpl.class);

    private ServerGameManagerImpl() {
        this.tracks = new LinkedList<>();
    }

    public static ServerGameManager getInstance() {
        if (instance==null) instance = new ServerGameManagerImpl();
        return instance;
    }

    public int size() {
        int ret = this.tracks.size();
        logger.info("size " + ret);

        return ret;
    }

    public Track addTrack(Track t) {
        logger.info("new Track " + t);

        this.tracks.add (t);
        logger.info("new Track added");
        return t;
    }

    public Track addTrack(String title, String singer) {
        return this.addTrack(new Track(title, singer));
    }

    public Track getTrack(String id) {
        logger.info("getTrack("+id+")");

        for (Track t: this.tracks) {
            if (t.getId().equals(id)) {
                logger.info("getTrack("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    public List<Track> findAll() {
        return this.tracks;
    }

    @Override
    public void deleteTrack(String id) {

        Track t = this.getTrack(id);
        if (t==null) {
            logger.warn("not found " + t);
        }
        else logger.info(t+" deleted ");

        this.tracks.remove(t);

    }

    @Override
    public Track updateTrack(Track p) {
        Track t = this.getTrack(p.getId());

        if (t!=null) {
            logger.info(p+" rebut!!!! ");

            t.setSinger(p.getSinger());
            t.setTitle(p.getTitle());

            logger.info(t+" updated ");
        }
        else {
            logger.warn("not found "+p);
        }

        return t;
    }
}