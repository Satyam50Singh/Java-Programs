package BasicPrograms;
import java.util.*;
class Matrixh 
{
    private int r,c;
    int arr[][]=new int[4][4];
    void getMatrix(Scanner S1)
    {
        System.out.println("Enter no. of rows and columns : ");
        r=S1.nextInt();
        c=S1.nextInt();
        System.out.println("Enter Elements :");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j]=S1.nextInt();                
        System.out.println("Matrix is :");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
                System.out.print(arr[i][j]+"    ");
            System.out.println("\n");
        }
    }
    void Transpose()
    {
        System.out.println("Transpose of a matrix : ");
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<r; j++)
                System.out.print(arr[j][i]+"    ");
            System.out.println("\n");
        }
    }
}
public class MatrixTranspose
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Matrix M1=new Matrix();
        M1.getMatrix(S1);
        M1.transpose();
    }
}
