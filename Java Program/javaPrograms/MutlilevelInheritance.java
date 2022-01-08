package javaPrograms;

class Person
{
    private int age;
    private String name;
    public void getData(int a, String n)
    {
        age=a;  name=n;
    }
    public int showAge()
    {   return age; }
    public String showName()
    {   return name; }
}

class Teacher extends Person
{
    private int salary;
    public void getSalary(int s)
    {   salary=s;   }
    public int showSalary()
    {   return salary; }
}

class Student extends Teacher
{
    private int fees;
    public void getFees(int f)
    {   fees=f;   }
    public int showFees()
    {   return fees; }
}

public class MutlilevelInheritance
{
    public static void main(String []args)
    {
           Student obj=new Student();

           obj.getData(19,"Satyam");
           obj.getSalary(12000);
           obj.getFees(5500);
           System.out.println("Student no . : 1\n");
           System.out.println("Name is :"+obj.showName());
           System.out.println("Age is :"+obj.showAge());
           System.out.println("Teacher's Salary :"+obj.showSalary());
           System.out.println("Student's Fees :"+obj.showFees());

           Student obj2=new Student();
           System.out.println("\nStudent no . : 2\n");
           obj2.getData(19,"Tanu");
           obj2.getSalary(18000);
           obj2.getFees(4500);
           
           System.out.println("Name is :"+obj2.showName());
           System.out.println("Age is :"+obj2.showAge());
           System.out.println("Teacher's Salary :"+obj2.showSalary());
           System.out.println("Student's Fees :"+obj2.showFees());
    }
}
