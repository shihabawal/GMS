/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

import database.MySQLDatabase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shihab
 */
public class GarbageBinTest {
    
    public GarbageBinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of viewBin method, of class GarbageBin.
     */
    @Test
    public void testViewBin() {
        System.out.println("viewBin");
        Integer ID = 3;
        GarbageBin instance = new GarbageBin();
        boolean expResult = true;
        boolean result = instance.viewBin(ID);
        assertEquals(expResult, result);
      
    }

//    /**
//     * Test of viewBinByArea method, of class GarbageBin.
//     */
//    @Test
//    public void testViewBinByArea() {
//        System.out.println("viewBinByArea");
//        String text = "Ajman";
//        GarbageBin instance = new GarbageBin();
//        Object[][] expResult = null;
//        Object[][] result = instance.viewBinByArea(text);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of viewFullBins method, of class GarbageBin.
//     */
//    @Test
//    public void testViewFullBins() {
//        System.out.println("viewFullBins");
//        GarbageBin instance = new GarbageBin();
//        Object[][] expResult = null;
//        Object[][] result = instance.viewFullBins();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of insertBin method, of class GarbageBin.
//     */
//    @Test
//    public void testInsertBin() {
//        System.out.println("insertBin");
//        GarbageBin instance = new GarbageBin();
//        boolean expResult = false;
//        boolean result = instance.insertBin();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteBin method, of class GarbageBin.
//     */
//    @Test
//    public void testDeleteBin() {
//        System.out.println("deleteBin");
//        GarbageBin instance = new GarbageBin();
//        boolean expResult = false;
//        boolean result = instance.deleteBin();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editBin method, of class GarbageBin.
//     */
//    @Test
//    public void testEditBin() {
//        System.out.println("editBin");
//        GarbageBin instance = new GarbageBin();
//        int expResult = 0;
//        int result = instance.editBin();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGarbageLevel method, of class GarbageBin.
//     */
//    @Test
//    public void testGetGarbageLevel() {
//        System.out.println("getGarbageLevel");
//        GarbageBin instance = new GarbageBin();
//        double expResult = 0.0;
//        double result = instance.getGarbageLevel();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getID method, of class GarbageBin.
//     */
//    @Test
//    public void testGetID() {
//        System.out.println("getID");
//        GarbageBin instance = new GarbageBin();
//        Integer expResult = null;
//        Integer result = instance.getID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setID method, of class GarbageBin.
//     */
//    @Test
//    public void testSetID() {
//        System.out.println("setID");
//        Integer ID = null;
//        GarbageBin instance = new GarbageBin();
//        instance.setID(ID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEmirate method, of class GarbageBin.
//     */
//    @Test
//    public void testGetEmirate() {
//        System.out.println("getEmirate");
//        GarbageBin instance = new GarbageBin();
//        String expResult = "";
//        String result = instance.getEmirate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEmirate method, of class GarbageBin.
//     */
//    @Test
//    public void testSetEmirate() {
//        System.out.println("setEmirate");
//        String emirate = "";
//        GarbageBin instance = new GarbageBin();
//        instance.setEmirate(emirate);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getArea method, of class GarbageBin.
//     */
//    @Test
//    public void testGetArea() {
//        System.out.println("getArea");
//        GarbageBin instance = new GarbageBin();
//        String expResult = "";
//        String result = instance.getArea();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setArea method, of class GarbageBin.
//     */
//    @Test
//    public void testSetArea() {
//        System.out.println("setArea");
//        String area = "";
//        GarbageBin instance = new GarbageBin();
//        instance.setArea(area);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLng method, of class GarbageBin.
//     */
//    @Test
//    public void testGetLng() {
//        System.out.println("getLng");
//        GarbageBin instance = new GarbageBin();
//        Double expResult = null;
//        Double result = instance.getLng();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLng method, of class GarbageBin.
//     */
//    @Test
//    public void testSetLng() {
//        System.out.println("setLng");
//        Double lng = null;
//        GarbageBin instance = new GarbageBin();
//        instance.setLng(lng);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLat method, of class GarbageBin.
//     */
//    @Test
//    public void testGetLat() {
//        System.out.println("getLat");
//        GarbageBin instance = new GarbageBin();
//        Double expResult = null;
//        Double result = instance.getLat();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLat method, of class GarbageBin.
//     */
//    @Test
//    public void testSetLat() {
//        System.out.println("setLat");
//        Double lat = null;
//        GarbageBin instance = new GarbageBin();
//        instance.setLat(lat);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPercentage method, of class GarbageBin.
//     */
//    @Test
//    public void testGetPercentage() {
//        System.out.println("getPercentage");
//        GarbageBin instance = new GarbageBin();
//        Double expResult = null;
//        Double result = instance.getPercentage();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPercentage method, of class GarbageBin.
//     */
//    @Test
//    public void testSetPercentage() {
//        System.out.println("setPercentage");
//        Double percentage = null;
//        GarbageBin instance = new GarbageBin();
//        instance.setPercentage(percentage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDb method, of class GarbageBin.
//     */
//    @Test
//    public void testGetDb() {
//        System.out.println("getDb");
//        GarbageBin instance = new GarbageBin();
//        MySQLDatabase expResult = null;
//        MySQLDatabase result = instance.getDb();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDb method, of class GarbageBin.
//     */
//    @Test
//    public void testSetDb() {
//        System.out.println("setDb");
//        MySQLDatabase db = null;
//        GarbageBin instance = new GarbageBin();
//        instance.setDb(db);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUrl method, of class GarbageBin.
//     */
//    @Test
//    public void testGetUrl() {
//        System.out.println("getUrl");
//        GarbageBin instance = new GarbageBin();
//        String expResult = "";
//        String result = instance.getUrl();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUrl method, of class GarbageBin.
//     */
//    @Test
//    public void testSetUrl() {
//        System.out.println("setUrl");
//        String url = "";
//        GarbageBin instance = new GarbageBin();
//        instance.setUrl(url);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUser method, of class GarbageBin.
//     */
//    @Test
//    public void testGetUser() {
//        System.out.println("getUser");
//        GarbageBin instance = new GarbageBin();
//        String expResult = "";
//        String result = instance.getUser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUser method, of class GarbageBin.
//     */
//    @Test
//    public void testSetUser() {
//        System.out.println("setUser");
//        String user = "";
//        GarbageBin instance = new GarbageBin();
//        instance.setUser(user);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPass method, of class GarbageBin.
//     */
//    @Test
//    public void testGetPass() {
//        System.out.println("getPass");
//        GarbageBin instance = new GarbageBin();
//        String expResult = "";
//        String result = instance.getPass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPass method, of class GarbageBin.
//     */
//    @Test
//    public void testSetPass() {
//        System.out.println("setPass");
//        String pass = "";
//        GarbageBin instance = new GarbageBin();
//        instance.setPass(pass);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
