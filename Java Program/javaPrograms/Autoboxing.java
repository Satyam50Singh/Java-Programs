package javaPrograms;

/**
 * Autoboxing is converting primitive datatype in Wrapper classes objects.
 * 
   */
public class Autoboxing
{
    public static void main(String[] args)
    {
        int i=100;
        System.out.println("Autoboxing");
        Integer O1=Integer.valueOf(i);
        Integer O2=12; //Autoboxing 
        System.out.println("O1 : "+O1);
        System.out.println("O2 : "+O2);
        System.out.println("O1 instanceof Integer : "+(O1 instanceof Integer));
        
    }
}
