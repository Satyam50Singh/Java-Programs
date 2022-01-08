package BasicPrograms;


/**
 * Write to check a matrix is symmetric or not. 
 *
 */
import java.util.*;
public class SymmetricMatrix
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the no. of row and column :");
        byte r=S1.nextByte(),c=S1.nextByte();
 //       byte c=S1.nextByte();
        byte arr[][]=new byte[5][5];
        byte arr2[][]=new byte[5][5];
        System.out.println("Enter the elements :");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j]=S1.nextByte();
        System.out.println("Matrix is :");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++)
                System.out.print(arr[i][j]+" ");
        System.out.println();        
        }
        System.out.println("Transpose Matrix is :");
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++)
            {
                arr2[i][j]=arr[j][i];
                System.out.print(arr2[i][j]+" ");
            }
        System.out.println();        
        }
        int p=0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(arr[i][j]!=arr2[i][j])
                p=1;
            }        
        }
        if(p==0)
        System.out.println("Matrix is symmetric .");
        else
        System.out.println("Matrix is not symmetric .");
    }
}
