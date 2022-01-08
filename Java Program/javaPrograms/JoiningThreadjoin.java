package javaPrograms;


public class JoiningThreadjoin extends Thread
{
    public void run()
    {
        String n1="Raj",n2="Simran";
        System.out.println("Thread-->"+n1);
        try{
            sleep(1500);
        }
        catch(InterruptedException I1){}
    
        System.out.println("Thread--> "+n2);
    }
    public static void main(String[] args)
    {
        JoiningThreadjoin J1=new JoiningThreadjoin();
        JoiningThreadjoin J2=new JoiningThreadjoin();
        J1.start();
        try{
            J1.join();
        }
        catch(InterruptedException I1){}
        J2.start();
        System.out.println(J1.isAlive());
        System.out.println(J2.isAlive());
    }
}
