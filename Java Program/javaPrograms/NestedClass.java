package javaPrograms;

class Outer //  Outer Class with static inner class
{
    static int x=3; //static variable
    static class Inner  //static inner class
    {
        void if1()
        {
            System.out.println("Static var x of outer class inside static inner class  : "+x);
        }
    }
}
class Outer1    //  Outer Class with non-static inner class
{
    static int y=10;
    class Inner1
    {
        void i1f1()
        {
            System.out.println("Static var y of another outer class inside non-static inner class :"+y);
        }
        
    }
}
public class NestedClass
{
    public static void main(String[] args)
    {
        //calling of methods of static inner class
        Outer.Inner obj=new Outer.Inner();  //Object of static inner class
        obj.if1();
        Outer ob=new Outer();//Object of Outer class having static inner class 
        System.out.println("X : "+ob.x);
        
        //calling of methods of non-static inner class
        Outer1 o1=new Outer1();//Object of Outer class having non-static inner class 
        Outer1.Inner1 obj2=o1.new Inner1();//Object of non-static inner class
        obj2.i1f1();
        System.out.println("Y : "+o1.y);
    }
}