package BasicPrograms;

import java.util.*;
/** Program to perform differents operation on the digits of a number. */
class Operation
{
    private short temp,num;
    private byte digitNo,evenDigit,oddDigit,sumDigit,evenDigitSum,oddDigitSum,noPrimeDigit;
    public void getNumber (Scanner S1)
    {
        System.out.println("Enter a number :");
        num=S1.nextShort();
        temp=num;
        System.out.println("Number is :"+num);
    }
    public int countDigit()
    {
        temp=num;
        while(temp>0)
        {
            digitNo++;
            temp/=10;
        }
        return digitNo;
    }
    public void countDigitEvenOdd()
    {
        temp=num;
        while(temp>0)
        {
            int rem=temp%10;
            if(rem%2==0)
                evenDigit++;
            else
                oddDigit++;
            temp/=10;
        }        
        System.out.println("\nNo. of Even digits in a number is : "+evenDigit);
        System.out.println("\nNo. of Odd digits in a number is : "+oddDigit);
    }
    public int sumDigit()
    {
        temp=num;
        while(temp>0)
        {
            int rem=temp%10;
            sumDigit+=rem;
            temp/=10;
        }
        return sumDigit;
    }
    public void sumEvenDigit()
    {
        temp=num;
        while(temp>0)
        {
            int rem=temp%10;
            if(rem%2==0)
                evenDigitSum+=rem;
            else
                oddDigitSum+=rem;
            temp/=10;
        }
        System.out.println("\nSum of Even digits of a number is : "+evenDigitSum);
        System.out.println("\nSum of Odd digits of a number is : "+oddDigitSum);
    }
    public int noReverse()
    {
        int temp=num;
        int rev=0;
        while(temp>0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev;
    }
    public int noPrimeDigit()
    {
        int temp=num,c=0;
        while(temp>0)
        {
            c=0;
            int digit=temp%10;
            
            for(byte i=1; i<=digit; i++)
                if(digit%i==0)
                    c++;
            if (c==2)
                noPrimeDigit++;
            temp/=10;
        }
        return noPrimeDigit;
    }
}
public class DigitsOperations
{
    public static void main(String []args)
    {
        Operation O1=new Operation();
        Scanner S1=new Scanner(System.in);
        O1.getNumber(S1);
        System.out.println("\nNo. of digits in a number is : "+O1.countDigit());
        O1.countDigitEvenOdd();
        System.out.println("\nSum of all digits of a number is : "+O1.sumDigit());
        O1.sumEvenDigit();
        System.out.println("\nReversing of a number is : "+O1.noReverse());
        System.out.println("\nNo. of Prime digits in a number is : "+O1.noPrimeDigit());        
    }
}
