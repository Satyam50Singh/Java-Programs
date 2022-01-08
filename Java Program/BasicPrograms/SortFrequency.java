package BasicPrograms;

import java.util.*;

class Screenshot
{
    String Str;
    Screenshot()
    {
        count=1;
        k=0;
    }
    int count,k;
    int arr[]=new int[25]; 
    char temp[]=new char[25];
    public void getString()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter a string :- ");
        Str=S1.nextLine();        
    }
    public void countFrequency()
    {
        for(int i=0; i<Str.length(); i++)
        {
            if(i==0)
            {
                temp[k]=Str.charAt(i);
                for(int j=i+1; j<Str.length(); j++)
                    if(Str.charAt(i)==Str.charAt(j))
                        count++;
                arr[k]=count;
                count=1;
                k++;
            }
            else
            {
                int p=0;
                for(int j=0; j<k; j++)
                    if(temp[j]==Str.charAt(i))
                        p=1;
                if(p!=1)
                {
                    temp[k]=Str.charAt(i);
                    for(int j=i+1; j<Str.length(); j++)
                        if(Str.charAt(i)==Str.charAt(j))
                            count++;
                    arr[k]=count;
                    count=1;
                    k++;
                }
            }            
        }
    }
    public void showString()
    {
        System.out.println("\nYour String's character with their frequencies : ");
        char array[][]=new char[25][10];
        for(int l=0; l<k; l++)
            System.out.println(temp[l]+"-->"+arr[l]);
        int x=0,y=0;
        for(int h=0; h<k; h++)
        {
            array[x][y]=temp[h];
            array[x][++y]=(char)arr[h];
            x++;
            y=0;
        }
        for(int h=0; h<k; h++)
        {
            for(int d=h+1; d<k; d++)
            {
                if(array[h][1]>array[d][1])
                {
                    char flag[][]=new char[25][5];
                    flag[h][0]=array[h][0];
                    flag[h][1]=array[h][1];
                
                    array[h][0]=array[d][0];
                    array[h][1]=array[d][1];

                    array[d][0]=flag[h][0];
                    array[d][1]=flag[h][1];
                }
            }
        }
        
        int x2=0;
        for(int i=0; i<k; i++)
        {
            for(int d=i+1; d<k; d++)
            {
                if(array[i][1]==array[d][1])
                {
                    if(array[i][0]>array[d][0])
                    {
                        char flag[][]=new char[10][5];
                        char ch=array[i][0];
                        array[i][0]=array[d][0];
                        array[d][0]=ch;
                    }
                }
            }
        }
        x2=0;
        System.out.println("\nRequired Answer :: ");
        for(int h=0; h<k; h++)
        {
            for(int s=0; s<array[h][1]; s++)
                if((array[x2][0]>='a' && array[x2][0]<='z')||(array[x2][0]>='A' && array[x2][0]<='Z'))
                System.out.print(array[x2][0]);
            x2++;
        }
    
    }
}
public class SortFrequency
{
    public static void main(String[] args)
    {
        Screenshot T1=new Screenshot();
        T1.getString();
        T1.countFrequency();
        T1.showString();
    }
}
