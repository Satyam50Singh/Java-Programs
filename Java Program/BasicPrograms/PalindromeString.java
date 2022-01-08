package BasicPrograms;

import java.util.*;
/** Program to check a string is Palindrome or not. */
public class PalindromeString
{
    public static void main(String[] args)
    {
        String palin="";
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to check a string is Palindrome or not. ");
        System.out.print("Enter String :");
        String Str=S1.nextLine();
        System.out.println("String is : "+Str);
        for(int i=((Str.length())-1); i>=0; i--)
            palin+=Str.charAt(i);
        System.out.println("Reverse String is :"+palin);
        if(Str.equalsIgnoreCase(palin))
            System.out.println("Yes,String is palindrome.");        
        else
            System.out.println("No,String is not palindrome");        
    }
}
