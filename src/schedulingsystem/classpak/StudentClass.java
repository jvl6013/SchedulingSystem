/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem.classpak;

import schedulingsystem.classpak.Class;
import java.sql.Time;
import java.time.LocalTime;
import java.time.Period;
import schedulingsystem.Instructor;

/**
 *
 * @author jvl6013
 */
public class StudentClass implements Class{
    String classID, name, info;
    int credit, duration;
    Time startClassTime, endClassTime;
    
    
    Instructor inst;
    
    public StudentClass(String name, String info, int startHour, int startMin, int duration, int credit){
        this.name = name;
        this.info = info;
        this.credit = credit;
        this.duration = duration;
        
        startClassTime = new Time(startHour, startMin, 0);
        endClassTime = new Time(startHour, startMin + duration, 0);
        
        generateClassID();
    }
    
    public void setClassName(String name){
        this.name = name;
    }
    
    public void setClassInfo(String info){
        this.info = info;
    }
    
    public String getClassName(){
        return name;
    }
    
    public int getClassCredit(){
        return credit;
    }
        
    public String getClassInfo(){
        return info;
    }
    
    public String getClassID(){
        return classID;
    }
    
    public Time getStartClassTime(){
        return startClassTime;
    }
    
    public Time getEndClassTime(){
        return endClassTime;
    }
    
    public String timeToString(Time t){
        if(t.getHours() > 12){
            t.setHours(t.getHours() + 12);
        }
        
        String min = t.getMinutes() + "";
        if(t.getMinutes() == 0){
            min = "00";
        }
        if(t.getMinutes() < 10){
            min = "0" + t.getMinutes();
        }
        return t.getHours() + ":" + min;
    }
    
    public int getDuration(){
        return duration;
    }
    
    private void generateClassID(){
        //generate classID code...
        classID = "0000A1";
    }
        
    public Object[] getStudentClass(){
        Object[] data = {name, info, timeToString(startClassTime), timeToString(endClassTime), credit};
        return data;
    }
    
    public void setClassCredit(int credit){
        this.credit = credit;
    }
   
}
