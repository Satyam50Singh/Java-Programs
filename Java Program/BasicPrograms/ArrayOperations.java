package BasicPrograms;

import java.util.*;
/** Program to insert n no. of value in an array by user and display values as output. */
class Operation
{
    private byte n;
    private byte []arr=new byte[20];
    public void getArray(Scanner S1)
    {
        System.out.print("Enter the value of n : ");
        n=S1.nextByte();
        System.out.print("Enter "+n+" values : ");
        for(byte i=0; i<n; i++)
            arr[i]=S1.nextByte();
    }
    public void showArray()
    {
        System.out.print("Values Stored in an array : ");
        for(byte i=0; i<n; i++)
        System.out.print(arr[i]+" ");
    }
    public void squareCube()
    {
        System.out.print("\nSquares : ");
        for(byte i=0; i<n; i++)
            System.out.print((arr[i]*arr[i])+"  ");
        System.out.print("\nCubes : ");
        for(byte i=0; i<n; i++)
            System.out.print((arr[i]*arr[i]*arr[i])+"  ");
    }
    public void arrayReverse() 
    {
        System.out.print("\nArray in Reverse Order : ");
        for(byte i=(byte)(n-1); i>=0; i--)
            System.out.print(arr[i]+"  ");            
    }
    public void evenOdd()
    {
        byte neven=0,nodd=0;
        System.out.print("\nEven no.s in an array : ");
        for(byte i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                neven++;
                System.out.print(arr[i]+"  ");            
            }
        }
        System.out.print("\nNo. of Even elements in an array is : "+neven);
        System.out.print("\nOdd no.s in an array : ");
        for(byte i=0; i<n; i++)
        {
            if(arr[i]%2!=0)
            {
                nodd++;
                System.out.print(arr[i]+"  ");            
            }
        }
        System.out.println("\nNo. of Odd elements in an array is : "+nodd);
    }
    public void maximumNo()
    {
        byte max=arr[0];
        for(byte i=0; i<n; i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("Maximum no. in array is : "+max);
    }
    public void minimumNo()
    {
        byte min=arr[0];
        for(byte i=0; i<n; i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("Minimum no. in array is : "+min);
    }
    public void swap()
    {
        byte []arr2=new byte[15];
        for(byte i=0; i<n; i++)
            arr2[i]=arr[i];
        byte temp=arr2[0];
        arr2[0]=arr2[n-1];
        arr2[n-1]=temp;
        System.out.print("After Swapping values at index 0 & n-1 : ");
        for(byte i=0; i<n; i++)
        System.out.print(arr2[i]+" ");
    }
    public void replace()
    {
        System.out.print("\nReplace -ve values with 0 array is : ");
        byte []arr2=new byte[15];
        for(byte i=0; i<n; i++)
        {
            if(arr[i]<0)
                arr2[i]=0;
            else
            arr2[i]=arr[i];
            System.out.print(arr2[i]+"  ");
        }
    }
    public void average()
    {
        byte sum=0;
        for(byte i=0; i<n; i++)
            sum+=arr[i];
        System.out.print("\nAverage of no.s : "+((float)(sum/n)));        
    }
    public void primeNumbers()
    {
        System.out.print("\nPrime no.s in an array : ");

        byte c=0;
        for(byte i=0; i<n; i++)
        {
            byte temp=arr[i];
            for(byte h=1; h<=temp; h++)
                if(temp%h==0)
                    c++;
            if(c==2)
            System.out.print(temp+" ");
            c=0;
        }
    }
}
public class ArrayOperations
{
    public static void main(String []args)
    {
        System.out.println("Program to insert n no. of value in an array by user and display values as output. ");
        Scanner S1=new Scanner(System.in);
        Operation O1=new Operation();
        
        //Inserting values in an array.
        O1.getArray(S1);
        //Display Array
        O1.showArray();
        //Square And Cube of each value stored in an array.
        O1.squareCube();
        //Reverse Printing of an array
        O1.arrayReverse();
        //Even and Odd no.s in an Array.
        O1.evenOdd();
        //Maximum No. in an array
        O1.maximumNo();
        //Minimum No. in an array
        O1.minimumNo();
        //Swapping values from index 0 & n-1.
        O1.swap();
        //Average of no.s stored in an array.
        O1.average();
        //Replace -ve values with 0.
        O1.replace();
        //Prime number stored in an array
        O1.primeNumbers();
    }
}
