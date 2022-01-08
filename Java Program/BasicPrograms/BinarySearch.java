package BasicPrograms;

import java.util.*;
/**Program to Search a no. by using binary Search.*/
class Search
{
    byte n,find;
    int []arr=new int[20];
    public void getArray(Scanner S1)
    {
        System.out.print("Enter the no. of entities u want to store in an array. :");
        n=S1.nextByte();
        System.out.print("\nEnter "+n+" elements :");
        for(byte i=0; i<n; i++)
            arr[i]=S1.nextInt();
        System.out.print("\nArray :");
        for(byte i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.print("\nEnter the element to be search :");
        find=S1.nextByte();
    }
    public void binarySearch()
    {
        int first=0,last=n-1,middle;
        middle=((first+last)/2);
        while(first<=last)
        {
             if(arr[middle]==find)
             {
                System.out.println("No. is located at "+(middle+1)+" position"); 
                break;
             }
             else
             {
                 if(find<arr[middle])
                     last=middle-1;
                 else
                    first=middle+1;
                 middle=((first+last)/2);                 
             }
        }        
    }
}
public class BinarySearch
{
    public static void main(String []args)
    {
        System.out.println("Program to Search a no. by using binary Search.");
        Search S=new Search();
        Scanner S1=new Scanner(System.in);
        S.getArray(S1);
        S.binarySearch();
    }
}
