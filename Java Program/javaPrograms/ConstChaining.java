package javaPrograms;

/**
 *Constructor Chaining.
 *First line of the Constructor is either this() or super().
 *Constructor can never contains super() and this() both.
 */
class Fruits
{
    public Fruits()
    {
        this(45);
        System.out.println("Fruits");   //2
    }
    public Fruits(int d)
    {   System.out.println("Fruits No."+d);   }     //1
}
class Apple extends Fruits
{
    public Apple()
    {
        this(12);
        System.out.println("Apple");        //4
    }
    public Apple(int k)
    {
        super();
        System.out.println("Apple no."+k);     //3           
    }
}
public class ConstChaining
{
    public static void main(String[] args)
    {    Apple obj=new Apple();    }    
}
