package SymbolicPatterns;


public class Pattern7
{
    public static void main(String[] args)
    {
        int g=2;
        for(int i=0; i<6; i++)
        {
            for(int j=5; j>=i; j--)
            System.out.print("  ");
            if(i>=0 && i<=2)
            {
                for(int l=i; l>=0; l--)
                System.out.print(l+" ");
                for(int k=1; k<=i; k++)
                System.out.print(k+" ");
            }
            else
            {
                g=2;
                for(int k=3; k<=i; k++)
                System.out.print("* ");
                for(int k=0; k<5; k++)
                {
                    if(g>=0)
                        System.out.print((g--)+" ");
                    else
                    {
                        g+=2;
                        System.out.print((g++)+" ");
                    }
                }
                for(int k=3; k<=i; k++)
                System.out.print("* ");
            }
            System.out.print("\n");
        }        
    }
}
