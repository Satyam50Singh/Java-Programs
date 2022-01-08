package SymbolicPatterns;
import java.util.*;
public class Patter12
{
    public static void main(String[] args)
    {
        int n;
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        n=S1.nextInt();

        int x=1,p=2;
        for(int i=0; i<(2*n); i++)
        {
            if(i<n)
            {
                x=1;
                for(int j=0; j<=i; j++)
                    System.out.print(x+++" ");
            }
            else
            {
                x=1;                
                for(int j=(n)-p; j>=0; j--)
                    System.out.print(x+++" ");
                p+=1;
            }
            System.out.print("\n");
        }
    }
}
