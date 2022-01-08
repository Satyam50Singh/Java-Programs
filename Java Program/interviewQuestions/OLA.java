package interviewQuestions;


/**
 * Write a description of class OLA here.
 *
 * @author (Satyam Singh)
 * @version (26-01-2021)
 * 
 * You are given a non-negative integer N. You have to calculate the sum of the digits it has
 * repeatedly until the result came down to a single digit. And your task is to print that 
 * single digit after performing the required operations. 
 * Ex : DigitSum(94) ==>> DigitSum(13) ==>> 4 (Ans.)
 * 
 */
import java.util.*;
public class OLA
{
    private static int val,digit,sum,temp;
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a +ve integer : ");
        val=S1.nextInt();
        digit=0;
        sum=0;
        temp=val;
        while(digit!=1)
        {
            digit=0;
            temp=reqSum();
            while(temp>0){
                digit++;
                temp/=10;
            }
            digit=countDigit();
            temp=sum;
            sum=0;
        }
        System.out.println("Required Value :"+temp);
    }
    static int reqSum(){
        while(temp>0){
            sum=sum+temp%10;
            temp/=10;
        }        
        return sum;
    }
    static int countDigit(){
        while(temp>0){
            digit++;
            temp/=10;
        }
        return digit;
    }
}
