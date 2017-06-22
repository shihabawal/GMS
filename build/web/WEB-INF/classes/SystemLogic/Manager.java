/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

import database.MySQLDatabase;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bashayer
 */
public class Manager extends Employee {
    
    public Manager() {
        db = new MySQLDatabase();
        try {
            db.connectionDetails(url, dbuser, dbpass);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Manager(int ID, String password, String email, String country, String fname, String lname) {
        this.ID = ID;
        this.password = password;
        this.email = email;
        this.country = country;
        this.fname = fname;
        this.lname = lname;
        this.db = new MySQLDatabase();
        try {
            db.connectionDetails(url, dbuser, dbpass);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean login(String email, String pass) {
        String sql = "SELECT sys.employee.email, sys.employee.password FROM sys.employee WHERE sys.employee.email='"
                + email + "' AND sys.employee.password='" + pass + "' AND MID IS NULL;";
        Object[][] res;
        System.out.println(sql);
        try {
            res = db.doQuery(sql);
            if (res.length == 0) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Iterator<Throwable> i = ex.iterator();
            while (i.hasNext()) {
                System.out.println(i.next().getMessage());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getException().getMessage());
        }
        return false;
    }

    public boolean insertEmp() {
        String sql = "insert into sys.employee values(" + this.ID + ",'" + this.fname + "','"
                + this.lname + "','" + this.country + "','" + this.email + "','" + this.password  + "'," + this.MID + ")";
        try {
            db.doInsert(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteEmp() {
        String sql = "delete from sys.employee where ID=" + this.ID + ";";
        try {
            db.doDelete(sql);
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int editEmp() {
        String sql = "UPDATE sys.employee SET ID=" + this.ID
                + ", password='" + this.password
                + "', email='" + this.email
                + "', country='" + this.country
                + "', fname='" + this.fname
                + "', lname='" + this.lname
                + "', MID=" + this.MID
                + " WHERE ID=" + this.ID + ";";
        try {
            return db.doUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -2;
    }
}
