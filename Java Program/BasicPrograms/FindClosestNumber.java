package BasicPrograms;


/**
 * Write a description of class FindClosestNumber here.
 */
import java.util.*;
class Neighbour
{
    Scanner S1;
    private int n;
    private int arr[]=new int[10];
    Neighbour (Scanner S1)
    {
        this.S1=S1;
    }
    void getArray()
    {
        System.out.print("Enter the size of array : ");
        n=S1.nextInt();
        System.out.print("\nEnter elements :");
        for(int i=0; i<n; i++)
        arr[i]=S1.nextInt();
        System.out.print("\nElements :");
        for(int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
    }
    void sortArray()
    {
        for(int i=0; i<n-1; i++)
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<=arr[min])
                {
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }
    int nearestNumber(int num)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i]==num)
            return arr[i+1];
        }
        return 0;
    }
} 
public class FindClosestNumber
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Neighbour N1=new Neighbour(S1);
        N1.getArray();
        N1.sortArray();
        System.out.print("\nEnter a number from given array :");
        int num=S1.nextInt();
        if(N1.nearestNumber(num)==0)
        System.out.print("\nOoops!! This is the Greater number. ");
        else
        System.out.println("\nClosest number after "+num+" is :"+N1.nearestNumber(num));
    }
}
