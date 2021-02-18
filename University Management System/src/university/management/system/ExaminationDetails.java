/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import net.proteanit.sql.DbUtils;             // this jar provide library to convert resultSet to TableModel

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExaminationDetails extends JFrame implements ActionListener
{

   private JPanel jp;
   private JTable table;
   private JTextField search;
   private JButton b1,b2,b3;


    public void Book()
    {
        try
        {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);      // preparedstatement is used for parameterised queries
            ResultSet rs = st.executeQuery();           // executing th query and taking data of the student table.
             // fetching the data from sql and adding it to the JTable
            table.setModel(DbUtils.resultSetToTableModel(rs));     //
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e)
        {}
    }

   public ExaminationDetails()
   {

        setBounds(180, 150, 930, 475);
        setResizable(false);
        jp = new JPanel();    // this panel contains one panel inside it and that panel contains a scrollpane and scrollpane conatins a table
        jp.setBackground(Color.WHITE);               // panel acts as a div tag in html
        jp.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(jp);
        jp.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(55, 130, 1080, 282);         // table is inside this scrollpane
        jp.add(scrollPane);
//


        table = new JTable();
        table.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg0)
            {
               int row = table.getSelectedRow();   // taking index of row which is clicked
               search.setText(table.getModel().getValueAt(row, 10).toString());
               // now taking value of 10th column(Rollnumber) of row and putting it in the search textfield
            }
        });
       
        table.setBackground(new Color(240, 248, 255));       // this rgb mthod to set color
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        scrollPane.setViewportView(table);
//



        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
//        b1.setForeground(new Color(199, 21, 133));
        b1.setForeground(Color.black);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(564, 89, 138, 33);
        jp.add(b1);
//
       
        JLabel l1 = new JLabel("CHECK RESULT");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        jp.add(l1);

//

        search = new JTextField();
        search.setBackground(Color.green);
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));  // giving multiple text style using(|)
        search.setBounds(179, 89, 357, 33);
        jp.add(search);
        search.setColumns(10);
//
        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(97, 89, 72, 33);
        jp.add(l3);

        JPanel panel = new JPanel();         // this is the inner panel
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Book-Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(45, 54, 1100, 368);
        jp.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            conn con = new conn();
            if(ae.getSource() == b1)
            {
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            };
        }
        catch(Exception e)
        {}
    }

    public static void main(String[] args)
    {
        new ExaminationDetails().setVisible(true);
    }
}