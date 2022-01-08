package BasicPrograms;

import java.util.*;
class Convertor
{
    String Str;
    public void getStr(Scanner S1)
    {
        System.out.print("Enter String :");
        Str=S1.nextLine();
        System.out.println("\nString is : "+Str);
    }
    public void lowerAndUpper()
    {
        String Str2=Str;
        System.out.println("\nString in Upper Case is :"+Str.toUpperCase());
        System.out.println("\nString in Lower Case is :"+Str2.toLowerCase());        
    }
    public void toggle()
    {
        System.out.print("\nToggle String :");
        for(int i=0; i<Str.length(); i++)
        {
            char p=Str.charAt(i);
            if(p>='a' && p<='z')
                System.out.print(Character.toUpperCase(p));
            else
                System.out.print(Character.toLowerCase(p));
        }
    }
    public void sentenceCase()
    {
        System.out.print("\n\nString in Sentence Casing :");
        Str=Str.toLowerCase();
        System.out.print(Character.toUpperCase(Str.charAt(0)));        
        for(byte i=1; i<Str.length(); i++)
        {
            char p=Str.charAt(i);
            if(p==' ')
            {
                System.out.print(p);
                p=Str.charAt(++i);
                if(p>='a' && p<='z')
                    System.out.print(Character.toUpperCase(p));
                else
                    System.out.print(p);                    
            }
            else
                System.out.print(p);
        }
    }    
}
public class StringCasing
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Convertor C1=new Convertor();
        C1.getStr(S1);
        C1.lowerAndUpper();
        C1.toggle();
        C1.sentenceCase();
    }
}
