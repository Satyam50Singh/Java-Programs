package SymbolicPatterns;

import java.util.*;
/** Pattern
 * 
 * *
 * * *
 * * * *
 * * * * *
*/
public class Pattern1
{
    public static void main(String []args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the Value of n :");
        byte n=S1.nextByte();
        for(byte i=0; i<n; i++)
        {
            for(byte k=0; k<=i; k++)
                System.out.print("* ");
                System.out.println();
        }
        System.out.println("\nProgrammer : Satyam Singh\n\t    (BCA-IInd Sem)");
    }    
}
