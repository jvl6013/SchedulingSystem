/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import schedulingsystem.classpak.StudentClass;


public class ClassDetailUI {
    public ClassDetailUI(StudentClass sc){
        JFrame detailFrame = new JFrame("Detailed Class Info");
        detailFrame.setSize(new Dimension(400, 500));
        JPanel detailPanel = new JPanel(new BorderLayout());
        
        JLabel detailLabel = new JLabel(sc.getClassName() + ": " + sc.getClassInfo());
        detailLabel.setHorizontalAlignment(JLabel.CENTER);
        
        String paragraph = "\nThis is test paragraph, it doesn't add any information. "
                + "However this shows the text on the text area. I have to implement reading txt file "
                + "so that it can read the detailed class information.";
        
        paragraph = autoLineBreak(paragraph);
        
        JTextArea detailTextArea = new JTextArea(10, 10);
        detailTextArea.setEditable(false);
        detailTextArea.setText(sc.getClassName() + " (" + sc.getClassCredit() + ")\n" + "Detailed Information:\n" + paragraph);
        
        detailPanel.add(detailLabel, BorderLayout.NORTH);
        detailPanel.add(detailTextArea, BorderLayout.CENTER);
        
        
        
        detailFrame.add(detailPanel);
        detailFrame.setVisible(true);
    }
    
    public String autoLineBreak(String paragraph){
        String fixedPara = paragraph;
        
        fixedPara = paragraph.substring(0, 63) + "\n";
        if(paragraph.substring(63, paragraph.length()).length() > 63){
            fixedPara = fixedPara + autoLineBreak(paragraph.substring(63, paragraph.length()));
        }
        
        return fixedPara;
    }
}
