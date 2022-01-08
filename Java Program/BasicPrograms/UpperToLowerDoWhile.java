package BasicPrograms;

import java.util.*;
class UpperAndLower
{
    String str;
    UpperAndLower (String str)
    {
        this.str=str;
    }
    public void stringConversion()
    {
        System.out.println("Your String is :"+str);
        int i=0; 
        System.out.print("String in lower case :- ");
        do{
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                char ch=str.charAt(i);
                ch=(char)(ch+32);
                System.out.print(ch);
            }            
            else
                 System.out.print(str.charAt(i));
            i++;
        }while(i<str.length());
        i=0;
        System.out.print("\nString in Upper case :- ");
        do{
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                char ch=str.charAt(i);
                System.out.print(ch-=32);
            }            
            else
                 System.out.print(str.charAt(i));
            i++;
        }while(i<str.length());
    }
}
public class UpperToLowerDoWhile
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a String :");
        String Str=S1.nextLine();
        UpperAndLower E1=new UpperAndLower(Str);
        E1.stringConversion();
    }
}
