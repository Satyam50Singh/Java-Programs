package javaPrograms;


/**
 * There are 8 different type of DataTypes
 *   Datatype    Size           Nature
 *   byte       1 byte  Store Integer Values Range from -128 to 127
 *   short      2 byte  Store Integer Values Range from -32768 to 32768
 *   int        4 byte  Store Integer Values Range from -2,147,483,648 to 2,147,483,647
 *   long       8 byte  Store Integer Values
 *   float      4 byte  Store Float Values 
 *   double     8 byte  Store Double Values
 *   char       2 byte  Store Single Characters/letter or ASCII value
 *   boolean    1 bit   Store True And False
 */
import java.util.Scanner;
public class Datatypes
{
    
    public static void main(String []args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Byte Value :");
        byte p=input.nextByte();
        System.out.println("Enter Short Value :");
        short q=input.nextShort();
        System.out.println("Enter Integer Value :");
        int r=input.nextInt();
        System.out.println("Enter Long Value :");
        long s=input.nextLong();
        System.out.println("Enter Float Value :");
        float t=input.nextFloat();
        System.out.println("Enter Double Value :");
        double u=input.nextDouble();
        System.out.println("Enter Character :");
        char v=input.next().charAt(0);
        System.out.println("Enter Boolean :");
        boolean w=input.nextBoolean();
        
        System.out.println("\nByte Value is :"+p);
        System.out.println("Short Value is :"+q);
        System.out.println("Integer Value is :"+r);
        System.out.println("Long Value is :"+s);
        System.out.println("Float Value is :"+t);
        System.out.println("Double Value is :"+u);
        System.out.println("Character Value is :"+v);
        System.out.println("Bool Value is :"+w);
        
    }
}
