package javaPrograms;
class Box
{
    private int len,brh,hei;
    public void setDimension(int l, int b, int h)
    {
        len=l;   brh=b;   hei=h;
    }
    public void showDimension()
    {
        System.out.println("Length is :"+len);
        System.out.println("Breadth is :"+brh);
        System.out.println("Height is :"+hei);
    }
}

public class ObjectClasses
{
    public static void main(String [] args)
    {
        Box smallBox=new Box();//Here we cannot declare a object for a class. 
                               //here smallBox is a reference variable. which hold the address of an object.
        smallBox.setDimension(12,15,18);
        smallBox.showDimension();
        
        Box B1;
        B1=new Box();
        
        B1.setDimension(20,30,40);
        B1.showDimension();        
    }
}