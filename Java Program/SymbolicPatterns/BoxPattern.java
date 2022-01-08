package SymbolicPatterns;


import java.util.*;
public class BoxPattern
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        int n=S1.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int l=n-1; l>=i; l--)
                System.out.print("* ");
            for(int j=1; j<=(2*i); j++)
                System.out.print("  ");
            for(int k=n-1; k>=i; k--)
                System.out.print("* ");
                System.out.print("\n");
        }
        for(int i=0; i<n; i++)
        {
            for(int l=0; l<=i; l++)
                System.out.print("* ");
            for(int j=n-2; j>=i; j--)
                System.out.print("    ");
            for(int k=0; k<=i; k++)
                System.out.print("* ");
                System.out.print("\n");
        }
    }
}
