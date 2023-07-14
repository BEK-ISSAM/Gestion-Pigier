package db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class userConnection {
        static Connection conn = null;

    public static Connection getConn() {
        return conn;
    }
        
    public static void connect() {
        try {
            // db parameters
            String dbPath = "src/db/pigierDB";
            String url = "jdbc:sqlite:" + new File(dbPath).getAbsolutePath();
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
            statement.executeUpdate(sql);
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet selectFromUsers(String sql){
        ResultSet resultSet = null;
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            
        }catch (SQLException e){
                e.printStackTrace();
            }
        return resultSet;
    }
    
    public static void closeConnection(){
          try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

