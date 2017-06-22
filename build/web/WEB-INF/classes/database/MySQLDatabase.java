/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shihab
 */
public class MySQLDatabase extends Database {

    @Override
    public void connectionDetails(String url, String user, String pass)
            throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        DBURL = url;
        DBUSER = user;
        DBPASS = pass;
        //DriverManager.registerDriver(new com.mysql.fabric.jdbc.FabricMySQLDriver());
        Class.forName("com.mysql.jdbc.Driver");
    }
}
