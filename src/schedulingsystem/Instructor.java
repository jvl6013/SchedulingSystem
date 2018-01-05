/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import java.util.ArrayList;

/**
 *
 * @author jvl6013
 */
public class Instructor extends User{
    String department;
    ArrayList<Integer> teachingClasses = new ArrayList();
    
    public Instructor(String fName, String lName, String dep){
        this.fName = fName;
        this.lName = lName;
        this.department = dep;
        
        generateID();
    }
    
    public void addTeachingClass(int classID){
        teachingClasses.add(classID);
    }
    
    public void setInstDep(String dep){
        this.department = dep;
    }
    
    public String getInstDep(){
        return department;
    }
        
    public String getInstID(){
        return id;
    }

    @Override
    public void generateID() {
        //generate Instructor ID Code...
        this.id = "000001A";
    }
}
