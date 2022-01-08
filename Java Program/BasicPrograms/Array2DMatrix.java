package BasicPrograms;

import java.util.*;
/** Matrix Operations.*/
class Matrix 
{ 
    private byte r1,c1,r2,c2;
    private int [][]arr=new int[4][4];
    private int [][]arr2=new int[4][4];    
    private int [][]temp=new int[4][4];
    public void getMatrix(Scanner S1)
    {
        System.out.print("Enter the no. of rows and column of 1st matrix :");
        r1=S1.nextByte();
        c1=S1.nextByte();
        System.out.println("\nEnter the element :");
        for(byte i=0; i<r1; i++)
            for(byte j=0; j<c1; j++)
                arr[i][j]=S1.nextInt();
        System.out.println("\n1st Matrix is : ");
        for(byte i=0; i<r1; i++)
        {
            for(byte j=0; j<c1; j++)
                System.out.print(arr[i][j]+"   ");
            System.out.println();
        }
        System.out.print("\nEnter the no. of rows and column of 2nd matrix :");
        r2=S1.nextByte();
        c2=S1.nextByte();
        System.out.println("\nEnter the element :");
        for(byte i=0; i<r2; i++)
            for(byte j=0; j<c2; j++)
                arr2[i][j]=S1.nextInt();
        System.out.println("\n2nd Matrix is : ");
        for(byte i=0; i<r2; i++)
        {
            for(byte j=0; j<c2; j++)
                System.out.print(arr2[i][j]+"   ");
            System.out.println("");
        }
    }
    public void addition()
    {
        if(r1==r2 && c1==c2)
        {
            System.out.println("\nAddition of two Matrices is : ");
            for(byte i=0; i<r1; i++)
            {
                for(byte j=0; j<c1; j++)
                    System.out.print((arr[i][j]+arr2[i][j])+"   ");
                System.out.println("");
            }
        }        
        else
            System.out.println("Both matrix are of different size so addition is not possible.");
    }
    public void subtraction()
    {
        if(r1==r2 && c1==c2)
        {
            System.out.println("\nSubtraction of two Matrices is : ");
            for(byte i=0; i<r2; i++)
            {
                for(byte j=0; j<c2; j++)
                    System.out.print((arr[i][j]-arr2[i][j])+"   ");
                    System.out.println("");
            }
        }        
        else
            System.out.println("Both matrix are of different size so subtraction is not possible.");
    }
    public void multiplication()
    {
        byte sum=0;
        if(r2==c1)
        {
            for(byte i=0; i<r1; i++)
            {
                for(byte j=0; j<c2; j++)
                {
                    for(byte k=0; k<r2; k++)
                        sum+=arr[i][k]*arr2[k][j];
                    temp[i][j]=sum;
                    sum=0;
                }
            }                      
            System.out.println("\nMultiplication of two Matrices is : ");
            for(byte i=0; i<r2; i++)
            {
                for(byte j=0; j<c2; j++)
                    System.out.print(temp[i][j]+"   ");
                    System.out.println();
            }
        }        
        else
            System.out.println("Both matrix are of different size so multiplication is not possible.");
    }
    public void division()
    {
        float [][]flag=new float[4][4];
        if(r1==r2 && c1==c2)
        {
            System.out.println("\nDivision of two Matrices is : ");
            for(byte i=0; i<r2; i++)
            {
                for(byte j=0; j<c2; j++)
                    System.out.print(((float)arr[i][j]/arr2[i][j])+"   ");
                    System.out.println("");
            }
        }        
        else
            System.out.println("Both matrix are of different size so division is not possible.");
    }
    public void sumOfElements()
    {
        byte sum1=0;
        for(byte i=0; i<r1; i++)
            for(byte j=0; j<c1; j++)
                sum1+=arr[i][j];
        System.out.println("\nSum of all the Elements of 1st matrix : "+sum1);
        byte sum2=0;
        for(byte i=0; i<r2; i++)
            for(byte j=0; j<c2; j++)
                sum2+=arr2[i][j];
        System.out.print("\nSum of all the Elements of 2nd matrix : "+sum2);
    }
    public void transpose()
    {
        System.out.println("\nTranspose of 1st Matrix is : ");
        for(byte i=0; i<c1; i++)
        {
            for(byte j=0; j<r1; j++)
                System.out.print(arr[j][i]+"   ");
                System.out.println("");
        }
        System.out.println("\nTranspose of 2nd Matrix is : ");
        for(byte i=0; i<c2; i++)
        {
            for(byte j=0; j<r2; j++)
                System.out.print(arr2[j][i]+"   ");
                System.out.println("");
        }        
    }
    public void multiply(Scanner S1)
    {
        System.out.println("Enter the no. which we have to multiply 1st matrix :: ");
        byte m=S1.nextByte();
        for(byte i=0; i<r1; i++)
            for(byte j=0; j<c1; j++)
                arr[i][j]=m*arr[i][j];
        System.out.println("\n1st Matrix is : ");
        for(byte i=0; i<r1; i++)
        {
            for(byte j=0; j<c1; j++)
                System.out.print(arr[i][j]+"   ");
            System.out.println("");
        }
        System.out.println("Enter the no. which we have to multiply 2nd matrix :: ");
        byte m2=S1.nextByte();
        for(byte i=0; i<r2; i++)
            for(byte j=0; j<c2; j++)
                arr2[i][j]=m2*arr2[i][j];
        System.out.println("\n2nd Matrix is : ");
        for(byte i=0; i<r2; i++)
        {
            for(byte j=0; j<c2; j++)
                System.out.print(arr2[i][j]+"   ");
            System.out.println("");
        }
    }
}
public class Array2DMatrix
{
    public static void main(String []args)
    {
        System.out.println("---------Matrix Operations--------\n");
        Scanner S1=new Scanner(System.in);
        Matrix M1=new Matrix();
        //Get matrix from user and display.
        M1.getMatrix(S1);
        M1.addition();
        M1.subtraction();
        M1.multiplication();
        M1.division();
        M1.sumOfElements();
        M1.transpose();
        M1.multiply(S1);
    }
}
