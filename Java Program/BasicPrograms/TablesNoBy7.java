package BasicPrograms;

import java.util.*;
/** Program to print tables of those no.s which are divided by 7 upto n. */
public class TablesNoBy7
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to print tables of those no.s which are divided by 7 upto a limit.");
        System.out.println("Enter Starting number :");
        byte st=S1.nextByte();
        System.out.println("Enter Ending number :");
        byte ed=S1.nextByte();
        
        for(byte i=st; i<=ed; i++)
        {
            if(i%7==0)
            {
                for(byte j=1; j<=10; j++)
                    System.out.print(i+"*"+j+"="+(i*j)+"  ");
                System.out.println("");
            }
        }
    }    
}
