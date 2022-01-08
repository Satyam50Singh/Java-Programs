package BasicPrograms;


import java.util.*;
class ConsonantVowel
{
    byte n,k;
    String[] Str=new String[10];
    String[] Str2=new String[10];
    Scanner S1;
    ConsonantVowel(Scanner S1)
    {   this.S1=S1; }
    public void getNames()
    {
        System.out.print("Enter the value of n :-");
        n=S1.nextByte();
        S1.nextLine();
        System.out.println("Enter "+n+" names of Countries/States/Cities :");
        for(int i=0; i<n; i++)
        {
           System.out.print(i+1+". ");
           Str[i]=S1.nextLine(); 
        }       
        k=0;
        for(byte i=0; i<n; i++)
        {
            char ch=Str[i].charAt(0);
            char ch2=Str[i].charAt((Str[i].length())-1);
            if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u' || ch!='A'|| ch!='E'|| ch!='I'|| ch!='O'|| ch!='U')
                if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='A'|| ch2=='E'|| ch2=='I'|| ch2=='O'|| ch2=='U')
                    Str2[k++]=Str[i];
        }
    }
    public void showNames()
    {
        System.out.println("\n\nReq. output ::");
        for(int o=0; o<k; o++)
            System.out.println(o+1+". "+Str2[o]);        
    }
}
public class CitiesWithConsonant
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner (System.in);
        ConsonantVowel T1=new ConsonantVowel(S1);
        T1.getNames();
        T1.showNames();
    }
}
