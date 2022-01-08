

package NewPackage;

import java.util.*;
interface University
{
    void getInfo();
}
interface Teacher
{
    void getTeacherInfo();
    void showData();
}
class Student implements University,Teacher
{
    Scanner S1;
    String name,uvName,course,coName;
    int year;
    Student(Scanner S1)
    {   this.S1=S1;  }
    public void getInfo()
    {
        System.out.print("\nEnter your university or Institution name : ");
        uvName=S1.nextLine();
        System.out.print("\nEnter your course : ");
        course=S1.nextLine();
    }
    public void getTeacherInfo()
    {
        System.out.print("\nEnter your coordinator name : ");
        coName=S1.nextLine();
    }
    void getPersonalDetails()
    {
        getInfo();
        getTeacherInfo();
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
public class MutipleInheritance
{
    public static void main(String[] args)
    {
        System.out.print("MutipleInheritance\n");
        Scanner S1=new Scanner(System.in);
        Student St1=new Student(S1);
        St1.getPersonalDetails();
        St1.showData();
    }
}
