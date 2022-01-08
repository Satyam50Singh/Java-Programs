package SymbolicPatterns;
import java.util.*;
class Test
{
    private int n;
    Test(int n)
    {   this.n=n;   }
    void pattern()
    {
        System.out.print("\n\t  Alpha Rays\t\t ");
        for(int i=0; i<n/3; i++)
        System.out.print("\t");
        System.out.print("Gold Foil\n\n");
        for(int i=0; i<n; i++)
        {
            if(i==0 || i==(n-1))
            {
                for(int j=0; j<n; j++)
                    System.out.print("* ");
                for(int j=0; j<n; j++)
                    System.out.print("  ");
                for(int j=0; j<n; j++)
                    System.out.print("* ");
            }
            else
            {
                for(int k=0; k<n; k++)
                {
                    if(k==0 || k==n-1 )
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.print(">>");
                for(int j=0; j<n-2; j++)
                    System.out.print("--");
                System.out.print("> ");
                for(int k=0; k<n; k++)
                {
                    if(k==0 || k==n-1||k==(n-n/3)+1||k==n/4|| k==n/2)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            }
                System.out.print("\n");
        }
                System.out.println("\t\t\tFIG : ALPHA RAYS BOMBARDING ON GOLD FOIL");
    }
}
public class Pattern10
{
    private static int n;
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("\nEnter no. of rows :-");
        n=S1.nextInt();
        Test T1=new Test(n);
        T1.pattern();
    }
}
/*
 
* * * * *          * * * * *
*       * >>-----> *       *
*       * >>-----> *       *
*       * >>-----> *       *
* * * * *          * * * * *

                            */