package BasicPrograms;

import java.util.*;
/**Program to Calculate the Square And Cube of a number.*/
class Example
{
    private int num;
    Example(int n)
    {
        num=n;
    }
    public void calculas()
    {
        System.out.println("Square of "+num+" is :"+(num*num));    
        System.out.println("Cube of "+num+" is :"+(num*num*num));
    }
}
public class NoSquareCube
{
    public static void main(String []args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter a number :");
        int A=S1.nextInt();
        
        Example Obj=new Example(A);
        Obj.calculas();
        
    }
}
