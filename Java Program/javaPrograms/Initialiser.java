package javaPrograms;


/**
 * Initialisers are of two typs :Instance,Static
 *Instance initialser is run for every objects.
 *Static Initialiser is only for class so it execute only a sinle time.
 */
public class Initialiser
{
    private int x;
    static int y;
    {   //Instance Initialiser
        System.out.println("Value of x is :"+x);
        x=5;
    }
    static //Static Initialiser
    {
        System.out.println("Value of Y is :"+y);
        y=15;        
    }
    Initialiser()
    {
        System.out.print("Value of x (Constructor) :"+x);
    }
    public static void main(String[] args)
    {
        System.out.println("At one object \n");
        Initialiser obj=new Initialiser();
        System.out.println("\n\nAt second object \n");
        Initialiser obj1=new Initialiser();          
    }
}
