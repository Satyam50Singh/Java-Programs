package BasicPrograms;

import java.util.*;
class IntegerArray
{
    Scanner S1;
    byte m,n;
    byte arr[]=new byte[10];
    byte arr2[]=new byte[10];
    byte arr3[]=new byte[10];
    IntegerArray(Scanner S1)
    {   this.S1=S1; }
    public void getArrays()
    {
        System.out.print("Enter the no. of values u want to insert in an 1st array :-");
        m=S1.nextByte();
        System.out.print("Enter the no. of values u want to insert in an 2nd array :-");
        n=S1.nextByte();
        System.out.println("Enter "+m+" Values for 1st array ");
        for(byte i=0; i<m; i++)
            arr[i]=S1.nextByte();
        System.out.println("Enter "+n+" Values for 2nd array ");
        for(byte i=0; i<n; i++)
            arr2[i]=S1.nextByte();
        }
    public void showArrays()
    {
        System.out.println("\nValues Stored in Array I :");
        for(byte i=0; i<m; i++)
            System.out.print(arr[i]+"  ");
        System.out.println("\n\nValues Stored in Array II :");
        for(byte i=0; i<n; i++)
            System.out.print(arr2[i]+"  ");
    }
    public void merge()
    {
        System.out.println("\n(i) All Odd no. of Array I(X) from left to right are copied into III from left to right");
        byte j=0;
        for(byte i=0; i<m; i++)
            if(arr[i]%2!=0)
            {
                arr3[j]=arr[i];
                System.out.print(arr3[j++]+"  ");
            }
        System.out.println("\n(ii) All Even no. of Array I from left to right are copied into III from right to left");
        j=0;
        for(byte i=0; i<m; i++)
            if(arr[i]%2==0)
                arr3[j++]=arr[i];
        for(int i=j-1; i>=0; i--)
            System.out.print(arr3[i]+"  ");
        System.out.println("\n(iii) All Odd no. of Array II from right to left are copied into III from left to right");
        j=0;
        for(int i=n-1; i>=0; i--)
            if(arr2[i]%2!=0)
                arr3[j++]=arr2[i];
        for(int i=j-1; i>=0; i--)
            System.out.print(arr3[i]+"  ");
        System.out.println("\n(iv) All Even no. of Array II from right to left are copied into III from right to left");
        j=0;
        for(int i=n-1; i>=0; i--)
            if(arr2[i]%2==0)
                arr3[j++]=arr2[i];
        for(int i=j-1; i>=0; i--)
            System.out.print(arr3[i]+"  ");
    }
    
}
public class MergeTwoArray
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        IntegerArray T1=new IntegerArray(S1);
        T1.getArrays();
        T1.showArrays();
        T1.merge();
    }
}
