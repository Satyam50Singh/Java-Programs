package SymbolicPatterns;

import java.util.*;
public class NumericDiamond
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        int p1,p=S1.nextInt();
        for(int i=0; i<p; i++)
        {
            int x=1;
            for(int j=p-1; j>i; j--)
            System.out.print("  ");
            for(int k=0; k<=i; k++)
            System.out.print((x++)+" ");
            p1=i;
            for(int k=1; k<=i; k++)
                System.out.print((p1--)+" ");
            System.out.print("\n");
        }
        for(int i=1; i<p; i++)
        {
            int x=1;
            for(int j=1; j<=i; j++)
                System.out.print("  ");
            for(int k=p-1; k>=i; k--)
                System.out.print((x++)+" ");
            for(int l=p-1-i; l>=1; l--)
                System.out.print(l+" ");
                System.out.print("\n");
        }
    }
}
