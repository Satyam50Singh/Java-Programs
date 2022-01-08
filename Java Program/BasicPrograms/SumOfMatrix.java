package BasicPrograms;

import java.util.*;
class RowAndColumnSum
{
    private byte r,c,sum;
    byte [][]arr=new byte[4][4]; 
    public void getMatrix(Scanner S1)
    {
        System.out.print("Enter the no.s of rows and column of matrix :");
        r=S1.nextByte();
        c=S1.nextByte();
        System.out.println("Enter elements :");
        for(byte i=0; i<r; i++)
            for(byte j=0; j<c; j++)
                arr[i][j]=S1.nextByte();
        System.out.println("Matrix is : ");
        for(byte i=0; i<r; i++)
        {
            for(byte j=0; j<c; j++)
                System.out.print(arr[i][j]+"    ");
                System.out.println("");
        }
    }
    public void calculation()
    {
        sum=0;
        for(byte i=0; i<r; i++)
        {
            for(byte j=0; j<c; j++)
                sum+=arr[i][j];
            System.out.println("Sum of row"+(i+1)+" is "+sum);
            sum=0;
        }
        for(byte i=0; i<r; i++)
        {
            for(byte j=0; j<c; j++)
                sum+=arr[j][i];
            System.out.println("Sum of column"+(i+1)+" is "+sum);
            sum=0;
        }
        for(byte i=0; i<r; i++)
            for(byte j=0; j<c; j++)
                if(i==j)
                    sum+=arr[i][j];
        System.out.println("Sum of diagonal1 is "+sum);
        sum=0;
        for(byte i=0; i<r; i++)
            sum+=arr[i][r-i-1];
        System.out.println("Sum of diagonal1 is "+sum);
    }
}
public class SumOfMatrix
{
    public static void main(String []args)
    {
        RowAndColumnSum M1=new RowAndColumnSum();
        Scanner S1=new Scanner(System.in);
        M1.getMatrix(S1);
        M1.calculation();
    }
}
