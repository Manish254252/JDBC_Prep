package com.student_manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_Dao {

    public static boolean insertStudentToDb(Student s1)
    {

        boolean f=false;
        // Jdbc code

        try {

            Connection con = Cp.createC();
            String q = "insert into student(sName,email,phone) values(?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, s1.getName());
            pstmt.setString(2, s1.getEmail());
            pstmt.setString(3, s1.getPhone());

            pstmt.executeUpdate();
            f=true;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }

    public static boolean deleteStudent(int id) {

        boolean f=false;
        // Jdbc code

        try {

            Connection con = Cp.createC();
            String q = "delete from student where sid=?";

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setInt(1, id);


            pstmt.executeUpdate();
            f=true;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }

    public static void showAll() {

        // Jdbc code

        try {

            Connection con = Cp.createC();
            String q = "select * from student";

            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(q);

            while(set.next())
            {
                int id = set.getInt(1);
                String name= set.getString(2);
                String Email= set.getString(3);
                String phone= set.getString(4);

                System.out.println("StudentID :"+id);
                System.out.println("StudentName :"+name);
                System.out.println("StudentEmail :"+Email);
                System.out.println("StudentPhone :"+phone);
                System.out.println("#######################################");
            }





        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
