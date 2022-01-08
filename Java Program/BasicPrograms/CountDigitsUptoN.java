package BasicPrograms;


import java.util.Scanner;
public class CountDigitsUptoN
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a number :");        
        int n=S1.nextInt();
        int temp,temp2;
        temp=n;
        int count=0;
        while(temp>0)
        {
            temp2=temp;
            while(temp2>0)
            {
                temp2=temp2/10;
                count++;
            }
            temp--;
        }
        System.out.print("Total digits upto "+n+" : "+count);
    }
}
