package javaPrograms;
/*
 * There are 4 different type of Access Specifier : Public Private Protected Default
 * We use accessSpecifier with class and members.

 * Outer class can have only two Acess specifier i.e.: public and default.
 * Inner class can use all Acess specifier.
 * 
 * We can import only those classes from different packages which are defined with public access Speciier in their package.
 * Private or Protected data members cannot be accessible from any other class. 
 * 
 */
import NewPackage.Import;
public class AcessSpecifier//Outer class
{
    int x;
    public static void main(String []args)
    {
        Import obj1=new Import();
        obj1.Display();
        Dummy obj2=new Dummy();
        obj2.Value();
    }
    
}
class Dummy //Inner class
{
    void Value()
    {
        AcessSpecifier obj=new AcessSpecifier();
        obj.x=5;
        System.out.println("Value of x is :"+obj.x);
    }
}
