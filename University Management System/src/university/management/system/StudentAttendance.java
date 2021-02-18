/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener
{
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    StudentAttendance()
    {
       super("Add Student Attendance");
        setLayout(new GridLayout(4,2,50,50));       // (row ,column,length,breath)
        c2 = new Choice();
        try
        {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next())
            {
                c2.add(rs.getString("rollno"));     // adding all rollnumbers from stuent table to choice
            }
      
      
       }
        catch(Exception e)
        {

        }
       
        add(new JLabel("Select Roll Number"));
        add(c2);
      
        l1 = new JLabel("First Half");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
//
        add(l1);
        add(fh);
        
        l2 = new JLabel("Second Half");
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");
       
        add(l2);
        add(sh);
    //
        b1 =new JButton("Submit");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
//
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        setResizable(false);
        setSize(400,450);
        setLocation(600,200);
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();    // if util package imported then writ only (new Date().tostring())
        String id = c2.getSelectedItem();
        String qry = "insert into attendance_student values('"+id+ "','"+dt+"','"+f+"','"+s+"')";
        if(ae.getSource()==b1)
        {
            try
            {
                conn c1 = new conn();
                c1.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null, "Attendance confirmed");
                this.setVisible(false);
            }
            catch (Exception ee)
            {
                ee.printStackTrace();
            }
        }
        else if(ae.getSource()==b2)
        {
            setVisible(false);
            new Project().setVisible(true);
        }
    }
    
    public static void main(String s[])
    {
        new StudentAttendance();
    }
}
