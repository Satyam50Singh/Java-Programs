package NewPackage;


/**
 * Write a description of class Constructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class A
{
    A()
    {
        System.out.println("Apple");
    }
} 
public class ConstructorCalling
{
    ConstructorCalling()
    {
        System.out.println("Mango");
    }
    public static void main(String[] args)
    {
        ConstructorCalling C1=new ConstructorCalling();
        
    }
}
