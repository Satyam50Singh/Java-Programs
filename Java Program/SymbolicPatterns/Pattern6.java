package SymbolicPatterns;

import java.util.*;
public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter Odd No. of rows :- ");
        int val=1,n=S1.nextInt();
        for(int i=0; i<n; i+=2)
        {
            val=1;
            for(int j=n-2; j>=i; j--)
            System.out.print("  ");
            for(int k=0; k<=i; k++)
                System.out.print((val++)+"   ");
            System.out.print("\n");
        }
        for(int i=0; i<n; i+=2)
        {
            val=1;
            for(int j=0; j<=i+1; j++)
            System.out.print("  ");
            for(int k=n-2; k>i; k--)
                System.out.print((val++)+"   ");
            System.out.print("\n");
        }
    }
}
