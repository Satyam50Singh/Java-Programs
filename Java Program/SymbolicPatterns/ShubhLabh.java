package SymbolicPatterns;

import java.util.*;
public class ShubhLabh
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter an even no. :-");
        int n=S1.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("\t\t");
            for(int j=0; j<n; j++)
                if(j<n/2)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            for(int k=0; k<n/2; k++)
                System.out.print("* ");
            for(int l=0; l<n; l++)
            {
                if(i<n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");                
            }
            System.out.print("\n");
        }
        for(int i=0; i<n/2; i++)
        {
            System.out.print("\t\t");
            for(int k=0; k<(2*n)+(n/2); k++)
                System.out.print("* ");
            System.out.print("\n");
        }
        for(int i=0; i<n; i++)
        {
            System.out.print("\t\t");
            for(int l=0; l<n; l++)
                if(i<n/2)
                    System.out.print("  ");
                else
                    System.out.print("* ");                
            for(int k=0; k<n/2; k++)
                System.out.print("* ");
            for(int j=0; j<n; j++)
                if(j>=n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.print("\n");
        }
    }
}
