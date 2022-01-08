package SymbolicPatterns;


import java.util.*;
public class HourGlassPattern
{
    public static void main(String[] args)
    {
        System.out.print("HOUR-GLASS PATTERN\n\nEnter number of rows :- ");
        Scanner S1=new Scanner(System.in);
        int n=S1.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            System.out.print(" ");
            for(int k=n-1; k>=i; k--)
            System.out.print("*");
            for(int j=n-2; j>=i; j--)
            System.out.print("*");
            System.out.print("\n");
        }
        for(int i=0; i<n; i++)
        {
            for(int k=n-1; k>=i; k--)
            System.out.print(" ");
            for(int j=0; j<=i; j++)
            System.out.print("*");
            for(int l=1; l<=i; l++)
            System.out.print("*");
            System.out.print("\n");
        }
    }
}
