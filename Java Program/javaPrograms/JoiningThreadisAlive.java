package javaPrograms;

public class JoiningThreadisAlive extends Thread
{
    public void run()
    {
        String n1="Raj",n2="Simran";
        System.out.println("Thread-->"+n1);
        try{
            Thread.sleep(1500);
        }
        catch(InterruptedException I1){}
    
        System.out.println("Thread--> "+n2);
    }
    public static void main(String[] args)
    {
        JoiningThreadisAlive J1=new JoiningThreadisAlive();
        JoiningThreadisAlive J2=new JoiningThreadisAlive();
        J1.start();
        J2.start();
        System.out.println(J1.isAlive());
        System.out.println(J2.isAlive());
    }
}
