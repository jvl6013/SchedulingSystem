package schedulingsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import schedulingsystem.classpak.StudentClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jvl6013
 */
public class ClassCtrl {
    String[] columnNames = {"Class Name",
            "Class Description",
            "Class Start Time",
            "Class End Time",
            "Credit"};
    ClassUI cui = new ClassUI();
    AddClassUI acu;
    
    public ClassCtrl(){
        ClassList istClasses = new ClassList("Information Science and Technology");
        ClassList commClasses = new ClassList("Communication");
        ClassList mathClasses = new ClassList("Math");
        ClassList libartClasses = new ClassList("Liberal Art");
        ClassList engineClasses = new ClassList("Engineering");
        
        istClasses.addClass(new StudentClass("IST261", "Application Development Design Studio I", 3, 45, 70, 3));
        istClasses.addClass(new StudentClass("IST361", "Application Development Design Studio I", 8, 00, 50, 4));
        commClasses.addClass(new StudentClass("COMM110", "Application Development Design Studio I", 12, 05, 70, 3));
        commClasses.addClass(new StudentClass("COMM330", "Application Development Design Studio II", 2, 30, 70, 3));
        mathClasses.addClass(new StudentClass("Math140", "Calculus I", 11, 50, 50, 4));
        mathClasses.addClass(new StudentClass("Math141", "Calculus II", 2, 00, 50, 4));
        libartClasses.addClass(new StudentClass("ENGL197H", "Anti-Portraits in Modern Literature and Visual Arts", 1, 50, 70, 3));
        libartClasses.addClass(new StudentClass("RUS197H", "Conspiracy Theories and Contemporary Culture", 6, 0, 180, 1));
        
        cui.classTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    StudentClass sc = new StudentClass("IST261", "Application Development Design Studio I", 3, 45, 70, 3);
                    ClassDetailUI cdui = new ClassDetailUI(sc);
                }
            }
        });
        
        cui.depComboBox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox)e.getSource();
                String depName = (String)cb.getSelectedItem();
                
                switch(depName){
                    case "Information Science and Technology":
                        setJTable(istClasses);
                        break;
                    case "Math":
                        setJTable(mathClasses);
                        break;
                    case "Engineering":
                        setJTable(engineClasses);
                        break;
                    case "Liberal Art":
                        setJTable(libartClasses);
                        break;
                    case "Communication":
                        setJTable(commClasses);
                        break;
                }
            }
        });
        
        setJTable(istClasses);
        
        cui.addButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                acu = new AddClassUI();
                acu.addButton.addActionListener(new ActionListener()
                {    
                    public void actionPerformed(ActionEvent e)
                    {
                        StudentClass sc = acu.getSelectedInfo();

                        System.out.println(sc.getClassInfo());
                        System.out.println(sc.getStartClassTime().getHours() + ":" + sc.getStartClassTime().getMinutes());
                        System.out.println(sc.getEndClassTime().getHours() +  ":" + sc.getEndClassTime().getMinutes());
                        
                        String depName = (String)acu.depComboBox.getSelectedItem();
                
                        switch(depName){
                            case "Information Science and Technology":
                                istClasses.addClass(sc);
                                setJTable(istClasses);
                                break;
                            case "Math":
                                mathClasses.addClass(sc);
                                setJTable(mathClasses);
                                break;
                            case "Engineering":
                                engineClasses.addClass(sc);
                                setJTable(engineClasses);
                                break;
                            case "Liberal Art":
                                libartClasses.addClass(sc);
                                setJTable(libartClasses);
                                break;
                            case "Communication":
                                commClasses.addClass(sc);
                                setJTable(commClasses);
                                break;
                        }

                    }
                });
            }
        });
        
        cui.delButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String depName = (String)cui.depComboBox.getSelectedItem();
                
                switch(depName){
                case "Information Science and Technology":
                    istClasses.classes.remove(cui.classTable.getSelectedRow());
                    setJTable(istClasses.classes);
                    break;
                case "Math":
                    mathClasses.classes.remove(cui.classTable.getSelectedRow());
                    setJTable(mathClasses.classes);
                    break;
                case "Engineering":
                    engineClasses.classes.remove(cui.classTable.getSelectedRow());
                    setJTable(engineClasses.classes);
                    break;
                case "Liberal Art":
                    libartClasses.classes.remove(cui.classTable.getSelectedRow());
                    setJTable(libartClasses.classes);
                    break;
                case "Communication":
                    commClasses.classes.remove(cui.classTable.getSelectedRow());
                    setJTable(commClasses.classes);
                    break;
                }
            }
        });
        
        cui.editButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                EditClassUI ecu = new EditClassUI();
                
                String depName = (String)cui.depComboBox.getSelectedItem();
                
                
                switch(depName){
                case "Information Science and Technology":
                    ecu.classNameField.setText(istClasses.classes.get(cui.classTable.getSelectedRow()).getClassName());
                    ecu.classDescField.setText(istClasses.classes.get(cui.classTable.getSelectedRow()).getClassInfo());
                    ecu.depComboBox.setSelectedIndex(cui.depComboBox.getSelectedIndex());
                    ecu.classDurationCB.setSelectedIndex(getDurationIndex(istClasses.classes.get(cui.classTable.getSelectedRow()).getDuration()));
                    ecu.creditComboBox.setSelectedIndex(istClasses.classes.get(cui.classTable.getSelectedRow()).getClassCredit() - 1);
                    ecu.stClassTimeCB.setSelectedIndex(getClassTimeIndex(istClasses.classes.get(cui.classTable.getSelectedRow()).getStartClassTime()));
                    break;
                case "Math":
                    ecu.classNameField.setText(mathClasses.classes.get(cui.classTable.getSelectedRow()).getClassName());
                    ecu.classDescField.setText(mathClasses.classes.get(cui.classTable.getSelectedRow()).getClassInfo());
                    ecu.depComboBox.setSelectedIndex(cui.depComboBox.getSelectedIndex());
                    ecu.classDurationCB.setSelectedIndex(getDurationIndex(mathClasses.classes.get(cui.classTable.getSelectedRow()).getDuration()));
                    ecu.creditComboBox.setSelectedIndex(mathClasses.classes.get(cui.classTable.getSelectedRow()).getClassCredit() - 1);
                    ecu.stClassTimeCB.setSelectedIndex(getClassTimeIndex(mathClasses.classes.get(cui.classTable.getSelectedRow()).getStartClassTime()));
                    break;
                case "Engineering":
                    ecu.classNameField.setText(engineClasses.classes.get(cui.classTable.getSelectedRow()).getClassName());
                    ecu.classDescField.setText(engineClasses.classes.get(cui.classTable.getSelectedRow()).getClassInfo());
                    ecu.depComboBox.setSelectedIndex(cui.depComboBox.getSelectedIndex());
                    ecu.classDurationCB.setSelectedIndex(getDurationIndex(engineClasses.classes.get(cui.classTable.getSelectedRow()).getDuration()));
                    ecu.creditComboBox.setSelectedIndex(engineClasses.classes.get(cui.classTable.getSelectedRow()).getClassCredit() - 1);
                    ecu.stClassTimeCB.setSelectedIndex(getClassTimeIndex(engineClasses.classes.get(cui.classTable.getSelectedRow()).getStartClassTime()));
                    break;
                case "Liberal Art":
                    ecu.classNameField.setText(libartClasses.classes.get(cui.classTable.getSelectedRow()).getClassName());
                    ecu.classDescField.setText(libartClasses.classes.get(cui.classTable.getSelectedRow()).getClassInfo());
                    ecu.depComboBox.setSelectedIndex(cui.depComboBox.getSelectedIndex());
                    ecu.classDurationCB.setSelectedIndex(getDurationIndex(libartClasses.classes.get(cui.classTable.getSelectedRow()).getDuration()));
                    ecu.creditComboBox.setSelectedIndex(libartClasses.classes.get(cui.classTable.getSelectedRow()).getClassCredit() - 1);
                    ecu.stClassTimeCB.setSelectedIndex(getClassTimeIndex(libartClasses.classes.get(cui.classTable.getSelectedRow()).getStartClassTime()));
                    break;
                case "Communication":
                    ecu.classNameField.setText(commClasses.classes.get(cui.classTable.getSelectedRow()).getClassName());
                    ecu.classDescField.setText(commClasses.classes.get(cui.classTable.getSelectedRow()).getClassInfo());
                    ecu.depComboBox.setSelectedIndex(cui.depComboBox.getSelectedIndex());
                    ecu.classDurationCB.setSelectedIndex(getDurationIndex(commClasses.classes.get(cui.classTable.getSelectedRow()).getDuration()));
                    ecu.creditComboBox.setSelectedIndex(commClasses.classes.get(cui.classTable.getSelectedRow()).getClassCredit() - 1);
                    ecu.stClassTimeCB.setSelectedIndex(getClassTimeIndex(commClasses.classes.get(cui.classTable.getSelectedRow()).getStartClassTime()));
                    break;
                }
                
                ecu.editButton.addActionListener(new ActionListener()
                {    
                    public void actionPerformed(ActionEvent e)
                    {
                        String depName = (String)ecu.depComboBox.getSelectedItem();
                
                        switch(depName){
                            case "Information Science and Technology":
                                istClasses.classes.get(cui.classTable.getSelectedRow()).setClassName(ecu.classNameField.getText());
                                istClasses.classes.get(cui.classTable.getSelectedRow()).setClassInfo(ecu.classDescField.getText());
                                
                                setJTable(istClasses);
                                break;
                            case "Math":
                                mathClasses.classes.get(cui.classTable.getSelectedRow()).setClassName(ecu.classNameField.getText());
                                mathClasses.classes.get(cui.classTable.getSelectedRow()).setClassInfo(ecu.classDescField.getText());
                                setJTable(mathClasses);
                                break;
                            case "Engineering":
                                engineClasses.classes.get(cui.classTable.getSelectedRow()).setClassName(ecu.classNameField.getText());
                                engineClasses.classes.get(cui.classTable.getSelectedRow()).setClassInfo(ecu.classDescField.getText());
                                setJTable(engineClasses);
                                break;
                            case "Liberal Art":
                                libartClasses.classes.get(cui.classTable.getSelectedRow()).setClassName(ecu.classNameField.getText());
                                libartClasses.classes.get(cui.classTable.getSelectedRow()).setClassInfo(ecu.classDescField.getText());
                                setJTable(libartClasses);
                                break;
                            case "Communication":
                                commClasses.classes.get(cui.classTable.getSelectedRow()).setClassName(ecu.classNameField.getText());
                                commClasses.classes.get(cui.classTable.getSelectedRow()).setClassInfo(ecu.classDescField.getText());
                                setJTable(commClasses);
                                break;
                        }
                    }
                });  
            }
        });
    }
    
    private void setJTable(ClassList cl){
        
        DefaultTableModel tm = new DefaultTableModel(columnNames, 0);

        for (int i = 0; i < cl.getArrayList().size(); i++){
            String className = ((StudentClass)(cl.getArrayList().get(i))).getClassName();
            String classDesc = ((StudentClass)(cl.getArrayList().get(i))).getClassInfo();
            String startTime = ((StudentClass)(cl.getArrayList().get(i))).getStartClassTime().toString();
            String endTime = ((StudentClass)(cl.getArrayList().get(i))).getEndClassTime().toString();
            String credit = ((StudentClass)(cl.getArrayList().get(i))).getClassCredit() + "";
            
            Object[] data = {className, classDesc, startTime, endTime, credit};
            
            tm.addRow(data);
        }

        cui.setTableModel(tm);
        cui.setTableColumnLength();
    }
    
    public int getClassTimeIndex(Time ct){
        int returnValue = 0;
        String switchValue;
        if(ct.getMinutes() < 10){
            switchValue = ct.getHours() + ":0" + ct.getMinutes();
        }
        else{
            switchValue = ct.getHours() + ":" + ct.getMinutes();
        }
        
        switch(switchValue){
            case "8:00":
                returnValue = 0;
                break;
            case "8:50":
                returnValue = 1;
                break;
            case "9:05":
                returnValue = 2;
                break;
            case "9:30":
                returnValue = 3;
                break;
            case "10:10":
                returnValue = 4;
                break;
            case "10:25":
                returnValue = 5;
                break;
            case "11:10":
                returnValue = 6;
                break;
            case "11:40":
                returnValue = 7;
                break;
            case "12:05":
                returnValue = 8;
                break;
            case "12:25":
                returnValue = 9;
                break;
            case "1:00":
                returnValue = 10;
                break;
            case "1:35":
                returnValue = 11;
                break;
            case "2:00":
                returnValue = 12;
                break;
            case "2:30":
                returnValue = 13;
                break;
            case "2:50":
                returnValue = 14;
                break;
            case "3:05":
                returnValue = 15;
                break;
            case "3:45":
                returnValue = 16;
                break;
            case "4:35":
                returnValue = 17;
                break;
            case "5:00":
                returnValue = 18;
                break;
            case "6:00":
                returnValue = 19;
                break;
            case "6:30":
                returnValue = 20;
                break;
        }
        
        return returnValue;
    }
    
    public int getDurationIndex(int durationMinutes){
        int returnValue = 0;
        switch(durationMinutes){
            case 50:    
                returnValue = 0;
                break;
            case 70:
                returnValue = 1;
                break;
            case 90:
                returnValue = 2;
                break;
            case 120:
                returnValue = 3;
                break;
            case 180:
                returnValue = 4;
                break;
        }
        
        return returnValue;
    }
    
    private void setJTable(ArrayList al){
        
        DefaultTableModel tm = new DefaultTableModel(columnNames, 0);

        for (int i = 0; i < al.size(); i++){
            String className = ((StudentClass)(al.get(i))).getClassName();
            String classDesc = ((StudentClass)(al.get(i))).getClassInfo();
            String startTime = ((StudentClass)(al.get(i))).getStartClassTime().toString();
            String endTime = ((StudentClass)(al.get(i))).getEndClassTime().toString();
            String credit = ((StudentClass)(al.get(i))).getClassCredit() + "";
            
            Object[] data = {className, classDesc, startTime, endTime, credit};
            
            tm.addRow(data);
        }

        cui.setTableModel(tm);
        cui.setTableColumnLength();
    }
}
