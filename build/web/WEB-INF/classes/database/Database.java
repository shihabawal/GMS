/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Shihab
 */
public abstract class Database {

    protected Connection connection;
    protected String DBURL, DBUSER, DBPASS;

    public abstract void connectionDetails(String url, String user, String pass) 
            throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException ;

    public Object[][] doQuery(String sql) throws SQLException, ClassNotFoundException {
        Object resultArr[][];
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        Statement queryStatement;
        queryStatement = connection.createStatement();
        ResultSet resultSet = queryStatement.executeQuery(sql);
        int cols = resultSet.getMetaData().getColumnCount();
        int rows = getRows(resultSet);
        resultArr = new Object[rows][cols];
        while (resultSet.next()) {
            int row = resultSet.getRow();
            for (int i = 1; i <= cols; i++) {
                Object obj = resultSet.getObject(i);
                if (obj == null) {
                    resultArr[row - 1][i - 1] = null;
                } else {
                    resultArr[row - 1][i - 1] = obj;
                }
            }
        }
        connection.close();
        return resultArr;
    }

    private int getRows(ResultSet resultSet) throws SQLException {
        resultSet.last();
        int rows = resultSet.getRow();
        resultSet.beforeFirst();
        return rows;
    }

    public boolean doInsert(String sql) throws SQLException {
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        Statement queryStatement;
        queryStatement = connection.createStatement();
        boolean result = queryStatement.execute(sql);
        connection.close();
        return result;
    }

    public int doUpdate(String sql) throws SQLException {
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        Statement queryStatement;
        queryStatement = connection.createStatement();
        int result = queryStatement.executeUpdate(sql);
        connection.close();
        return result;
    }

    public boolean doDelete(String sql) throws SQLException {
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        Statement queryStatement;
        queryStatement = connection.createStatement();
        boolean result = queryStatement.execute(sql);
        connection.close();
        return result;
    }
}
