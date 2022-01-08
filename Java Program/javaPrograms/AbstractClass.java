package javaPrograms;

abstract class Teacher
{
    private String name;
    private int age;
    abstract void progamDocumentation();
    public void getData(String s, int a)
    {
        name=s;
        age=a;
    }
    public void showData()
    {
        System.out.println("Teacher's Details\nName :"+name+"\nAge :"+age);
    }
}
class Student extends Teacher
{
    private int rollno;
    private String Name;
    public void progamDocumentation()    {
        System.out.println("A simple program to illustrate the concept of abstract class.\n");
    }
    public void getRollno(String N,int r)    {
        Name=N;        rollno=r;
    }
    public void showRollno()
    {   System.out.println("\nStudent's Details\nName :"+Name+"\nRollno :"+rollno);    }
}
public class AbstractClass
{
    public static void main(String []args)
    {
        Teacher obj=new Student();
        obj.progamDocumentation();
        obj.getData("Deepti",28);
        obj.showData();
        
        Student obj2=new Student();
        obj.getData("Navin",26);
        obj.showData();
        obj2.getRollno("Satyam",121);
        obj2.showRollno();
    }
}
