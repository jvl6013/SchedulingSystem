/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem.classpak;

/**
 *
 * @author jvl6013
 */
public interface Class {
    
    void setClassName(String name);
    
    void setClassInfo(String info);
            
    String getClassName();
    
    String getClassInfo();
    
    String getClassID();

}
