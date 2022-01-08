package BasicPrograms;



/**
 * Write a description of class FindMissingNumber here.
 *
 * Write a program to find a missing number in an array.
 * Example : INPUT : 1,2,3,4,6,7,8,9,10,11,12,14,15,18,19,20
         OUTPUT : Missing numbers : 5,13,16,17
 */
import java.util.*;
class MissingNumber
{
    Scanner S1;
    private int n;
    private int arr[]=new int[10];
    MissingNumber(Scanner S1)
    {    this.S1=S1;    }
    void getAndShowArray()
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
            int smallest=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[smallest]>arr[j])
                {
                    int temp=arr[smallest];
                    arr[smallest]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nElements after sorting :");
        for(int i=0; i<n; i++)
        System.out.print(arr[i]+" ");

    }
    void findNumbers()
    {
        int p=arr[0], i=0;
        System.out.print("\nMissing Number is ");
        do
        {
            if(arr[i]!=p)                
                System.out.print(p+" ");
            else
                i++;            
            p++;
        }while(p<=arr[n-1]);
    }
    
}
public class FindMissingNumber
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        MissingNumber M1=new MissingNumber(S1);
        M1.getAndShowArray();
        M1.sortArray();
        M1.findNumbers();   
    }
}
