package SymbolicPatterns;


public class AlphabeticTriangle
{
    public static void main(String[] args)
    {
        int n=10;    
        for(int i=0; i<n; i++)
        {
            char ch=65;
            for(int j=n-1; j>=i; j--)
            System.out.print(" ");
            for(int k=0; k<=i; k++)
            System.out.print(ch++);
            ch=64;
            for(int l=i; l>=1; l--)
                System.out.print((char)(ch+l));
            System.out.print("\n");
        }
    }
}
