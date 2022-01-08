package BasicPrograms;

import java.util.*;
/** Program to print fibonacci series upto n.*/
class Series
{
    private int n,first,second=1,nxttrm;
    void fibonacci(int n)
    {
        System.out.println("Series upto "+n+" is :");
        for(int i=0; i<n; i++)
        {
            System.out.print(first+"  ");
            nxttrm=first+second;
            first=second;
            second=nxttrm;
        }
    }
}
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        System.out.println("Program to print fibonacci series upto n.");
        Scanner S1=new Scanner(System.in);
        Series obj=new Series();
        System.out.println("Enter the value of n :");
        int n=S1.nextInt();
        obj.fibonacci(n);
        
    }
}
