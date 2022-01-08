package BasicPrograms;
import java.util.*;
/*
   *Take a number and a string from the user and perform following by using different method
   *
   *display number and string
   *Check whether a number is even or odd.
   *increase its value by 10.
   *check a number is +ve or -ve
   *count no. of vowel in a string
   */
class Task
{
    public int num;
    private String str;
    Scanner S1;
    Task(Scanner S2)
    {
        S1=S2;
    }
    public void getStringAndNumber()
    {
        System.out.print("Enter a number : ");
        num=S1.nextInt();
        S1.nextLine();
        System.out.print("Enter a String : ");
        str=S1.nextLine();
        System.out.println("Number is : "+num+"\nString is : "+str+"\n");
    }
    public boolean isEven()
    {
        if(num%2==0)
            return true;
        else
            return false;
    }
    public void increasedBy10()
    {
        int temp=num;
        System.out.println("Value after increment is :"+(temp+=10));
    }
    public boolean isPositive()
    {
        if(num>0)
        return true;
        else
        return false;
    }
    public void countVowel()
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='i' ||ch=='e' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='I' ||ch=='E' ||ch=='O' ||ch=='U' )
               count++;
        }
        System.out.println("Number of vowels : "+count);
    }
}
public class ExampleOfMethodUsage
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Task T1=new Task(S1);
        T1.getStringAndNumber();
        if(T1.isEven())
            System.out.println("Number is Even.");
        else
            System.out.println("Number is Even.");
        T1.increasedBy10();
        if(T1.isPositive())
            System.out.println("Number is Positive.");
        else
            System.out.println("Number is Negative.");
        T1.countVowel();
    }
}