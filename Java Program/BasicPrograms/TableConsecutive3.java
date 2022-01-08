package BasicPrograms;

import java.util.*;
/** Program to print table of 3 consecutive number. */
public class TableConsecutive3
{
    public static void main(String[] args)
    {
        System.out.println("Program to print table of 3 consecutive number.");
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter a no. :");
        byte n=S1.nextByte();
        for(byte i=n; i<(n+3); i++)
        {
            for(byte k=1; k<=10; k++)
                System.out.print(i+"*"+k+"="+(i*k)+"  ");
            System.out.println("");
        }
    }
}
