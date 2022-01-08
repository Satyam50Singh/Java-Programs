package javaPrograms;


/**
 * Classes can implement Multiple Interface  
 */

interface data      //1st Interface
{
    void getName(String Name);
    void getAge(int dob);
}
interface sDetail   //2nd Interface
{
    void getFavSubject(String Sub);
    void getRollno(int rollno);    
}
abstract class Person 
{
    abstract void getAddress(String Address);
}
class Teacher extends Person implements data    //Single Inheritance
{
    public String name;
    public String Address;
    public int age;
    private int salary;
    public void getName(String n)
    {   name=n;    }
    public void getAge(int D)
    {   age=D;    }
    public void getSalary(int s)
    {   salary=s;   }
    public void getAddress(String A)
    {   Address=A;  }
    public void showTeacherData()
    {
        System.out.println("Name is :"+name+"\nAge is :"+age+"\nAddress :"+Address+"\nSalary :"+salary+"\n");
    }
}
class Student extends Teacher implements data,sDetail   //Multiple Interface & Multilevel Inheritance 
{
    private int rollno,fees;
    private String Sub;
    public void getName(String n)
    {   name=n;    }
    public void getAge(int D)
    {   age=D;    }
    public void getRollno(int r)
    {   rollno=r;   }
    public void getFavSubject(String S)
    {   Sub=S;    }    
    public void getFees(int F)
    {   fees=F;   }
    public void showStudentData()
    {
        System.out.println("Name is :"+name+"\nAge is :"+age+"\nRollno.:"+rollno+"\nAddress :"+Address+"\nFav. Subject :"+Sub+"\nFees :"+fees+"\n");
    }
}

public class InterfaceInheritance
{
    public static void main(String []args)
    {
        System.out.println("Teacher's Details");
        Teacher T1=new Teacher();
        T1.getName("Navin");
        T1.getAge(35);
        T1.getSalary(3600);
        T1.getAddress("Delhi");
        T1.showTeacherData();
        
        System.out.println("\nStudent's Details");
        Student S1=new Student();
        S1.getName("Arun");
        S1.getAge(15);
        S1.getRollno(31);
        S1.getFavSubject("Mathematics");
        S1.getFees(1200);
        S1.getAddress("Dehradun");
        S1.showStudentData();

        System.out.println("Teacher's Details");
        Teacher T2=new Teacher();
        T2.getName("Diksha");
        T2.getAge(25);
        T2.getSalary(4600);
        T2.getAddress("Bangalore");
        T2.showTeacherData();
        
        System.out.println("\nStudent's Details");
        Student S2=new Student();
        S2.getName("Sheetal");
        S2.getAge(18);
        S2.getRollno(14);
        S2.getFavSubject("Accounts");
        S2.getFees(1800);
        S2.getAddress("UttarPradesh");
        S2.showStudentData();
    }
}
