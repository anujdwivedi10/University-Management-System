package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener
{
    Project()
    {
        super("University Management System");
        
        setSize(1920,1040);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/bg.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1570, 810,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
//
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Registration");
        master.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student");
        master.setForeground(Color.blue);
        
        
        m1.setFont(new Font("serif",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');                    // VK_D means D(key)       // it means control key
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.yellow);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.green);
    
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        
//
  
        JMenu user = new JMenu("Details");
        user.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.red);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.green);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.yellow);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        JMenu attendance = new JMenu("Attendance");
        attendance.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.blue);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        a1.setBackground(Color.yellow);
        attendance.add(a1);
        
        a2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image26));
        a2.setMnemonic('N');
        a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        a2.setBackground(Color.green);
        attendance.add(a2);

        a1.addActionListener(this);
        a2.addActionListener(this);
        
 //
        
        JMenu attendance_detail = new JMenu("Attendance Detail");
        attendance_detail.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setForeground(Color.RED);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        b1.setBackground(Color.green);
        attendance_detail.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image30));
        b2.setMnemonic('P');
        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        b2.setBackground(Color.yellow);
        attendance_detail.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        JMenu exam = new JMenu("Examination");
        exam.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        exam.setForeground(Color.BLUE);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.yellow);
        exam.add(c1);
        
        c2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image33));
        c2.setMnemonic('R');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        c2.setBackground(Color.green);
        exam.add(c2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        
        JMenu report = new JMenu("Update Details");
        report.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.green);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r2.setBackground(Color.yellow);
        
        r2.addActionListener(this);
        
        
   //
        
        JMenu fee = new JMenu("Fee Details");
        fee.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem s1 = new JMenuItem("Fee Structure");
//        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s1.setBackground(Color.yellow);
        
        s1.addActionListener(this);
        
//        s2.setFont(new Font("monospaced",Font.BOLD,16));
//        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon8.png"));
//        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
//        s2.setIcon(new ImageIcon(image17));
//        s2.setMnemonic('H');
//        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
//        s2.setBackground(Color.green);
//
//        s2.addActionListener(this);
        

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED); 
        

        ut1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon9.png"));
        Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image19));
        ut1.setMnemonic('I');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.green);
        

        ut2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon10.png"));
        Image image21 = icon20.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image21));
        ut2.setMnemonic('J');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.yellow);
        

        ut3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon11.png"));
        Image image10 = icon10.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('K');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.green);
        
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
//        JMenu about = new JMenu("About");
//        about.setFont(new Font("serif",Font.PLAIN,18));
//        JMenuItem aboutus = new JMenuItem("About Us");
//        about.setForeground(Color.BLUE);
//
//        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
//        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon13.jpg"));
//        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
//        aboutus.setIcon(new ImageIcon(image22));
//        aboutus.setMnemonic('L');
//        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
//        aboutus.setBackground(Color.yellow);
//        about.add(aboutus);
//        aboutus.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,18));
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.green);
        
        ex.addActionListener(this);
//
        

        master.add(m1);  // adding menuItems in Menu
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
//        fee.add(s2);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        
        exit.add(ex);
         
        mb.add(master);         // now adding Menu to the MenuBar
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
//        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);     // adding MenuBar to the Frame
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String msg = ae.getActionCommand();  // taking text which is clicked
        if(msg.equals("New Student"))
        {
            new AddStudent().f.setVisible(true);
            
        }
        else if(msg.equals("New Faculty"))
        {
            new AddTeacher().f.setVisible(true);
            
        }
        else if(msg.equals("Student Details"))
        {
            new StudentDetails().setVisible(true);
            
        }
        else if(msg.equals("Teacher Details"))
        {
            new TeacherDetails().setVisible(true);
           
        }
        else if(msg.equals("Update Students"))
        {
            new UpdateStudent().f.setVisible(true);
           
        }
        else if(msg.equals("Update Teachers"))
        {
            new UpdateTeacher().f.setVisible(true);
           
        }
        else if(msg.equals("Fee Structure"))
        {
            new FeeStructure().setVisible(true);
           
        }
//        else if(msg.equals("Student Fee Form"))
//        {
//            new StudentFeeForm().setVisible(true);
//
//        }
        else if(msg.equals("Notepad"))
        {
            try
            {  // runtime is class and getRuntime is stsic method
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            { }
        }
        else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e)
            { }
        }
        else if(msg.equals("Web Browser"))
        {
            try
            {                                 // address of web browser
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            catch(Exception e)
            { }
        }
        else if(msg.equals("Exit"))
        {
            System.exit(0);
        }
//        else if(msg.equals("About Us"))
//        {
//            new AboutUs().setVisible(true);
//        }
        else if(msg.equals("Student Attendance"))
        {
            new StudentAttendance().setVisible(true);
        }
        else if(msg.equals("Teacher Attendance"))
        {
            new TeacherAttendance().setVisible(true);
        }
        else if(msg.equals("Student Attendance Detail"))
        {
            new StudentAttendanceDetail().setVisible(true);
        }
        else if(msg.equals("Teacher Attendance Detail"))
        {
            new TeacherAttendanceDetail().setVisible(true);
        }
        else if(msg.equals("Examination Details"))
        {
            new ExaminationDetails().setVisible(true);
        }
        else if(msg.equals("Enter Marks"))
        {
            new EnterMarks().setVisible(true);
        }
    }
//
    public static void main(String[] args)
    {
        new Project().setVisible(true);
    }
    
}
