package BasicPrograms;

import java.util.*;
/**Program to print Multiplication table upto n.*/
public class TableUptoN
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to print Multiplication table upto n.");
        System.out.println("Enter the value of n");
        byte n=S1.nextByte();
        
        for(byte i=1; i<=n;  i++)
        {
            for(byte j=1; j<=10; j++)
                System.out.print(i+"*"+j+"="+(i*j)+"    ");
            System.out.println("\n");
        }
    }
}
