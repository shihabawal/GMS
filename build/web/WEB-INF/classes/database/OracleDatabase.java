/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;

/**
 *
 * @author Shihab
 */
public class OracleDatabase extends Database {

    @Override
    public void connectionDetails(String url, String user, String pass) 
        throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        DBURL = url;
        DBUSER = user;
        DBPASS = pass;
        Class.forName("com.mysql.fabric.jdbc.FabricMySQLDriver");
    }
    
}
