package javaPrograms;
/**
 * If two method of a same class (Whether both declared in the same class,or both inherited
 * by a class,or one declared and one inherited)have the samename but signatures that 
 * are not same ,then the method is said to be overloaded.
 */
class A
{
    private int len,brh;
    public void Area(int x,int y)
    {    len=x;  brh=y;     }
    public void Rectangle()
    {
        System.out.println("Area of Circle is :"+(len*brh));
    }
}
class B extends A
{
    private float radius;
    public void Area(float r)
    {   radius=r;    }
    public void Circle()
    {
        System.out.println("Area of Circle is :"+(radius*radius));
    }
}
public class Overloading
{
    public static void main(String[] args)
    {
        B obj1=new B();
        obj1.Area(12.4f);
        obj1.Area(4,6);
        obj1.Rectangle();
        obj1.Circle();
    }
}
