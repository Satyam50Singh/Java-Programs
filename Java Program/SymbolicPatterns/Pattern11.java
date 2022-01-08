package SymbolicPatterns;

import java.util.*;
public class Pattern11
{
    static int n;
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        n=S1.nextInt();
            int k=2;
        for(int i=0; i<(2*n); i++)
        {
            if(i<n)
            {
                for(int j=0; j<=i; j++)
                    if(j==0)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");                    
            }
            else
            {
                for(int j=i-k; j>=0; j--)
                {
                    if(j==(i-k))
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");                   
                }
                k+=2;
            }
                        System.out.print("\n");                   
        }
    }
}
