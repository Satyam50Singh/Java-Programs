package javaPrograms;

class Paper{}
class Pen{}
public class Deadlock
{
    public static void main(String[] args)
    {
        final Paper pr=new Paper();
        final Pen pn=new Pen();        
        Thread T1=new Thread(){
            public void run()
            {
                synchronized(pn)
                {
                    System.out.println("Thread1 is holding Pen");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException E){}
                    synchronized(pr)
                    {   
                        System.out.println("Paper is waiting ");
                    }
                }
            }
        };
        Thread T2=new Thread(){
            
            public void run()
            {
                synchronized(pr)
                {
                    System.out.println("Thread2 is holding Paper");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException E){}
                    synchronized(pn)
                    {   
                        System.out.println("Pen is waiting");
                    }
                }
            }
        };
        T1.start();
        T2.start();        
    }
}
