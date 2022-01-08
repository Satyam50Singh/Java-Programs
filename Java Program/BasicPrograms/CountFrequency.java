package BasicPrograms;
import java.util.*;
class Frequency
{
    private int val,count=0,arr[]={1,1,2,2,3,3,3,4,4,4,4,5,5,5};
    public void showArray()
    {
        System.out.print("Array :- ");
        for(int i=0; i<arr.length; i++)
           System.out.print(arr[i]+"  "); 
    }
    public void countFrequency()
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("\n\nEnter a number from a given array :: ");
        val=S1.nextInt();
        for(int i=0; i<arr.length; i++)
            if(val==arr[i])
                count++;
        if(count==0)
            System.out.println("Zero Frequency");
        else
            System.out.println("Frequency of "+val+" is "+count);
    }
}
public class CountFrequency
{
    public static void main(String[] args)
    {
        Frequency F1=new Frequency();
        F1.showArray();
        F1.countFrequency();
    }
}
