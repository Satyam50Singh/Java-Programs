package javaPrograms;
/**
 * Overriding is defining a method in subclass with the same signature with specific implementation in respect to the subclass.
 */
class Example1
{
    Example1()
    {
        System.out.println("Constructor of Example1 Class");
    }
    public void Fun(String name)    //Overriding fn
    {
        System.out.println("\nExample1 class");
    }
}
class Example2 extends Example1
{
    Example2()
    {
        System.out.println("Constructor of Example2 Class");
    }
    public void Fun(String name)    //Overridden fn
    {
        System.out.println("Example2 class");
    }
}
public class Overridding
{
    public static void main(String[] args)
    {
        Example2 obj=new Example2();
        obj.Fun("Class Example2 ");  //Calling Overriding fn
        Example1 obj2=new Example1();
        obj2.Fun("Class Example1 "); //Calling Overridden fn
        Example1 obj3=new Example2();
        obj3.Fun("Satyam"); //Calling Overridden fn
        
    }
}
