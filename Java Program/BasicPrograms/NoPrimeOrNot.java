package BasicPrograms;
/**Program to check no is whether prime or not.*/

import java.util.Scanner;
class Prime
{
    public void noPrime()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("\nEnter a no.");
        int num=S1.nextInt();
        int c=0;
        for(int i=1; i<=num; i++)
            if(num%i==0)
                c++;
        if(c==2)
            System.out.println(num+" is Prime number.");
        else
            System.out.println(num+" is Non-Prime number.");             
        
        System.out.print("\nDo u want to check another no. (Yes/No) :");
        char ch=S1.next().charAt(0);
        if(ch==89 || ch==121)
            noPrime();
        else 
            return;
    }
}
public class NoPrimeOrNot
{
    public static void main(String[] args)
    {
        Prime P1=new Prime();
        System.out.println("Program to check no is whether prime or not.");
        P1.noPrime();
        System.out.println("Thanks For Using.");
    }
}
