package BasicPrograms;

import java.util.Scanner;
/**Program to Calculate the Simple Interest.*/
public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Program to Calculate the Simple Interest.");
        System.out.println("Enter Principle :");
        int p=s1.nextInt();
        System.out.println("Enter Rate");
        byte r=s1.nextByte();        
        System.out.println("Enter Time period :");
        float t=s1.nextFloat();
        
        System.out.println("\nPrinciple is : "+p+"\nRate is : "+r+"%\nTime Period is : "+t+" years\nSimple Interest (S.I) is :"+simpleInterest(p,r,t));
    }
    public static float simpleInterest(int p,int r,float t)
    {
        return ((float)((p*r*t)/100));
    }
}
