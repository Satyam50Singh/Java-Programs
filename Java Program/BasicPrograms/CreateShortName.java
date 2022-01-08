package BasicPrograms;

import java.util.*;
class Test
{
    Scanner S1;
    public String Str;
    Test(Scanner S1)
    {
        this.S1=S1;
    }
    public void getString()
    {
        System.out.print("Enter a STRING :-");
        Str=S1.nextLine();
        System.out.print("STRING :-"+Str);        
    }
    void createShortName()
    {
        int space=0;
        for(int i=0; i<Str.length(); i++)
            if(Str.charAt(i)==' ')
                space++;
        int s=0;
        System.out.print("\nShort Name :-"+Str.charAt(0)+".");
        for(int i=0; i<Str.length(); i++)
        {
            if(Str.charAt(i)==' ')
                s++;
            if(s==space)
            {
                for(int k=i+1; k<Str.length(); k++)
                    System.out.print(Str.charAt(k));
                    break;
            }
            else if(Str.charAt(i)==' ')
                System.out.print(Str.charAt(i+1)+".");
        }    
    }
}
public class CreateShortName
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Test T1=new Test(S1);
        T1.getString();
        T1.createShortName();
    }
}
