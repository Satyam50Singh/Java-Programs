package SymbolicPatterns;

import java.util.*;
public class PascalTriangle
{
    public static void main(String[] args)
    {        
        int x;
        Scanner S1=new Scanner (System.in);
        System.out.println("Enter no. of rows :-");
        int r=S1.nextInt();
        for(int i=0; i<r; i++)
        {
            x=1;
            for(int j=r-1; j>=i; j--)
            System.out.print("   ");
            for(int k=0; k<=i; k++)
            {
                System.out.print(" "+x+"    ");
                x=((x*(i-k))/(k+1));
            }
            System.out.print("\n");
        }        
    }
}
