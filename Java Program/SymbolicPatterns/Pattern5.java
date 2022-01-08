package SymbolicPatterns;

import java.util.*;
public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter No. of rows :- ");        
        int n=S1.nextInt();
        int val=1;
        for(int i=0; i<n; i++)
        {
            val=1;
            for(int j=n-2; j>=i; j--)
            System.out.print("  ");
            for(int k=0; k<=i; k++)
                System.out.print((val++)+"   ");
            System.out.print("\n");
        }
        for(int i=0; i<n; i++)
        {
            val=1;
            for(int j=0; j<=i; j++)
            System.out.print("  ");
            for(int k=n-2; k>=i; k--)
                System.out.print((val++)+"   ");
            System.out.print("\n");
        }
    }
}
