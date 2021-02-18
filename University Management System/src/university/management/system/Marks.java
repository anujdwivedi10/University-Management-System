/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame
{

   JTextArea t1;
   JPanel p1;
   
   Marks()                                   //    in this frame textarea is used to write text
   {}
   Marks(String str)
   {
       super("Marks Info");
       setSize(500,650);
       setLocation(500,140);
       setLayout(new BorderLayout());
       setResizable(false);

       p1 = new JPanel();
       t1 = new JTextArea(55,15);             //  setting columns and rows of text area
       JScrollPane jsp = new JScrollPane(t1);              // using jscroll pane on the text area
       t1.setFont(new Font("Senserif",Font.ITALIC,24));
       t1.setBackground(Color.cyan);
       add(p1,"North");
       
       add(jsp,"Center");   // location of scroll pane ,it can be like(North,South,East,West)

       mark(str);
   }
   
   public void mark(String s)
   {
    try
    {
           conn c = new conn();
           
           t1.setText("                Result of Examination\n\n      Subject=>");
           
           ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);
           
           if(rs1.next())
           {
               t1.append("\n\t"+rs1.getString("subject1"));
               t1.append("\n\t"+rs1.getString("subject2"));
               t1.append("\n\t"+rs1.getString("subject3"));
               t1.append("\n\t"+rs1.getString("subject4"));
               t1.append("\n\t"+rs1.getString("subject5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
           }
           
           ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);
           
           if(rs2.next())
           {
               t1.append("      Marks=>\n");

               t1.append("\t" + rs2.getString("marks1"));
               t1.append("\n\t"+rs2.getString("marks2"));
               t1.append("\n\t"+rs2.getString("marks3"));
               t1.append("\n\t"+rs2.getString("marks4"));
               t1.append("\n\t"+rs2.getString("marks5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");


               int m1 = Integer.parseInt(rs2.getString("marks1"));
               int m2 = Integer.parseInt(rs2.getString("marks2"));
               int m3 = Integer.parseInt(rs2.getString("marks3"));
               int m4 = Integer.parseInt(rs2.getString("marks4"));
               int m5 = Integer.parseInt(rs2.getString("marks5"));
               int total = (m1+m2+m3+m4+m5);
               int per = (total/500)*100;

               t1.append("      Total Marks=" + total);
               t1.append("\n      Percentage=" + per+"%");
           }
         
    }
    catch(Exception e)
    {
           e.printStackTrace();
    }

   }
   
   public static void main(String[] args)
   {
       new Marks().setVisible(true);
   }
}