package javaPrograms;

import java.util.*;
/**
 * Declaration and Initialisation of array.
 * 
 */
public class Array
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        //1st way
        int arr[];  //local reference Variable.
        arr=new int[12];
        
        //2nd Way
        float arr2[]=new float[10];
        
        //3rd Way
        char []arr3=new char[20];
        
        String St3="Hii i Am Satyam singh";
        System.out.println(St3);
        System.out.println("Enter String :");
        String str=input.nextLine();

        System.out.println("Enter 5 Integers No.s :");
        for(int i=0; i<5; i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("\nEnter 5 Float No.s :");
        for(int i=0; i<5; i++)
        {
            arr2[i]=input.nextFloat();
        }       
        System.out.println("\nEnter Character's String :");
        for(int i=0; i<5; i++)
        {
            arr3[i]=input.next().charAt(0);
        }
        System.out.println("\nInteger Values are :");
        for(int i=0; i<5; i++)
        {
            System.out.println("arr["+i+"] = "+arr[i]);            
        }
        System.out.println("\nFloat Values are :");
        for(int i=0; i<5; i++)
        {
            System.out.println("arr2["+i+"] = "+arr2[i]);            
        }
        System.out.println("\nCharacter's are :");
        for(int i=0; i<5; i++)
        {
            System.out.println("arr3["+i+"] = "+arr3[i]);
        }        
        System.out.println("\nString is :"+str);       
    }
}
