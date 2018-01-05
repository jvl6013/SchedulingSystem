/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem.classpak;

import schedulingsystem.classpak.Class;
import java.util.ArrayList;
import schedulingsystem.Instructor;

/**
 *
 * @author jvl6013
 */
public class InstructorClass implements Class{
    String classID, name, info;
    Instructor inst;
    int classSize;
    Roster roster;
    
    public InstructorClass(String name, String info, int classSize){
        this.name = name;
        this.info = info;
        this.classSize = classSize;
        
        roster = new Roster(classSize);
        
        generateClassID();
    }
    
    public void setClassSize(int cap){
        this.classSize = cap;
    }
    
    public void setClassName(String name){
        this.name = name;
    }
    
    public void setClassInfo(String info){
        this.info = info;
    }
    
    public int getClassSize(){
        return classSize;
    }

    public String getClassName() {
        return name;
    }

    public String getClassInfo() {
        return info;
    }

    public String getClassID() {
        return classID;
    }
    
    private void generateClassID(){
        //generate classID code...
        classID = "0000B1";
    }
    
    
}
