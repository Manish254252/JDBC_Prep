import com.student_manage.Student;
import com.student_manage.Student_Dao;

import java.util.Scanner;


public class Start {

    public static void main(String[] args) {
        System.out.println("Working perfectly......\n");
        System.out.println("Welcome to Student Management !!!\n");

        while (true)
        {
            System.out.println("Press 1 to ADD Student");
            System.out.println("Press 2 to Delete Student");
            System.out.println("Press 3 to Display Student");
            System.out.println("Press 4 to Exit Student");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice ==1)
            {
                System.out.println("You choose to Add student\n");

                System.out.println("Enter Name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter Email : ");
                String email = sc.nextLine();
                System.out.println("Enter Phone : ");
                String phone = sc.nextLine();
                Student s1 = new Student(name,email,phone);
                boolean ans = Student_Dao.insertStudentToDb(s1);
                if(ans)
                {
                    System.out.println("Student added successfully");
                }else {
                    System.out.println("Something Went wrong");
                }


            } else if (choice ==2) {
                System.out.println("Enter student Id:");
                int id = sc.nextInt();
               boolean ans = Student_Dao.deleteStudent(id);

                if(ans)
                {
                    System.out.println("Student Deleted successfully");
                }else {
                    System.out.println("Something Went wrong");
                }
                System.out.println("You choose to Delete student\n");
            } else if (choice == 3) {

                System.out.println("You choose to Display student\n");

                Student_Dao.showAll();

            } else if (choice ==4) {
                System.out.println("You are now exiting");
                System.out.println("Thank you for your time");
                System.exit(0);
            }else {
                System.out.println("Please give a valid input\n");
            }
        }
    }
}
