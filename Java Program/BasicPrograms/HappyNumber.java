package BasicPrograms;

/**
 * If we find the sum of the square of it every digit and repeat that process untill the 
 * number will be equal to 1(one).Otherwise it is called Unhappy Or Sad Number.
 * Ex : 32
 * 3^2+2^2 = 13
 * 1^2+3^2 = 10
 * 1^2+0^2 = 1
 */
import java.util.Scanner;
public class HappyNumber
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("\nEnter a mumber : ");
        int n=S1.nextInt();
        int temp=n;
        int digit=0,temp2=0;
        while(temp2!=1)
        {
            temp2=0;
            while(temp>0)
            {
                digit=temp%10;
                temp2+=digit*digit;
                temp/=10;
            }
            temp=temp2;
            digit=0;
        }
        if(temp2==1)
            System.out.println("It's a Happy Number.");
        else
            System.out.println("It's not a Happy Number.");
    }
}
