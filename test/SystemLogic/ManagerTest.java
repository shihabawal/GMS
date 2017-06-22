/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

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
public class ManagerTest {
    
    public ManagerTest() {
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

//    /**
//     * Test of login method, of class Manager.
//     */
//    @Test
//    public void testLogin() {
//        System.out.println("login");
//        String email = "hunter99@gms.com";
//        String pass = "kzoldyck";
//        Manager instance = new Manager();
//        boolean expResult = true;
//        boolean result = instance.login(email, pass);
//        assertEquals(expResult, result);
//    }


    /**
     * Test of deleteEmp method, of class Manager.
     */
    @Test
    public void testDeleteEmp() {
        System.out.println("deleteEmp");
        Manager instance = new Manager();
        instance.setID(6);
        boolean expResult = true;
        boolean result = instance.deleteEmp();
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of editEmp method, of class Manager.
//     */
//    @Test
//    public void testEditEmp() {
//        System.out.println("editEmp");
//        Manager instance = new Manager();
//        int expResult = 0;
//        int result = instance.editEmp();
//        assertEquals(expResult, result);
//    }
    
}
