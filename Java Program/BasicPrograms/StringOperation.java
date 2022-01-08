package BasicPrograms;

import java.util.*;
class Sentence
{
    private String Str;
    public void getString(Scanner S1)
    {
        System.out.print("\nEnter String :");
        Str=S1.nextLine();
        System.out.println("String is : "+Str);
        System.out.println("\nLength of String is : "+Str.length());
    }
    public void reverseString()
    {
        System.out.print("\nString in Reverse is : ");
        for(byte i=(byte)((Str.length())-1); i>=0; i--)
            System.out.print(Str.charAt(i));
    }
    public void countingCharacters()
    {
        byte vowel=0,consonant=0,space=0,special=0,numeric=0,letter=0;
        for(byte i=0; i<Str.length(); i++)
        {
            char p=Str.charAt(i);
            if(p=='a' ||p=='i' ||p=='e' ||p=='o' ||p=='u' ||p=='A' ||p=='E' ||p=='I' ||p=='O' ||p=='U')
                vowel++;
            else if((p>='A' && p<='Z')||(p>='a' && p<='z'))
                consonant++;
            else if(p>='0' && p<='9')
                numeric++;
            else if(p==' ')
                space++;            
        }
        System.out.println("\n\nNo. of Letters is : "+(vowel+consonant));
        System.out.println("\nNo. of Vowels is : "+vowel);
        System.out.println("\nNo. of Consonants is : "+consonant);
        System.out.println("\nNo. of Words is : "+(space+1));
        System.out.println("\nNo. of Spaces is : "+space);
        System.out.println("\nNo. of Numeric Character is : "+numeric);
        System.out.println("\nNo. of Special Character is : "+(Str.length()-(vowel+consonant+space+numeric)));
    } 
}
public class StringOperation
{
    public static void main(String []args)
    {
        System.out.print("------String Operations------");
        Scanner S1=new Scanner(System.in);
        Sentence E1=new Sentence();
        //Get String and displaying it.
        E1.getString(S1);
        //reverse printing of string
        E1.reverseString();
        E1.countingCharacters();
    }
}