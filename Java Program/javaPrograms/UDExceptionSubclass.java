package javaPrograms;

class Test extends Exception
{
    int A;
    Test(int a)
    {   A=a;    }
    public String toString()
    {
        return "My Exception ["+A+"] is less than zero.";
    }
}
public class UDExceptionSubclass 
{
    static void sum(int a, int b) throws Test
    {
        if(a<0)
        {   throw new Test(a);  }
        else 
        {   System.out.println(a+b);    }
    }
    public static void main(String[] args)
    {
        try
        {            
            sum(-10,6);
        }
        catch(Test a)
        {
            System.out.println(a);
        }
    }
    
}
