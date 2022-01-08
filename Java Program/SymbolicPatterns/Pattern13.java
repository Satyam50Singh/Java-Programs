package SymbolicPatterns;

public class Pattern13
{
    public static void main(String[] args)
    {
        int x=9;
        for(int i=0; i<=x; i++)
        {
            for(int k=0; k<=i; k++)
                if(k==i)
                    System.out.print(i+" ");
                else
                System.out.print("0 ");
            for(int j=x-1; j>=i; j--)
                    System.out.print("0 ");
                System.out.print("\n");
        }
    }
}
