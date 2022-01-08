package SymbolicPatterns;

import java.util.*;
public class DiamondPattern
{
    public static void main(String[] args)
    {
        System.out.print("DIAMOND PATTERN\n\nEnter Number of rows :- ");
        Scanner S1=new Scanner(System.in);
        int n=S1.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>=i; j--)
            System.out.print(" ");
            for(int k=0; k<=i; k++)
            System.out.print("*");
            for(int l=1; l<=i; l++)
            System.out.print("*");
            System.out.print("\n");
        }
        
        for(int i=1; i<n; i++)
        {
            for(int k=0; k<=i; k++)
            System.out.print(" ");
            for(int j=n-1; j>=i; j--)
            System.out.print("*");
            for(int k=n-2; k>=i; k--)
            System.out.print("*");
            System.out.print("\n");
        }        
    }
}
