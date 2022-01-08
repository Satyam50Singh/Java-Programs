package BasicPrograms;

import java.util.*;
/** Program to convert all the digit of no. in words.*/
class Convert
{
    private int sum=0;
    public void fun(int n)
    {
        while(n>0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        while(sum>0)
        {
            int rem=sum%10;
            switch(rem)
            {
                case 1: System.out.println(rem+" is One ");       break;
                case 2: System.out.println(rem+" is Two");        break;
                case 3: System.out.println(rem+" is Three");      break;
                case 4: System.out.println(rem+" is Four");       break;
                case 5: System.out.println(rem+" is Five");       break;
                case 6: System.out.println(rem+" is Six");        break;
                case 7: System.out.println(rem+" is Seven");      break;
                case 8: System.out.println(rem+" is Eight");      break;
                case 9: System.out.println(rem+" is Nine");       break;
                case 0: System.out.println(rem+" is Zero");       break;
            }
            sum/=10;
        }
    }
}
public class NumberToWords
{
    public static void main(String[] args)
    {
        System.out.println("Program to convert all the digit of no. in words.");
        Scanner S1=new Scanner(System.in);
        Convert C1=new Convert();
        System.out.print("\nEnter a number :");
        int n=S1.nextInt();
        C1.fun(n);
    }
}
