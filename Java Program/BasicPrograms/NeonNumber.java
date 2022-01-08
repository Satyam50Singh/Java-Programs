package BasicPrograms;


/**
 * ex n=9
 * then it's sqr is 81
 * and the sum of digit of 81 is 9
 * so, 9 is neon number.
 */
import java.util.Scanner;
public class NeonNumber
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=S1.nextInt();
        int sqr= n * n;
        int sum=0,digit=0,temp=sqr;
        while(temp>0)
        {
            digit=temp%10;
            sum=sum+digit;
            temp/=10;
        }
        if(sum==n)
           System.out.println("It's a Neon Number");
        else 
            System.out.println("It's not a Neon Number");
    }
}
