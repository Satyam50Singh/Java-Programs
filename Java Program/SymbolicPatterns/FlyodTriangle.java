package SymbolicPatterns;
import java.util.*;
public class FlyodTriangle
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter no. of rows :-");
        byte p=1,r=S1.nextByte();
        for(byte i=0; i<r; i++)
        {
            for(byte k=0; k<=i; k++)
                if(p<=9)
                    System.out.print((p++)+"  ");
                else
                    System.out.print((p++)+" ");
            System.out.print("\n");
        }
    }
}
