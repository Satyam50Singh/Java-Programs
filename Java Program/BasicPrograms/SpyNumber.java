package BasicPrograms;

/**
 * n=123
 * then 1+2+3=6  or 1*2*3=6
 */
import java.util.Scanner;
public class SpyNumber
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=S1.nextInt();
        int sum=0,digit=0,temp=n,mul=1;
        while(temp>0)
        {
            digit=temp%10;
            sum=sum+digit;
            mul*=digit;
            temp/=10;
        }
        if(sum==mul)
           System.out.println("It's a Spy Number");
        else 
            System.out.println("It's not a Spy Number");

    }
}
