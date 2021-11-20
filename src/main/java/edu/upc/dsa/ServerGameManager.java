package edu.upc.dsa;

import edu.upc.dsa.models.User;

import java.util.List;

public interface ServerGameManager {


    public User addUser(User user);
    public User addUser(String name, String password, String email);
    public void loginUser(String name, String password);
    public List<User> getUserList();
    public User getUser(String name);
    public void deleteUser(String name, String password, String email);
    public void logOutUser(String name);
    public Object addObject (String name, String desription);
    public void deleteObject (String name);
    public List<Object> getObjectList();
    public Object getObject(String name);

    public int size();

    void clear();
}
