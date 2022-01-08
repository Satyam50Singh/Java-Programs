package BasicPrograms;


import java.util.Scanner;
/** Program To Swap Two No.s by using Third variable.*/
public class SwapWithVar
{
    public static void main(String []args)
    {        
        short c;
        System.out.println("Program To Swap Two No.s by using Third variable.");
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter First Number :");
        short a=S1.nextShort();
        System.out.println("Enter Second Number :");
        short b=S1.nextShort();
        System.out.println("\nBefore Swapping\nFirst Number :"+a+"\nSecond Number :"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("\nAfter Swapping\nFirst Number :"+a+"\nSecond Number :"+b);
            }
}
