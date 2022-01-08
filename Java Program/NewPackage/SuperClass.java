package NewPackage;

class A
{
    A()
    {
        this(12);
        System.out.println("I'm A() of class A");
    }
    A(int x)
    {
        System.out.println("I'm A(int) of class A :: A "+x);
    }
    public void fun1()
    {
        this.fun2();
        System.out.println("I'm fun1() of class A");
    }
    public void fun2()
    {
        System.out.println("I'm fun2() of class A");
    }
}
class B extends A
{
    B()
    {
        super();
        super.fun1();
        this.fun1();
        System.out.println("I'm B() of class B");
    }
    public void fun1()
    {
        System.out.println("I'm fun1() of class B");
        this.fun2();
    }
    public void enjoy2()
    {
        System.out.println("I'm enjoy2() of class B");
    }
    
}
public class SuperClass
{
    public static void main(String[] args)
    {
        B obj=new B();
    }
}
