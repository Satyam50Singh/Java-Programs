
package javaPrograms;

class Test extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Thread 1 "+(i+1));
        }
    }
}
class Test2 extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Thread 2 "+(i+1));
        }
    }
}
public class ThreadClass
{
    public static void main(String[] args)
    {
        Test T1=new Test();
        Test2 T2=new Test2();
        T1.start();
        T2.start();
    }
}
