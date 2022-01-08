package BasicPrograms;

import java.util.*;
/**Program to Print Even and Odd no.s from 1 to n.
*/
public class EvenOddNos
{
    public static void main(String[] args)
    {
        System.out.println("Program to Print Even and Odd no.s from 1 to n.");
        System.out.println("Enter the value of n :");
        Scanner S1=new Scanner(System.in);
        byte num=S1.nextByte();
        
        System.out.println("\nEven Numbers\n");
        for(byte i=1; i<=num; i++)
            if(i%2==0)
                System.out.print(i+" ");
        System.out.println("\nOdd Numbers\n");
        for(byte i=1; i<=num; i++)
            if(i%2!=0)
                System.out.print(i+" ");
    }
}
