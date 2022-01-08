package javaPrograms;
// Main use of super keyword is to invoke the superclass version of the method from the subclass.
class Parent
{
    private int l,b;
    int z;  //instance Variable
    Parent()    //Parent class Constructor
    {
        this(12);
    }
    Parent(int i)
    {
        System.out.println("Parent Class Constructor");
    }
    public void Naming()
    {
        System.out.println("Parent Class Naming() method");
    }
    public void Area(int l,int b)
    {
        this.l=l;
        this.b=b;
        System.out.println("Area is of Rectangle is :"+(this.l*this.b));
    }
}
class Child extends Parent
{
    private float r;
    int z;
    Child() //Child class Constructor
    {
        super(12);
    }
    public void Naming()
    {
        super.Naming();
        System.out.println("Child Class Naming() method");        
    }
    public void Circumference(float rad)
    {
        this.Naming();
        r=rad;
        System.out.println("Circumference of Circle is :"+(2*3.14*r));
    }
    public void showValues()
    {
        int z;  //local variable
        System.out.println("Value of z(Local Variable of f2() method) :"+(z=10));
        System.out.println("Value of z(instace Variable of Parent Class):"+(super.z=20));
        System.out.println("Value of z(instace Variable of Child Class):"+(this.z=30));
    }
}
public class SuperKeyword
{
    public static void main(String []args)
    {
        Parent P1=new Parent();
        Child obj=new Child();
        obj.Area(12,2); //Parent Class method called
        obj.Circumference(12.5f);   //Child Class method called
        obj.showValues();
    }
}
