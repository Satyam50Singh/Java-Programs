package NewPackage;
@interface inherited
{
    int a() default 12;
}

@inherited(a=12)
class A
{
    public void func1()
    {
        System.out.print("func1 method of class B");
    }
}
class B extends A
{
    @Override
    public void func1()
    {
        System.out.print("func1 method of class B");
    }
}
public class Annotations
{
    public static void main(String[] args)
    {
        B o1=new B();
        o1.func1();
        
    }
}
