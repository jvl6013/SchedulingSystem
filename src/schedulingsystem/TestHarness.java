/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import schedulingsystem.classpak.StudentClass;
import schedulingsystem.classpak.InstructorClass;
import schedulingsystem.classpak.Class;
import java.util.ArrayList;

/**
 *
 * @author jvl6013
 */
public class TestHarness {
    
    public TestHarness(){
        //MODEL CLASS #1: STUDENT
        Student st = new Student("Owen", "Lee", "IST", 1);
        st.enrollClass(001);
        st.enrollClass(002);
        st.dropClass(001);
        
        if(st != null){
            System.out.println("Test student created successfully");
            System.out.println("Student info: " + st.getID() + 
                               " " + st.getName() + " " + st.getStudentMajor());
            //Change the Object
            st.setStudentMajor("SRA");
            st.setName("John", "Oliver");
            System.out.println("Student info: " + st.getID() + 
                               " " + st.getName() + " " + st.getStudentMajor());
            
            st.getStudentSchedule();
            System.out.println("Student schedule created and loaded,");
        }
        
        //MODEL CLASS #2: CLASS
        StudentClass cl = new StudentClass("IST210", "Organization of Data (3)", 2, 30, 70, 3);
        
        if(cl != null){
            System.out.println("Test class created successfully");
            System.out.println("Class info: " + cl.getClassName() + " " + cl.getClassInfo() + " " + cl.getClassID());
            //Change the Object
            cl.setClassName("IST261");
            cl.setClassInfo("Application Development Design Studio I");
            System.out.println("Class info: " + cl.getClassName() + " " + cl.getClassInfo() + " " + cl.getClassID());  
        }
        
        //Inheritance Test
        testClassHierarchy();
        
        //Interface Test
        testInterface();
        
        System.out.println("All the tests are passed!");
    }
    
    public void testClassHierarchy(){
        ArrayList<User> al = new ArrayList();
        System.out.println("Array List of User type is created.");
        
        Student st1 = new Student("Stan", "Smith", "ENG", 3);
        Instructor is1 = new Instructor("Hugh", "Mongus", "COMM");
        al.add(st1);
        al.add(is1);
        System.out.println("Student and Instructor classes created and added to the arraylist successfully");
        
        for(User i : al){
            i.generateID();
            System.out.println("ID: " + i.getID());
        }
    }
    
    public void testInterface(){
        ArrayList<Class> al = new ArrayList();
        
        StudentClass sc1 = new StudentClass("IST210", "Data and Organization", 12, 05, 70, 3);
        InstructorClass is1 = new InstructorClass("IST230", "Discrete Math", 20);
        al.add(sc1);
        al.add(is1);
        System.out.println("Student Class and Instructor Class created and added to the arraylist successfully");
        
        for(Class i : al){
            System.out.println("Name: " + i.getClassName());
            System.out.println("ID: " + i.getClassID());
            System.out.println("Info: " + i.getClassInfo());
        }
    }
}
