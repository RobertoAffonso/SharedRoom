package com.sharedroom.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Roberto Affonso, created on 5/11/18
 **/

public class DatabaseConnection  {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    public static final String MAX_POOL = "250";

    private Connection connection;
    private Properties properties;

    private Properties getProperties() {
        if(properties == null){
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }

        return properties;
    }

    public Connection connect(){
        if(connection == null){
            try{
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            }
            catch(ClassNotFoundException | SQLException ex){
                ex.printStackTrace();
            }
        }
        return connection;
    }

    public void disconnect(){
        if(connection != null){
            try{
                connection.close();
                connection = null;
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
