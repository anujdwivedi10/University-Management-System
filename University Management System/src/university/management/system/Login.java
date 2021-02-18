/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//to perform event after certain action
import java.sql.*;

public class Login extends JFrame implements ActionListener
{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login()
    {

        super("Login");
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(50,30,100,30);
        l1.setFont(new Font("serif",Font.ITALIC,18));
//        l1.setFont(new Font("serif",Font.HANGING_BASELINE,15));
        l1.setForeground(Color.black);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(50,80,100,30);
        l2.setFont(new Font("serif",Font.ITALIC,18));
        l2.setForeground(Color.black);
        add(l2);
                               //
        t1=new JTextField();
        t1.setBounds(150,30,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,80,150,30);
        add(t2);
                             //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/loginph.png"));
        Image i2 = i1.getImage().getScaledInstance(180,175,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(360,30,150,140);
        add(l3);

//
        b1 = new JButton("Login");
        b1.setBounds(50,160,120,40);
        b1.setFont(new Font("serif",Font.ITALIC,16));
        b1.addActionListener(this);
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(200,160,120,40);
        b2.setFont(new Font("serif",Font.ITALIC,16));
        b2.setBackground(Color.red);
        b2.setForeground(Color.black);
        add(b2);

        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.cyan);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
    try
    {
        conn c1 = new conn();
        String u = t1.getText();
        String v = t2.getText();

        String q = "select * from login where username='" + u + "' and password='" + v + "'";

        ResultSet rs = c1.s.executeQuery(q);
        if (rs.next())
        {
            new Project().setVisible(true);
            setVisible(false);
        }
        else
            {
            JOptionPane.showMessageDialog(null, "Invalid login");
            setVisible(false);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}
else if(ae.getSource()==b2)
{
    System.exit(0);
}
    }
    public static void main(String[] arg)
    {
        Login l = new Login();
    }
}