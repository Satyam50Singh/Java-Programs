package SymbolicPatterns;

import java.util.*;
public class TrophyPattern
{
    public static void main(String[] args)
    {
        int n;
        Scanner S1=new Scanner(System.in);
        System.out.println("Trophy-Pattern\nEnter a number (which is odd in nature and it's value should be greater 3)of rows :- ");
        n=S1.nextInt();
        for(int i=0; i<n; i+=2)
        {
            for(int j=1; j<=i; j++)
            System.out.print(" ");
            for(int j=(n-1); j>=i; j--)
            System.out.print("* ");
            for(int j=1; j<=i; j++)
            System.out.print(" ");
            System.out.print("@ ");
            
            for(int j=0; j<(n-2); j++)
            System.out.print("  ");
            System.out.print("@ ");
            for(int j=1; j<=i; j++)
            System.out.print(" ");
            for(int j=(n-1); j>=i; j--)
            System.out.print("* ");
            System.out.print("\n");
        }        
        for(int i=0; i<n/2; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print("  ");
            System.out.print("@ ");
            for(int j=0; j<n-2; j++)
                System.out.print("  ");
            System.out.print("@\n");
        }
        for(int i=0; i<n; i+=2)
        {
            for(int j=0; j<n; j++)
                System.out.print("  ");
            for(int k=1; k<=i; k++)
                System.out.print(" ");
            for(int l=(n-1); l>=i; l--)
                System.out.print("@ ");
            System.out.print("\n");
        }
        for(int i=0; i<n; i+=2)
        {
            for(int j=0; j<n; j++)
                System.out.print("  ");
            for(int l=(n-2); l>=i; l--)
            System.out.print(" ");
            for(int k=0; k<=i; k++)
            System.out.print("@ ");
            System.out.print("\n");
        }
    }
}
