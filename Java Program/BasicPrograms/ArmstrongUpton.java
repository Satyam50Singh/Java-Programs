package BasicPrograms;

import java.util.*;
public class ArmstrongUpton
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner (System.in);
        int n;
        System.out.println("Program to check whether a no. is armstrong no. or not:-");
        System.out.print("Enter a number:-");
        n=S1.nextInt();
        int digit,sum=0;
        int temp=n;
        while(temp>0)
        {
            digit=temp%10;
            sum=sum+digit*digit*digit;
            temp/=10;
        }
        if(sum==n)
            System.out.println("Yes,it's an armstrong no.");
        else
            System.out.println("No,it's not an armstrong no.");
    }
}
