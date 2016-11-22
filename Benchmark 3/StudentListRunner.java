
/**
 * Write a description of class StudentListRunner here.
 * 
 * Luis Oliver Juarez
 */
import java.util.*;
public class StudentListRunner 
{
    public static void main(String args[]) 
    {
        System.out.print("\f");
        menuNumber();
    }
    public static void menuNumber() 
    {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        String input = " ";
        while(!input.equals("q")) 
        {
            System.out.println("1. Add a student");
            System.out.println("2. Print student list");
            System.out.println("3: What is the name of the student you want to delete?");
            System.out.println("q: End program");
            System.out.println("What would you like to do?");
            input = sc.nextLine();
            //Clears the screen
            System.out.print("\f");
            if(input.equals("1")){
                String name;
                int id;
                double gpa;
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("\nID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("\nGPA: ");
                gpa = sc.nextDouble();
                System.out.println();
                list.addStudent(name, id, gpa);
            }
            else if(input.equals("2")) 
            {
                System.out.print("\f");
                list.printStudent();
            }
            
            else if(input.equals("3"))
            {
                System.out.print("\f");
                System.out.println("What is the name of the student you want to delete?");
                String msg = sc.nextLine();
                list.deleteStudentFromList(msg);
                
            }
        }
    }
}
