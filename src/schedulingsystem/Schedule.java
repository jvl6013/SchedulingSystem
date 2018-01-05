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
class Schedule{
    ArrayList<StudentClass> schedule;
    
    public Schedule(){
        schedule = new ArrayList();
    }
    
    public ArrayList<StudentClass> getSchedule(){
        return schedule;
    }
    
    public boolean canEnroll(int classID){
        return true;
        //decide if the student can enroll the class or not
    }
    
    public boolean canDrop(int classID){
        return true;
        //decide if the student can drop the class or not
    }
    
    public void setSchedule(ArrayList<StudentClass> newSchedule){
        schedule = newSchedule;
    }
    
    public void getDaySchedule(int choice){
        //depend on choice, return corresponding day schedule.
        //Example) if choice is 3, return tuesday schedule.
    }

    public void enroll(int classId) {
        //enroll a class
    }

    public void drop(int classId) {
        //drop a class
    }
}
