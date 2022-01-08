package javaPrograms;

/**
 * Program to solve this expression and calculate the value of i & i1.
 */
class B1
{
    int i=1,i1=2;
    {
        i=i-- - --i + ++i1;
        i*=i1;
    }
    {
        i=i++ + ++i;
        i1/=i;
    }
}
class B extends B1
{
    {
        i=--i1-i--;
        i*=i;
    }
    {   i1=++i + i1++;     }
}
public class Main
{
    public static void main(String[] args)
    {
        B b=new B();
        System.out.println(b.i+"  "+b.i1);
    }
}
