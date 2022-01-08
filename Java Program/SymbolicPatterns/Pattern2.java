package SymbolicPatterns;

import java.util.*;
/**
 * * * * *
 * * * * 
 * * * 
 * * 
 * 
 */
public class Pattern2
{
    public static void main(String []args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the Value of n :");
        byte n=S1.nextByte();
        for(byte i=n; i>0; i--)
        {
            for(byte k=1; k<=i; k++)
                System.out.print("* ");
                System.out.println("");
        }
        System.out.println("\nProgrammer : Satyam Singh\n\t    (BCA-IInd Sem)");
    }    
    
}
