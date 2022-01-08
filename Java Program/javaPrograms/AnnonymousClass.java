package javaPrograms;
interface Game
{
    void G1();
    void G2();
}
class Example 
{
    void F1()
    {
        System.out.println("Method inside Super class");
    }
    void F2()
    {
        System.out.println("Another Method inside Super class");
    }
}
class Test 
{
    Example E1=new Example(){
        void F1()
        {
            System.out.println("Method inside annonymous class");
        }
    };
    Game g=new Game(){
        public void G1()
        {
            System.out.println("Method inside annonymous class by using interface keyword.");
        }
        public void G2()
        {
            System.out.println("AnotherMethod inside annonymous class by using interface keyword.");
        }
    };
    void F2()
    {
        System.out.println("Another Method inside Annonymous class");
        g.G1(); //CALLING OUTSIDE INNER CLASS
    }
}
public class AnnonymousClass
{
    public static void main(String[] args)
    {
        Test T1=new Test();
        T1.E1.F1();
        T1.F2();
        T1.g.G2(); //CALLING INSIDE INNER CLASS
        Example E1=new Example();
        E1.F1();
        E1.F2();
    }
}
