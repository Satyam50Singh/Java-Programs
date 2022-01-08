package SymbolicPatterns;

public class Pattern4
{
    public static void main(String[] args)
    {
        byte n=10;
        for(byte i=0; i<n; i++)
        {
            for(byte j=1; j<=i; j++)
            System.out.print("  ");
            for(byte k=(byte)(n-1); k>=i; k--)
            System.out.print("* ");
            System.out.println();
        }
    }
}
