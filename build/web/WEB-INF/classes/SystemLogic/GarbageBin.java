/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

import database.MySQLDatabase;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shihab
 */
public class GarbageBin {

    private Integer ID;
    private String emirate, area;
    private Double lng, lat, percentage;
    private MySQLDatabase db;
    private String url = "jdbc:mysql://localhost:3306";
    private String user = "shihab";
    private String pass = "awalshihab";
    
    public GarbageBin(){
        db = new MySQLDatabase();
        this.ID = new Integer(0);
        this.emirate = "";
        this.area = "";
        this.lng = new Double(0);
        this.lat = new Double(0);
        this.percentage = new Double(0);
        try {
            db.connectionDetails(url, user, pass);
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
    
    public GarbageBin(Integer ID, String emirate, String area, Double lng, Double lat, Double percentage){
        db = new MySQLDatabase();
        try {
            db.connectionDetails(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.ID = ID;
        this.emirate = emirate;
        this.area = area;
        this.lng = lng;
        this.lat = lat;
        this.percentage = percentage;
    }
    
    public Long numberOfBins(){
        String sql = "select count(*) from sys.garbagebin;";
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
    
    public boolean viewBin(Integer ID) {
        String sql = "select * from sys.garbagebin where ID=" + ID + ";";
        Object[][] res;
        try {
            res = db.doQuery(sql);
            if (res.length==0)
                return false;
            this.ID = (Integer)res[0][0];
            this.emirate = (String)res[0][1];
            this.area = (String)res[0][2];
            this.lng = (Double)res[0][3];
            this.lat = (Double)res[0][4];
            this.percentage = (Double)res[0][5];
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Object[][] viewBinByArea(String text) {
        String sql = "select * from sys.garbagebin where area like '%" + text + "%' or emirate like '%"  + text + "%';";
        Object[][] res = new Object[0][0];
        try {
            res = db.doQuery(sql);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public Object[][] viewFullBins() {
        String sql = "select * from sys.garbagebin where percentage>66.0;";
        Object[][] res = new Object[0][0];
        try {
            res = db.doQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public boolean insertBin() {
        String sql = "insert into sys.garbagebin values(" + this.ID + ",'" + this.emirate + "','" 
                + this.area + "'," + this.lng + "," + this.lat + "," + this.percentage + ")";
        try {
            db.doInsert(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
    public boolean deleteBin() {
        String sql = "delete from sys.garbagebin where ID=" + this.ID + ";";
        try {
            db.doDelete(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int editBin() {
        String sql = "UPDATE sys.garbagebin SET ID=" + this.ID + 
                ", emirate='" + this .emirate +  
                "', area='" + this.area +
                "', coordinatelong=" + this.lng + 
                ", coordinatelat=" + this.lat + 
                ", percentage=" + this.percentage +
                " WHERE ID=" + this.ID + ";" ;
        try {
            return db.doUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(GarbageBin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -2;
    }
    
    double getGarbageLevel() {
        viewBin(this.ID);
        return this.percentage;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEmirate() {
        return emirate;
    }

    public void setEmirate(String emirate) {
        this.emirate = emirate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
