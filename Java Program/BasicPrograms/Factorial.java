package BasicPrograms;

/**Program to Calculate the Factorial of a number.*/
import java.util.*;
class Factor
{
    public void factorial()
    {
        System.out.println("Enter a number :");
        Scanner S1=new Scanner(System.in);
        byte num=S1.nextByte();
        byte temp=num;
        if(num>0){
            long fact=1;
            for(byte i=num; i>=2; i--)
                fact*=i;
            System.out.println("Factorial of "+temp+" is :"+fact);
            System.out.println("Do u want to find factorial of another no. (yes/no) :");
            char ch=S1.next().charAt(0);
            if(ch==89 || ch==121)
                factorial();
            else
                return ;
        }
        else
        {
            System.out.println("Factorial of negative no. is not possible.");
            System.out.println("Do u want to find factorial of another no. (yes/no) :");
            char ch=S1.next().charAt(0);
            if(ch==89 || ch==121)
                factorial();
            else
                return ;            
        }
    }
}
public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println("Program to Calculate the Factorial of a number.");
        Factor F1=new Factor();
        F1.factorial();       
        System.out.println("Thanks For Using.");
    }
}
