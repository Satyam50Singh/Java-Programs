package BasicPrograms;

import java.util.*;

/**
 * Program to calculate Area And Perimeters of Geometrical Shapes.
 * 
 *              Areas
 * Area of Rectangle is length*breadth
 * Area of Square is side*side
 * Area of Triangle is 1/2(base*height)
 * Area of Circle is pie*rad*rad
 * Area of Rhombus is base * height
 * Area of Parallelogram is base*vertical height
 * Area of Traperzium is 1/2(Sum of parallel side)*(Perpendicular dist btw them)
 * 
 *              Perimeters
 * Perimeter of Rectangle is 2(length+breadth)
 * Perimeter of Square is 4*side
 * Perimeter of Triangle is side1+side2+side3
 * Perimeter of Rhombus is 4*side  
 * Perimeter of Parallelogram is 2(Sum of Adjacent sides)
 * 
 */
class Formula
{
    final float pie=3.14f;
    public void rectangle(float l,float b)
    {
        System.out.println("Area of Rectangle is :"+(l*b)); 
        System.out.println("Perimeter of Rectangle is :"+(2*(l+b))); 
    }
    public void square(float s)
    {
        System.out.println("Area of Square is :"+(s*s)); 
        System.out.println("Perimeter of Square is :"+(4*s)); 
    }
    public void triangleA(float b,float h)
    {
        System.out.println("Area of Triangle is :"+(0.5*b*h));         
    }
    public void triangleP(float s1,float s2,float s3)
    {
        System.out.println("Perimeter of Triangle is :"+(s1+s2+s3));         
    }
    public void circle(float r)
    {
        System.out.println("Area of Circle is :"+(pie*r*r));         
        System.out.println("Circumference of Circle is :"+(2*pie*r));         
    }
    public void rhombusA(float b,float h)
    {
        System.out.println("Area of Rhombus is :"+(b*h));         
    }
    public void rhombusP(float s)
    {
        System.out.println("Perimeter of Rhombus is :"+(s*4));         
    }
    public void parallelogramA(float b,float vh)
    {
        System.out.println("Area of Parallelogram is :"+(b*vh));         
    }
    public void parallelogramP(float s1,float s2)
    {
        System.out.println("Perimeter of Parallelogram is :"+(2*(s1+s2)));                 
    }
    public void traperziumP(float s1,float s2,float d)
    {
        System.out.println("Area of Traperzium is :"+(0.5*(s1+s2)*d));         
    }
}
public class AreaAndPerimeter
{
    public static void main(String[] args)
    {
        Formula C1=new Formula();
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to calculate Area And Perimeters of Geometrical Shapes.");
        while(true)
        {
            System.out.println("\n\t2D-Geometrical Shapes\n");
            System.out.println("1.Rectangle\n2.Square\n3.Triangle\n4.Circle\n5.Rhombus\n6.Parallelogram\n7.Traperzium\n8.Exit\nEnter your choice :");
            switch(S1.nextByte())
            {
                case 1:
                {
                    System.out.println("Enter Length and Breadth of Rectangle:");
                    C1.rectangle((S1.nextFloat()),(S1.nextFloat()));
                    break;
                }
                case 2: 
                {
                    System.out.println("Enter side of Square :");
                    C1.square(S1.nextFloat());
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the Base & height of Triangle :");
                    C1.triangleA((S1.nextFloat()),(S1.nextFloat()));
                    System.out.println("Enter the length of each side of Triangle :");
                    C1.triangleP((S1.nextFloat()),(S1.nextFloat()),(S1.nextFloat()));
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the Radius of Circle :");
                    C1.circle(S1.nextFloat());
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the Base & height of Rhombus :");
                    C1.rhombusA((S1.nextFloat()),(S1.nextFloat()));
                    System.out.println("Enter the length of each side of Rhombus :");
                    C1.rhombusP(S1.nextFloat());
                    break;
                }
                case 6:            
                {
                    System.out.println("Enter the base and Vertical height of Parallelogram :");
                    C1.parallelogramA((S1.nextFloat()),(S1.nextFloat()));
                    System.out.println("Enter the length of each Adjacent side of Parallelogram :");
                    C1.parallelogramP((S1.nextFloat()),(S1.nextFloat()));
                    break;
                }
                case 7:
                {
                    System.out.println("Enter the length of parallel side & distance btw them of Traperzium :");
                    C1.traperziumP((S1.nextFloat()),(S1.nextFloat()),(S1.nextFloat()));
                    break;
                }
                case 8:            
                {
                    System.out.println("\nThanks for using.");
                    System.exit(0);
                }
                default :            
                {
                    System.out.println("Wrong Choice.!");
                    break;
                }
            };
        }
    }
}
