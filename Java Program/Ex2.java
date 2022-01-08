class Player
{
    void display(String str)
    {
        System.out.print("[ "+str);
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){}
        System.out.println("]");
    }
}
class Test extends Thread
{
    Player P1;
    String msg;
    Test(Player P,String s)
    {
        msg=s;
        P1=P;
    }
    public void run()
    {
        synchronized(P1)
        {
            P1.display(msg); 
        }
    }
}
public class Ex2
{
    public static void main(String[] args)
    {
        Test T1=new Test(new Player(),"Ram");
        Test T2=new Test(new Player(),"Shyam");
        T1.start();
        T2.start();
    }
}
