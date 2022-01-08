package SymbolicPatterns;


import java.util.Scanner;
public class PatternDoWhile
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        int n=S1.nextInt();
        int i=0,j,k;
        do{
            j=n-1;
            k=0;
            do{
                System.out.print("  ");
                j--;
            }while(j>=i);
            do{
            System.out.print("* ");
                k++;
            }while(k<=i);
            System.out.print("\n");
            i++;
        }while(i<n);
    }
}
