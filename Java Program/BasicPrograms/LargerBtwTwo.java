package BasicPrograms;

import java.util.*;
/** Program to find Larger no btw Two integer no.s*/
public class LargerBtwTwo
{
    public static void comparison()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("\nEnter two no.s ");
        short a=S1.nextShort();        
        short b=S1.nextShort();
        if(a==b)
            System.out.println("Both No.s are Equal");
        else if (a>b)
            System.out.println("Larger No. is :"+a+"\nSmaller no. is :"+b);
        else   
            System.out.println("Larger No. is :"+b+"\nSmaller no. is :"+a);
    }
    public static void main(String[] args)
    {
        System.out.println("Program to find Larger no btw Two integer no.s");
        comparison();
        System.out.println("Thanks For using.");
    }
}
