package NewPackage;

abstract class A
{
    void fun1()
    {
        System.out.println("I am fun1 .");
    }
    abstract void fun2();
    abstract void fun3();
    abstract void fun4();
}
abstract class B extends A
{
    void fun2()
    {
        System.out.println("I am fun2.");
    }
    void fun3()
    {
        System.out.println("I am fun3.(CLASS-B)");
    }
}
class C extends B
{
    void fun3()
    {
        System.out.println("I am fun3.");
    }
    void fun4()
    {
        System.out.println("I am fun4.");
    }
}
public class AbstractClass
{
    public static void main(String[] args)
    {
        C obj1=new C();
        obj1.fun1();
        obj1.fun2();
        obj1.fun3();
        obj1.fun4();
        B obj2=new C();
        obj2.fun3();
    }
}