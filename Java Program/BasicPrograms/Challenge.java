package BasicPrograms;

import java.util.*;

class Formula
{
    final float pie=3.14f;
    public void rectangle(float l,float b)
    {
        System.out.println("Area of Rectangle is :"+(l*b)); 
        System.out.println("Perimeter of Rectangle is :"+(2*(l+b))); 
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
}


public class Challenge
{
    public static void main(String[] args)
    {
        Formula C1=new Formula();
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to calculate Area And Perimeters of Geometrical Shapes.");
        while(true)
        {
            System.out.println("\n\t2D-Geometrical Shapes\n");
            System.out.println("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit\nEnter your choice :");
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
                    System.out.println("Enter the Base & height of Triangle :");
                    C1.triangleA((S1.nextFloat()),(S1.nextFloat()));
                    System.out.println("Enter the length of each side of Triangle :");
                    C1.triangleP((S1.nextFloat()),(S1.nextFloat()),(S1.nextFloat()));
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the Radius of Circle :");
                    C1.circle(S1.nextFloat());
                    break;
                }
                case 4:            
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
