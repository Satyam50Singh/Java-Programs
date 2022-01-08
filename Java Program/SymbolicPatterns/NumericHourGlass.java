package SymbolicPatterns;

import java.util.*;
public class NumericHourGlass
{
    public static void main(String[] args)
    {
        int n,p;
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        n=S1.nextInt();
        for(int i=0; i<n; i++)
        {
            int x=1;
            for(int j=1; j<=i; j++)
                System.out.print("  ");
            for(int k=n-1; k>=i; k--)
                System.out.print((x++)+" ");
            for(int l=n-1-i; l>=1; l--)
                System.out.print(l+" ");
                System.out.print("\n");
        }
        for(int i=1; i<n; i++)
        {
            int x=1;
            for(int j=n-1; j>i; j--)
            System.out.print("  ");
            for(int k=0; k<=i; k++)
            System.out.print((x++)+" ");
            p=i;
            for(int k=1; k<=i; k++)
                System.out.print((p--)+" ");
            System.out.print("\n");
        }
    }
}
