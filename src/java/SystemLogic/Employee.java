/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

import database.MySQLDatabase;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shihab
 */
public class Employee {

    protected MySQLDatabase db;
    protected String url = "jdbc:mysql://localhost:3306";
    protected String dbuser = "shihab";
    protected String dbpass = "awalshihab";
    protected int ID, MID; 
    protected String password; 
    protected String email; 
    protected String country;
    protected String fname, lname;
    protected ArrayList<GarbageBin> bins;
            

    public Employee() {
        db = new MySQLDatabase();
        bins = new ArrayList<GarbageBin>();
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

    public Employee(int ID, int MID, String password, String email, String country, String fname, String lname) {
        this.ID = ID;
        this.MID = MID;
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
    
    public Long numberOfEmployees(){
        String sql = "select count(*) from sys.employee;";
        Object[][] res;
        try {
            res = db.doQuery(sql);
            return (Long)res[0][0];
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Long(0);
    }
    
    public boolean login(String email, String pass) {
        String sql = "SELECT sys.employee.email, sys.employee.password FROM sys.employee WHERE sys.employee.email='"
                + email + "' AND sys.employee.password='" + pass + "';";
        Object[][] res;
        try {
            res = db.doQuery(sql);
            if (res.length==0)
                return false;
            else
                return true;
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

    public boolean viewEmployee(Integer ID) {
        String sql = "select * from sys.employee where ID=" + ID + ";";
        Object[][] res;
        try {
            res = db.doQuery(sql);
            System.out.println(res.length);
            if (res.length==0)
                return false;
            this.ID = (Integer)res[0][0];
            this.fname = (String)res[0][1];
            this.lname = (String)res[0][2];
            this.country = (String)res[0][3];
            this.email = (String)res[0][4];
            this.password = (String)res[0][5];
            if (res[0][6] != null){
                this.MID = (Integer)res[0][6];
            } else {
                this.MID = 0;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void notifyBin(GarbageBin g){
        bins.add(g);
    }
    
    public void denotifyBin(GarbageBin g){
        bins.remove(g);
    }
    
    public void updateEmpList(){
        viewEmployee(this.ID);
    }
    
    public MySQLDatabase getDb() {
        return db;
    }

    public void setDb(MySQLDatabase db) {
        this.db = db;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public String getDbpass() {
        return dbpass;
    }

    public void setDbpass(String dbpass) {
        this.dbpass = dbpass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }   

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }    
}
