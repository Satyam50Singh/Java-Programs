package BasicPrograms;

/**
 * SATYAM SINGH
 * S-->2
 * A-->2
 * T-->1
 * Y-->1
 * M-->1
 * I-->1
 * N-->1
 * G-->1
 * H-->1
 */
import java.util.*;
class FrequencyCounter
{
    String str;
    char arr[]=new char[20];
    byte val[]=new byte[17];
    byte limit=0;
    public void getString()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your string :-");
        str=s1.nextLine();
        System.out.println("Your string is :- "+str);
    }
    public void countFrequency()
    {
        byte count=1,k=0;
        for(byte i=0; i<str.length(); i++)
        {
            byte p=0;
            for(byte o=0; o<arr.length; o++)
                if(str.charAt(i)==arr[o])
                    p=1;
            if(p!=1)
            {
                arr[k]=str.charAt(i);
                for(int j2=i+1; j2<str.length(); j2++)
                    if(str.charAt(i)==str.charAt(j2))
                        count++;
                val[k]=count;
                limit++;
                count=1;
                k++;
            }
        }
    }   
    public void showFrequency()
    {
        byte p=0;
        for(byte i=0; i<limit; i++)
            System.out.println(arr[i]+"-->"+val[i]);
    }
}
public class FrequencyLetters
{
    public static void main(String[] args)
    {
        FrequencyCounter T1=new FrequencyCounter();
        T1.getString();
        T1.countFrequency();
        T1.showFrequency();        
    }
}
