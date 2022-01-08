package javaPrograms;

import java.util.Scanner;
public class Array2D
{
    public static void main(String []args)
    {
        Scanner S1=new Scanner(System.in);
        /**Ways to declare and Initialise 2D array.*/
        /**1st Way*/
        int [][]arr1=new int[4][4];
        System.out.println("arr1[0][0] :"+arr1[0][0]);
        
        /**2nd Way*/
        int [][]arr2=new int[3][];
                
        /**3rd Way*/
        int [][]arr3;
        arr3= new int[2][]; 

        /**4th Way*/
        System.out.println("Enter the dimension for 2D array :");
            int r=S1.nextInt();
            int c=S1.nextInt();
        int [][]arr4=new int[r][c];
                System.out.println("arr4[0][0] :"+arr4[0][0]);
        /**5th Way to initialise*/
        int [][]arr5= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("arr5[0][0] :"+arr5[0][0]);
        
        /**6th Way to initialise by user*/
        int [][]arr6=new int[4][4];    
        System.out.println("Enter Variable of 2D array\n");
        for(int i=0; i<3 ; i++)
            for(int j=0; j<3 ; j++)
                arr6[i][j]=S1.nextInt();
                
        /**Printing 2D array*/
        System.out.println("\n2D array is :\n");
        for(int i=0; i<3 ; i++)
        {   for(int j=0; j<3 ; j++)
                System.out.print(arr6[i][j]+"  ");
                System.out.println("");
        }
    }
}
