package javaPrograms;


/**
 * Unboxing is converting wrapper class object in primitive datatype.
 */
public class Unboxing
{
    public static void main(String[] args)
    {
        System.out.println("Unboxing");
        Integer O1=new Integer(10);
        int a=O1.intValue();
        int j=O1; //Unboxing
        System.out.println("a : "+a);
        System.out.println("j : "+j);
    }
}
