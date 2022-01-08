package BasicPrograms;


/**
 * Write a description of class MirrorMatrix here.
 * 
 * Write a program to display the mirror image of a 2D-matrix.  
 */
import java.util.*;
public class MirrorMatrix
{
    public static void main(String[] args)
    {        
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the no. of row and column :");
        int r=S1.nextByte();
        int c=S1.nextByte();
        byte arr[][]=new byte[5][5];
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
        System.out.println("Mirror Matrix is :");
        for(int i=0; i<r; i++){
            for(int j=c-1; j>=0; j--)
                System.out.print(arr[i][j]+" ");
        System.out.println();        
        }
    }
}
