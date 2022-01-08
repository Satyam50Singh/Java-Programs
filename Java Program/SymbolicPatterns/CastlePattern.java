package SymbolicPatterns;

import java.util.*;
public class CastlePattern
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a even no. :(which is >=4) :-");
        int n=S1.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=n-2; j>=i; j--)
                System.out.print(" ");
            for(int k=0; k<=i; k++)
                System.out.print("1");
            for(int k=1; k<=i; k++)
                System.out.print("1");
            if(i>=(n/2))
            {
                for(int l=n-1; l>=i; l--)
                    System.out.print(" ");
                for(int l=n-2; l>=i; l--)
                    System.out.print(" ");
                for(int l=(n/2); l<=i; l++)
                    System.out.print("1");
                for(int l=(n/2)+1; l<=i; l++)
                    System.out.print("1");
            }
            System.out.print("\n");
        }
        for(int i=0; i<n/2; i++)
        {
            for(int j=0; j<n/2; j++)
                System.out.print(" ");
            for(int j=0; j<n-1; j++)
                System.out.print("1");
            for(int j=0; j<(n-n/2)+2; j++)
                System.out.print(" ");
            for(int j=0; j<(n-3); j++)
                System.out.print("1");
                System.out.print("\n");
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<(3*n); j++)
                System.out.print("1");
            System.out.print("\n");
        }
    }
}
