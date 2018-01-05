/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import schedulingsystem.classpak.StudentClass;

/**
 *
 * @author jvl6013
 */
public class ClassUI {

    private DefaultListModel listModel;
    DefaultTableModel tbm;
    JComboBox depComboBox;
    JButton addButton, delButton, editButton;
    
    public JTable classTable;
    ClassUI() {
        //Initial Frame and Panel setup
        JFrame frame = new JFrame("Admin");
        frame.setSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(2, 3));

        //Setting up column names and populating classes
        String[] columnNames = {"Class Name",
            "Class Description",
            "Class Start Time",
            "Class End Time",
            "Credit"};
        
        tbm = new DefaultTableModel(columnNames, 0);
        TableModel model = tbm; 
        classTable = new JTable(model);
        classTable.setDefaultEditor(Object.class, null);

        setTableColumnLength(); //setup column length
        JScrollPane scrollPane = new JScrollPane(classTable);
        
        //Enroll button setup
        JButton enrollButton = new JButton("Enroll (Not Implemented)");
        enrollButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame successFrame = new JFrame("Succesfully Enrolled");
                JPanel successPanel = new JPanel(new BorderLayout());
                JLabel successLabel = new JLabel("You've succesfully enrolled.");
                successLabel.setHorizontalAlignment(0);
                JButton successButton = new JButton("Ok");
                successButton.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        successFrame.dispose();
                    }
                });
                successPanel.add(successLabel, BorderLayout.CENTER);
                successPanel.add(successButton, BorderLayout.SOUTH);
                successFrame.add(successPanel);

                successFrame.setSize(new Dimension(200, 150));
                successFrame.setVisible(true);
            }
        });
        
        //View schedule button setup
        JButton viewSchButton = new JButton("View My Schedule (Not Implemented)");
        viewSchButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame successFrame = new JFrame("My Schedule");
                JPanel successPanel = new JPanel(new BorderLayout());
                
                successFrame.add(successPanel);

                successFrame.setSize(new Dimension(500, 150));
                successFrame.setVisible(true);
            }
        });
        
        //Class add button setup
        addButton = new JButton("Add Class");
        
        
        //Class delete button setup
        delButton = new JButton("Delete Button");
        
        
        //Class edit button setup
        editButton = new JButton("Edit Button");
        
        //Department combo box setup
        String[] departments = {"Information Science and Technology", "Math", "Engineering", "Liberal Art", "Communication" };
        
        depComboBox = new JComboBox(departments);
        
        
        //Putting all he components together.
        jp.add(depComboBox, BorderLayout.NORTH);
        jp.add(scrollPane, BorderLayout.CENTER);
        buttonPanel.add(addButton);
        buttonPanel.add(delButton);
        buttonPanel.add(editButton);
        buttonPanel.add(enrollButton);
        buttonPanel.add(viewSchButton);
        jp.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(jp);
        frame.setVisible(true);
    }
    
    public void setTableModel(DefaultTableModel tbm){
        this.tbm = tbm;
        classTable.setModel(tbm);      
        classTable.repaint();
    }
    
    public void setTableColumnLength(){
        classTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        classTable.getColumnModel().getColumn(1).setPreferredWidth(400);
        classTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        classTable.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    

}
