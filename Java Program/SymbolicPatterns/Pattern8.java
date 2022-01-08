package SymbolicPatterns;


public class Pattern8
{
    public static void main(String []args)
    {
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
                System.out.print("  ");
            for(int k=0; k<=i; k++)
                System.out.print("* ");
            System.out.print("\n");
        }
        for(int i=0; i<n; i++)
        {
            for(int k=1; k<=i+1; k++)
                System.out.print("  ");
            for(int j=n-2; j>=i; j--)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
