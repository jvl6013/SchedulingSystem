/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import schedulingsystem.classpak.StudentClass;
import java.util.ArrayList;

/**
 *
 * @author jvl6013
 */
public class ClassList {
    ArrayList<StudentClass> classes;
    String depName;
    
    public ClassList(String depName){
        classes = new ArrayList<StudentClass>();
        this.depName = depName;
    }
    
    public void addClass(StudentClass c){
        classes.add(c);
    }
    
    public ArrayList getArrayList(){
        return classes;
    }
}
