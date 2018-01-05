/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem.classpak;

import java.util.ArrayList;
import schedulingsystem.Student;

/**
 *
 * @author jvl6013
 */
public class Roster {
    ArrayList<String> roster;
    Roster(int size){
        roster = new ArrayList();
    }
    
    public void addStudent(Student st){
        roster.add(st.getID());
    }
    
    public void dropStudent(){
        //drop a studnet;
    }
    
    public ArrayList<String> getRoster(){
        return roster;
    }
}
