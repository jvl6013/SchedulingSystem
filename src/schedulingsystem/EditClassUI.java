/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import schedulingsystem.classpak.StudentClass;

/**
 *
 * @author fivewen
 */
public class EditClassUI {
    JComboBox stClassTimeCB, classDurationCB, creditComboBox, depComboBox;
    JButton editButton;
    JTextField classNameField, classDescField;
    
    public EditClassUI(){
        
        
        JFrame editFrame = new JFrame("Edit Class");
        
        JPanel editPanel = new JPanel();
        
        editPanel.setLayout(new BoxLayout(editPanel, BoxLayout.Y_AXIS));
        editFrame.add(editPanel);

        editFrame.setSize(new Dimension(400, 600));
        editFrame.setVisible(true);
        
        String[] departments = {"Information Science and Technology", "Math", "Engineering", "Liberal Art", "Communication" };
        depComboBox = new JComboBox(departments);
        
        JLabel department = new JLabel("Department");
        JLabel className = new JLabel("Class Name: ");
        JLabel classDesc = new JLabel("Class Description: ");
        JLabel stClassTime = new JLabel("Class Start Time: ");
        JLabel classDuration = new JLabel("Class End Time: ");
        JLabel credit = new JLabel("Credit: ");
        
        
        
        classNameField = new JTextField();
        classNameField.setPreferredSize(new Dimension(400, 20));
        classNameField.setMaximumSize(classNameField.getPreferredSize());

        classDescField = new JTextField();
        classDescField.setPreferredSize(new Dimension(400, 80));
        classDescField.setMaximumSize(classDescField.getPreferredSize());

        String[] stTimes = {"8:00", "8:50", "9:05", "9:30", "10:10", 
                            "10:25", "11:10", "11:40","12:05", "12:25",
                            "1:00", "1:35", "2:00","2:30", "2:50", "3:05",
                            "3:45", "4:35", "5:00","6:00", "6:30",};
        stClassTimeCB = new JComboBox(stTimes);

        Object[] duration = {50, 70, 90, 120, 180};
        classDurationCB = new JComboBox(duration);     

        Object[] credits = {1, 2, 3, 4, 5};
        creditComboBox = new JComboBox(credits);

        editButton = new JButton("Save Class");
        
        
        editPanel.add(department);
        editPanel.add(depComboBox);
        editPanel.add(className);
        editPanel.add(classNameField);
        editPanel.add(classDesc);
        editPanel.add(classDescField);
        editPanel.add(stClassTime);
        editPanel.add(stClassTimeCB);
        editPanel.add(classDuration);
        editPanel.add(classDurationCB);
        editPanel.add(credit);
        editPanel.add(creditComboBox);
        editPanel.add(editButton);
        
        editFrame.add(editPanel);
        
        
        
    }
    
    private int[] selectClassTime(){
        String timeSlot = (String)stClassTimeCB.getSelectedItem();
        int[] hourAndMin = new int[2];
        switch(timeSlot){
            case "8:00AM":
                hourAndMin[0] = 8;
                hourAndMin[1] = 0;
                break;
            case "8:05AM":
                hourAndMin[0] = 8;
                hourAndMin[1] = 5;
                break;
            case "9:05AM":
                hourAndMin[0] = 9;
                hourAndMin[1] = 5;
                break;
            case "9:30AM":
                hourAndMin[0] = 9;
                hourAndMin[1] = 30;
                break;
            case "10:10AM":
                hourAndMin[0] = 10;
                hourAndMin[1] = 10;
                break;
            case "10:25AM":
                hourAndMin[0] = 10;
                hourAndMin[1] = 25;
                break;
            case "11:10AM":
                hourAndMin[0] = 11;
                hourAndMin[1] = 10;
                break;
            case "11:40AM":
                hourAndMin[0] = 11;
                hourAndMin[1] = 40;
                break;
            case "12:05AM":
                hourAndMin[0] = 12;
                hourAndMin[1] = 05;
                break;
            case "12:25AM":
                hourAndMin[0] = 12;
                hourAndMin[1] = 25;
                break;
            case "1:00PM":
                hourAndMin[0] = 1;
                hourAndMin[1] = 0;
                break;
            case "1:35PM":
                hourAndMin[0] = 1;
                hourAndMin[1] = 35;
                break;
            case "2:00PM":
                hourAndMin[0] = 2;
                hourAndMin[1] = 0;
                break;
            case "2:30PM":
                hourAndMin[0] = 2;
                hourAndMin[1] = 30;
                break;
            case "2:50PM":
                hourAndMin[0] = 2;
                hourAndMin[1] = 50;
                break;
            case "3:05PM":
                hourAndMin[0] = 3;
                hourAndMin[1] = 05;
                break;
            case "3:45PM":
                hourAndMin[0] = 3;
                hourAndMin[1] = 45;
                break;
            case "4:35PM":
                hourAndMin[0] = 4;
                hourAndMin[1] = 35;
                break;
            case "5:00PM":
                hourAndMin[0] = 5;
                hourAndMin[1] = 0;
                break;
            case "6:00PM":
                hourAndMin[0] = 6;
                hourAndMin[1] = 0;
                break;
            case "6:30PM":
                hourAndMin[0] = 6;
                hourAndMin[1] = 30;
                break;       
        }
        
        return hourAndMin;
    }
    
    public StudentClass getSelectedInfo(){
        return new StudentClass(classNameField.getText(), classDescField.getText(), selectClassTime()[0], selectClassTime()[1], (int)classDurationCB.getSelectedItem(), (int)creditComboBox.getSelectedItem());
    }
    
}
