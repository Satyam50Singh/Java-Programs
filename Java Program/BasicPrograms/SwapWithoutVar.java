package BasicPrograms;


/** Program To Swap Two No.s by without using Third variable.*/
import java.util.Scanner;
public class SwapWithoutVar
{
    public static void main(String []args)
    {        
        System.out.println("Program To Swap Two No.s by using Third variable.");
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a=S1.nextInt();
        System.out.println("Enter Second Number :");
        int b=S1.nextInt();
        System.out.println("\nBefore Swapping\nFirst Number :"+a+"\nSecond Number :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("\nAfter Swapping\nFirst Number :"+a+"\nSecond Number :"+b);
            }
}
