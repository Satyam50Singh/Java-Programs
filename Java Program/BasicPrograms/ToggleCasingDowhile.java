package BasicPrograms;


import java.util.*;
class Example
{
    Scanner S1;
    private String Str;
    Example(Scanner Sample)
    {   S1=Sample;   }
    public void getString()
    {
        System.out.print("Enter a String :-");
            Str=S1.nextLine();
        System.out.print("Your String is : "+Str);
    }
    public void toggleCasing()
    {
        int i=0;
        System.out.print("\n\nYour Updated String is :-");
        do{
            char ch=Str.charAt(i);
            if(ch>='a' &&ch<='z')
            System.out.print(ch-=32);
            else if(ch>='A' &&ch<='Z')
            System.out.print(ch+=32);
            else
            System.out.print(ch);
            i++;
        }while(i<Str.length());
    }
}
public class ToggleCasingDowhile
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Example E1=new Example(S1);
        E1.getString();
        E1.toggleCasing();
    }
}
