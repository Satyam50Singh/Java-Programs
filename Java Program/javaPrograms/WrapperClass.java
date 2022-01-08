//Program to understand the Concept of Wrapper Class.
package javaPrograms;
public class WrapperClass
{
    public static void main(String[] args)
    {
        //Using valueOf() with different Primitive Classes.
        Integer i1=Integer.valueOf("123");
        System.out.println("Value of i1 (Object of Integer Class) :"+i1);
        Integer i2=Integer.valueOf("111",2);
        System.out.println("Value of i2 (Object of Integer Class) :"+i2);//Binary Form
        Double d1=Double.valueOf("3.14");
        System.out.println("Value of d1 (Object of Double Class) :"+d1);
    
        //Using parseXxx()
        /*
           *parseXxx() is used to convert string into its desired Format
           *parseXxx() returns the value of Xxx type value.
        */
        
        int val=Integer.parseInt("1999");
        System.out.println("\nValue of val (Object of Integer Class) :"+val);
        
        float val2=Float.parseFloat("112.89f");
        System.out.println("Value of val2 (Object of Float Class) :"+val2);
        
        //Using xxxValue()
        /*
           *return corresponding primitive value 
        */
        
        int flag=i1.intValue();
        System.out.println("\nValue of flag (Usage of xxxValue ()) :"+flag);
       
        
    }
}
