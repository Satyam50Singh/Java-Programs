package SymbolicPatterns;


public class Pattern9
{
    public static void main(String[] args)
    {
        System.out.print("Symbolic Pattern :-\n");
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>=i; j--)
            {
                if(i<1)
                    System.out.print("  ");
                else
                {
                    if(j==i)
                    System.out.print("* ");
                    else
                    System.out.print("  ");                    
                }                
            }
            for(int k=i; k>=0; k--)
            {
                if(i<1)
                System.out.print(k+" ");
                else
                {
                    if(k>=3)
                        System.out.print("* ");
                    else
                        System.out.print(k+" ");                    
                }                
            }
            int p=1;
            
            if(i>0)
            {                
                for(int u=0; u<2; u++)
                {
                    if(i==1 && p==2)
                       System.out.print("* ");
                    else
                       System.out.print(p+" ");
                    p++;
                }
                for(int k=2; k<=i; k++)
                    System.out.print("* ");
            }
                System.out.print("\n");
        }
    }
}
