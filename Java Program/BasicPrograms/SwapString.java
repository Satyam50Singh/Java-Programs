package BasicPrograms;


import java.util.*;
public class SwapString
{
    public static void main(String[] args)
    {
        String[] Str= new String[10];
        Scanner S1=new Scanner (System.in);
        System.out.print("Enter 1st String :- ");
        Str[0]=S1.nextLine();
        System.out.print("Enter 2nd String :- ");
        Str[1]=S1.nextLine();
        System.out.println("\nBefore Swapping ::    \n\t1st String :-"+Str[0]+"\n\t2nd String :-"+Str[1]);
        String str=Str[0];
        Str[0]=Str[1];
        Str[1]=str;
        System.out.println("\n\nAfter Swapping ::    \n\t1st String :-"+Str[0]+"\n\t2nd String :-"+Str[1]);
    
        System.out.print("\nFirst String after removing vowels :-");
        for(int i=0; i<Str[0].length(); i++)
        {
            char ch=Str[0].charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
                System.out.print(ch);
        }
        System.out.print("\n\nSecond String after removing vowels :-");
        for(int i=0; i<Str[1].length(); i++)
        {
            char ch=Str[1].charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
                System.out.print(ch);
        }
    }
}
