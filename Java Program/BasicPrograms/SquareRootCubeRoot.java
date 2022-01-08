package BasicPrograms;

import java.util.*;
import java.lang.Math;
/**Program to Calculate the squareroot and cuberoot of a no.s*/
class Calculus 
{
    public void square()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter a no. (SuareRoot):");
        float num=S1.nextFloat();
        System.out.println("Square root of "+num+" is "+Math.sqrt(num));
    }
    public void cube()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("\nEnter a no. (CubeRoot):");
        float num=S1.nextFloat();
        System.out.println("Cube root of "+num+" is "+Math.cbrt(num));        
    }
}
public class SquareRootCubeRoot
{
    public static void main(String[] args)
    {
        System.out.println("Program to Calculate the squareroot and cuberoot of a no.s");
        Calculus obj=new Calculus();
        obj.square();
        obj.cube();
    }
}
