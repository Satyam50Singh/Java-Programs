package BasicPrograms;

import java.util.*;
/** Program to count the repetition of letter in a string. */
public class LetterRepeatCount
{
    public static void main(String[] args)
    {
        byte count=0;
        System.out.println("Program to count the repetition of letter in a string.");
        Scanner S1=new Scanner(System.in);
        String Str;
        System.out.print("\nEnter String : ");
        Str=S1.nextLine();        
        System.out.print("Enter letter : ");
        char ch=S1.next().charAt(0);
        for(byte i=0; i<(Str.length()); i++)
            if(ch==(Str.charAt(i)))
                count++;
        System.out.println("letter repetited  : "+count);
    }
}
