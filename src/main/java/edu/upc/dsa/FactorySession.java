package edu.upc.dsa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactorySession {
    public static Session openSession() {


        Connection conn = getConnection();

        Session session = new SessionImpl(conn);

        return session;
    }



    private static Connection getConnection() {
        Connection conn = null;
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                            "user=minty&password=greatsqldb");
            System.out.println("Connectat a la bbdd correctament.");


            /*
            conn =
                    DriverManager.getConnection("jdbc:mariadb://localhost:3306" +
                            "user=minty&password=greatsqldb");
            System.out.println("Connectat a la bbdd correctament.");

             */
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }
}
