package BasicPrograms;

import java.util.Scanner;
/**Program to check a no is Positive or negative Integer OR Neutral.*/
public class NoPositiveNegative
{
    public static void checkNo()
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("\nEnter a no. :");
        int i=S1.nextInt();
        if(i==0)
            System.out.println("No is :"+i);
        else if (i>0)
            System.out.println(i+" is Positive number.");
        else 
            System.out.println(i+" is Negative number.");
        System.out.println("Do u want to check another no. :(Yes/No)");
        char ch=S1.next().charAt(0);
        if(ch==89 || ch==121)
            checkNo();
        else 
            return;        
    }
    public static void main(String[] args)
    {
        System.out.println("Program to check a no is Positive or negative Integer.");
        checkNo();
        System.out.println("\nThanks For using.");
    }
}
