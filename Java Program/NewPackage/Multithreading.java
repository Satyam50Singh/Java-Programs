package NewPackage;


class Demo extends Thread
{
    public void run()
    {
            for(int j=0; j<=10; j++)
                System.out.println("* ");
    }
    
}
class Demo2 extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print("* ");
                System.out.print("\n");
        }
    }
    
}
public class Multithreading
{
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        Demo2 d2=new Demo2();
        d1.start();
        try{
        System.out.println(d1.isAlive());
            d2.sleep(100);
        }catch(InterruptedException e)
        {
            
        }
        d2.start();
    }
}
