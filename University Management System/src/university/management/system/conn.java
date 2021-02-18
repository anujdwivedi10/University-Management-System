package university.management.system;

import java.sql.*;

public class conn
{
    Connection c;       // interface of sql package use to implement jdbc
    Statement s;        // interface of sql package use to implement jdbc
    public conn()
    {
        try
        {   // forName is static method
            Class.forName("com.mysql.jdbc.Driver");//to register database
            c =DriverManager.getConnection("jdbc:mysql:///ums","root","");//conection established btw databse and project
            s =c.createStatement();//use to execute mysql queries
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }

    public static void main(String[] args)
    {

    }
}  
