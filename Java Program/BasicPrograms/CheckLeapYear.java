package BasicPrograms;

import java.util.*;
/** Program to check year is Leap Year.*/
public class CheckLeapYear
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to check year is Leap Year.");
        System.out.println("Enter Year :");
        short year=S1.nextShort();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.println("Yes, "+year+" is Leap Year.");
                else
                    System.out.println("No, "+year+" is not Leap Year.");
            }            
            else
                System.out.println("Yes, "+year+" is Leap Year.");
        }
        else
            System.out.println("No, "+year+" is not Leap Year.");
    }
}
