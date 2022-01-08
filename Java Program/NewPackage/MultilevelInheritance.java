

package NewPackage;

import java.util.Scanner;
class University
{
    Scanner S1;
    public String name,uvName,course,coName;
    public int year;
    University(Scanner S)
    {   S1=S;   }
    public void getInfo()
    {
        System.out.print("\nEnter your university or Institution name : ");
        uvName=S1.nextLine();
        System.out.print("\nEnter your course : ");
        course=S1.nextLine();
    }
}
class Teacher extends University
{
    Teacher(Scanner S1)
    {   super(S1);  }
    public void getInfo()
    {
        super.getInfo();
        System.out.print("\nEnter your coordinator name : ");
        coName=S1.nextLine();
    }
}
class Student extends Teacher
{
    Student(Scanner S1)
    {   super(S1);  }
    public void getInfo()
    {
        super.getInfo();
        System.out.print("\nEnter your name : ");
        name=S1.nextLine();
        System.out.print("\nEnter your Admission year : ");
        year=S1.nextInt();
    }
    public void showData()
    {
        System.out.print("\nDetails ::\n");
        System.out.print("\nUniversity/Institute name :"+uvName+"\nCourse :"+course+"\nCoordinator Name :"+coName);
        System.out.print("\nStudent Name :"+name+"\nYear of Admission :"+year);
    }
    
}
public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Mutilevel Inheritance \n");
        Student St1=new Student(S1);
        St1.getInfo();
        St1.showData();        
    }
}
