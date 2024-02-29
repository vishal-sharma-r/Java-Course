package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection conn;

    // Making the  instance of connection
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
    private DatabaseConnectionManager() {
    }
    public static DatabaseConnectionManager getManagerInstance() {
        if (connectionInstance == null) {
            connectionInstance = new DatabaseConnectionManager();
        }
        return connectionInstance;
    }
    public void connect()
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishal","root","vsr");
            System.out.println("Connection Established");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public Connection getConnectionObject(){
        return conn;
    }
    public void disconnect(){
        try {
            conn.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Connection is not closed properly");
            throw new RuntimeException(e);
        }
    }
}
