package SymbolicPatterns;


public class CProgrammingPattern
{
    public static void main(String[] args)
    {
        String Str="Cprogramming";
            System.out.println("-----------------");
        for(int i=0; i<Str.length(); i++)
        {
            System.out.print("|  ");
            for(int j=0; j<=i; j++)
                System.out.print(Str.charAt(j));
            if(i>3)
                System.out.print("\t|");
            else
                System.out.print("\t\t|");
            System.out.print("\n");
        }
        for(int i=1; i<Str.length()-1; i++)
        {
            int p=0;
            System.out.print("|  ");
            for(int j=Str.length()-1; j>=i; j--)
                System.out.print(Str.charAt(p++));
            if(i<8)
                System.out.print("\t|");
            else
                System.out.print("\t\t|");
            System.out.print("\n");
        }
            System.out.print("-----------------\n");
    }
}
