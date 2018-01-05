/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

/**
 *
 * @author jvl6013
 */
public abstract class User {
    String fName, lName, id;
    
    public User(){

    }
    
    public void generateID(){
        id = "0001A";
    }
    
    public String getName(){
        return fName + " " + lName;
    }
    
    public void setName(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }
    
    public String getID(){
        return id;
    }
}
