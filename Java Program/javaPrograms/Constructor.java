package javaPrograms;
//Program to implement constructor.
/*
 * Constructor is used to complete the creation of object.
 * An object does not represent any real world entity untill it data members are not initialised.
 * new class_name(); is only create object but when initialise it value then it repesent any real World Entity.
 */
/*public class Constructor
{
    private int x,y;
    /**
     * Constructor for objects of class Constructor
     */
 /*   public Constructor()
    {   System.out.println("Constructors in Java");     }
    public Constructor(int A, int B)
    {
        // initialise instance variables
        x = A;        y = B;
    }
    public int sampleMethod()
    {
        // put your code here
        return x + y;
    }
    public static void  main(String []args)
    {
        Constructor Ob=new Constructor();
        Constructor Obj=new Constructor(12,24);
        System.out.println("Addition of x and y is :"+Obj.sampleMethod());
    }
}
*/
class Cricketer
{
    String name;
    String team;
    int age;
    Cricketer()
    {
        name="";
        team="";
        age=0;
    }
    Cricketer(String n,String t,int a)
    {
        name=n;
        team=t;
        age=a;
    }
    Cricketer (Cricketer ckt)
    {
        name=ckt.name;
        team=ckt.team;
        age=ckt.age;
    }
    public String sum()
    {
        return name;
    }
    public String toString()
    {
        return "this is "+name+" of "+team;
    }
}
class Test//Constructor Chaining Example
{
    Test()
    {
        this(10);
    }
    Test(int x)
    {
        System.out.println("X is :"+x);
    }
}
public class Constructor
{
    public static void main(String[] args)
    {
        Cricketer C1=new Cricketer();
        Cricketer C2=new Cricketer("Sachin","India",32);
        Cricketer C3=new Cricketer(C2);
        
        System.out.println(C2);
        System.out.println(C3);
        C1.name="Virat";
        C1.team="India";
        C1.age=32;
        System.out.println(C1);
        
        Test T1=new Test();
    }

}