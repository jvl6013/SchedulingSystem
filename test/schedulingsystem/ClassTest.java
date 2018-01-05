/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import schedulingsystem.classpak.StudentClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvl6013
 */
public class ClassTest {
    
    public ClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setClassName method, of class StudentClass.
     */
    @Test
    public void testSetClassName() {
        System.out.println("setClassName");
        String name = "INART050";
        StudentClass instance = new StudentClass("N/A", "The Science of Music");
        instance.setClassName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassInfo method, of class StudentClass.
     */
    @Test
    public void testSetClassInfo() {
        System.out.println("setClassInfo");
        String info = "International Business Goes to the Movies";
        StudentClass instance = new StudentClass("IB290", "N/A");
        instance.setClassInfo(info);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassName method, of class StudentClass.
     */
    @Test
    public void testGetClassName() {
        System.out.println("getClassName");
        StudentClass instance = new StudentClass("IST331", "Foundations of Human-Centered Design");
        String expResult = "IST331";
        String result = instance.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassInfo method, of class StudentClass.
     */
    @Test
    public void testGetClassInfo() {
        System.out.println("getClassInfo");
        StudentClass instance = new StudentClass("IST261", "Application Development Design Studio I");
        String expResult = "Application Development Design Studio I";
        String result = instance.getClassInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassID method, of class StudentClass.
     */
    @Test
    public void testGetClassID() {
        System.out.println("getClassID");
        StudentClass instance = new StudentClass("IST361", "Application Development Design Studio II");
        String expResult = "0000A1";
        String result = instance.getClassID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
