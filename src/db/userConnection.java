package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class userConnection {
        static Connection conn = null;
    public static void connect() {

        try {
            // db parameters
            String url = "jdbc:sqlite:src/db/pigierDB";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertIntoUsers(String sql){
          try {
            Statement statement = conn.createStatement();

            // Execute the insert statement
            statement.executeUpdate(sql);

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void closeConnection(){
          try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

