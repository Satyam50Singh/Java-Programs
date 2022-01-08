package javaPrograms;

/*
 * final keyword can use in 5 differents ways :
 :-final Instance variable
 :-final static variable
 :-final Local Variable
 :-final Class
 :-final method
 */
final class Jump    //final class
{
    
}
class Example   
{
    public final void Funny()   //final method 
    {
        System.out.println("Funny Funtion");
    }
}
public class FinalKeyword
{
    private final int x;  //Final Instance variable
    private final static int y;   //final static variable
    static
    {
        y=10;
        System.out.println("Value of Y is :"+y);
    }
    FinalKeyword()
    {
        x=10;
        System.out.println("Value of X is :"+x);        
    }
    public void fun()
    {
        final int var;    //final Local Variable
        System.out.println("Value of Local Variable :"+(var=12));
    }
    public static void main(String []args)
    {
        FinalKeyword obj=new FinalKeyword();
        obj.fun();
        
        Example obj2=new Example();
        obj2.Funny();
        
        Exam obj3=new Exam();
        obj3.Funny();
    }
}
