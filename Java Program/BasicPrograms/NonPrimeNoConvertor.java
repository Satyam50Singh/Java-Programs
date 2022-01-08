package BasicPrograms;

import java.util.*;
/** Program to insert n values in an check and check all the no.s are prime or not,
    if no. is non prime then convert it into nearest prime no. of the same no. */
public class NonPrimeNoConvertor
{
    public static void main(String[] args)
    {
        System.out.println("Program to insert n values in an check and check all the no.s are prime or not,\nif no. is non prime then convert it into nearest prime no. of the same no.");
        Scanner S1=new Scanner(System.in);
        int n;
        int []arr=new int[10];
        System.out.print("\nEnter the value of n :");
        n=S1.nextInt();
        System.out.println("Enter "+n+" values ");
        for(int i=0; i<n; i++)
        arr[i]=S1.nextInt();
        System.out.print("\nArray Stored in a value : ");

        for(byte i=0; i<n; i++)
            System.out.print(arr[i]+"  ");
        System.out.println("");       
        byte c=0,p=0;
        for(byte i=0; i<n; i++)
        {
            int temp=arr[i];
            do{
                for(byte j=1; j<=temp; j++)
                    if(temp%j==0)
                        c++;
                if(c==2)
                {
                    System.out.println("Prime No is :"+temp);
                    p=1;
                }
                else
                    temp++;
                c=0;
            }while(p!=1);
            p=0;
            c=0;
        }    
    }
}
