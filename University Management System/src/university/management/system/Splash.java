package university.management.system;

import java.awt.*;//graphic and user interface toolkit(abstract window tolkit)
import javax.swing.*;//use to create desk application
import javax.swing.plaf.basic.DefaultMenuLayout;

public class Splash
{
    public static void main(String s[])
    {
        Frame f = new Frame("Chitkara University");
        f.setVisible(true);//by default every frame is false
        int i;
        int x=1;
        f.setLocation(240,95);
        for(i=2;i<=600;i+=4,x+=1)
        {
//            f.setLocation(250,100);//to open in differnet angle
            f.setSize(i+3*x,i+x/2);

            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Frame extends JFrame implements Runnable
{
    // crating thread class object explicitly
    Thread t1;
    Frame(String s)
    {
        super(s);
        setLayout(new FlowLayout());           // border layout is the default Layout
        // to take image Imageicon  is used
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/start2.jpg"));
        //setting the size of image
        Image i1 = c1.getImage().getScaledInstance(1350, 640,Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);//use to display a single line of read only text
        add(m1);
        t1 = new Thread(this);
        t1.start();     //   it will implicitly call run method

        // but if we call run by ourself then it will not work according to multithreading
    }
    public void run()
    {
        try
        {
            Thread.sleep(8000);
            this.setVisible(false);      // by default all frames are hidden
            new Login();
            
        }
        catch(Exception e)
        {
            e.printStackTrace(); 
        }
    }
}