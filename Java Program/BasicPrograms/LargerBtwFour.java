package BasicPrograms;

import java.util.Scanner;
/** Program to find a larger no. among four numbers.*/
public class LargerBtwFour
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to find a larger no. among four numbers.");
        System.out.print("\nEnter 1st Number :");
        byte A=S1.nextByte();
        System.out.print("\nEnter 2nd Number :");
        byte B=S1.nextByte();
        System.out.print("\nEnter 3rd Number :");
        byte C=S1.nextByte();
        System.out.print("\nEnter 4th Number :");
        byte D=S1.nextByte();
        String Str=(A>B?(A>C?(A>D?"\nLarger No. is "+A :"\nLarger No. is "+D ):(C>D?"\nLarger No. is "+C :"\nLarger No. is "+D)):B>C?(B>D?"Larger No. is "+B :"Larger No. is "+D ):(C>D?"Larger No. is "+C :"Larger No. is "+D));
        System.out.println(Str);
    }
}
