package BasicPrograms;

/**
 * A pronic number is a number which is the product of two consecutive integers.
 */
import java.util.Scanner;
public class PronicNumber
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("\n Enter a mumber : ");
        int n=S1.nextInt();
        int temp=n,p=0;
        for(int i=1; i<=temp; i++)
        {
            if(i*(i+1)==temp)
                p=1;                
        }
        if(p==1) 
            System.out.print("It's a Pronic Number.");
        else
            System.out.print("It's not a Pronic Number.");
    }
}
