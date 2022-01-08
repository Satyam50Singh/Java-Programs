
package javaPrograms;


/**
 * Constructor With Inheritance.
 
 * Super keyword is used to call Parent class constructor.
 * super must be the first statement in the constructor.
 * for calling default constructor we write : "super();"
 * And for Parameterised constructor we write : "super(arguments);"
 */
class A
{
    private int x;
    public A(int p)
    {
        x=p;
        System.out.println("Class A And X is "+x);
    }
}
class B extends A
{
    public B()
    {
        super(12);    //Calling of A class Constructor explicitly.
        System.out.println("class B");
    }
}
public class ConstInheritance
{
    public static void main(String []args)
    {
            B obj=new B();       
    }    
}
