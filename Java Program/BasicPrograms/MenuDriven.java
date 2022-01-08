package BasicPrograms;

import java.util.Scanner;
class Demo
{
    Scanner S1;
    Demo(Scanner S1)
    { this.S1=S1;   }
    public void cube()
    {
        System.out.print("Enter the length of side of a cube : ");
        float side=S1.nextFloat();
        System.out.println("Volume of cube is : "+side*side*side);
        System.out.println("Area of cube is : "+6*side*side);
    }
    public void cuboid()
    {
        System.out.print("Enter the length of a cuboid : ");
        float len=S1.nextFloat();
        System.out.print("Enter the breadth of a cuboid : ");
        float brh=S1.nextFloat();
        System.out.print("Enter the height of a cuboid : ");
        float hei=S1.nextFloat();
        float cvol=len*brh*hei;
        float carea=2*(len*brh+brh*hei+hei*len);
        System.out.println("Volume of cuboid is : "+cvol);
        System.out.println("Area of cuboid is : "+carea);
    }
}
public class MenuDriven
{
    public static void main(String[] args)
    {
        System.out.println("Menu-Driven Program to Calculation of Volume And Area.\n");
        Scanner S1=new Scanner(System.in);
        Demo D1=new Demo(S1);
        System.out.println("1. Cube \n\n2. Cuboid\n\nEnter your choice :");
        int choice =S1.nextInt();
        switch (choice)
        {
            case 1: D1.cube();  break;
            case 2: D1.cuboid(); break;
            default: System.out.println("Wrong Choice!!");
        }       
    }
}
