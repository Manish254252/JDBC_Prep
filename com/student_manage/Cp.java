package com.student_manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cp {

         static  Connection con ;
    public static Connection createC()
    {


        try {

            /// load the driver

//            Class.forName("com.mysql.cj.jdbc.driver");

            /// Create connection
                String url = "jdbc:mysql://localhost:3306/student_manage";
                String user = "root";
                String password ="root123";
                con= DriverManager.getConnection(url,user,password);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return  con;
    }
}
