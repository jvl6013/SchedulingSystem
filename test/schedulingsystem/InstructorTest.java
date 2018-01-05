/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvl6013
 */
public class InstructorTest {
    
    public InstructorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addTeachingClass method, of class Instructor.
     */
    @Test
    public void testAddTeachingClass() {
        System.out.println("addTeachingClass");
        int classID = 0;
        Instructor instance = new Instructor("Lacey", "Joe", "Education");
        instance.addTeachingClass(classID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInstName method, of class Instructor.
     */
    @Test
    public void testGetInstName() {
        System.out.println("getInstName");
        Instructor instance = new Instructor("Howard", "Smtih", "Art");
        String expResult = "Howard";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInstDep method, of class Instructor.
     */
    @Test
    public void testGetInstDep() {
        System.out.println("getInstDep");
        Instructor instance = new Instructor("Fowler", "Nouri", "Communication");
        String expResult = "Communication";
        String result = instance.getInstDep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInstID method, of class Instructor.
     */
    @Test
    public void testGetInstID() {
        System.out.println("getInstID");
        Instructor instance = new Instructor("Kim", "Woomin", "Engineering");;
        String expResult = "000001A";
        String result = instance.getInstID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
