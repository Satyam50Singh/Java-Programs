package SymbolicPatterns;

import java.util.*;
/***
        * 
      * *
    * * *
  * * * * 
* * * * *
   */
public class Pattern3
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        byte n=S1.nextByte();
        for(byte i=0; i<n; i++)
        {
            for(byte k=(byte)(n-1); k>=i; k--)
                System.out.print("  ");
            for(byte j=0; j<=i; j++)
                System.out.print("& ");
            System.out.println(" ");
        }
    }
}