package javaPrograms;


/**
 * Static member in Inheritance. 
 *static member variable do not inherit.
 *static and instance member function boths can inherit.
 */
class Parent
{
    static int y;   //static member variable
    public static void Snake()
    {
        System.out.println("Parent's Snake Class");
    }
    public static void Game()   //static member function
    {
        System.out.println("Parent's Game Class");
    }
}
class Child extends Parent
{
    static {
        y=17;
    }
    public static void Game()   //this function hides the Game fun of Superclass.
    {
        System.out.println("Children Class");
    }
}
public class FunctionHiding
{
    public static void main(String[] args)
    {
        Child obj=new Child();
        obj.Game();
        obj.Snake();
        System.out.println("Value of y :"+Child.y);
        
        Parent obj1=new Parent();
        obj1.Game();
    }
}
