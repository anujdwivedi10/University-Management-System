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

public class StudentAttendanceDetail extends JFrame implements ActionListener
{
  
    JTable j1;
    JButton b1;
    String h[]={"Roll Number","Date Time","First Half","Second Half"};
    String d[][]=new String[25][4];    // 15 rows and 4 columns of table
    int i=0,j=0;
    
    StudentAttendanceDetail()
    {
        super("Students Attendence Record");

        setResizable(false);
        setSize(800,400);
        setLocation(380,180);

        try
        {
            String q="select * from attendance_student";       // taking data from atteendance_student table
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next())
            {                        // now filling values in table
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("first");
                d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);      // JTable(2D array, 1D array)

        }
        catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);       // adding scroll pane to table
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            j1.print();         // by default print method
        }
        catch(Exception e)
        {}
    }
    
    public static void main(String[] args)
    {
        new StudentAttendanceDetail().setVisible(true);
    }
}