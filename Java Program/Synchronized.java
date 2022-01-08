import java.util.Scanner;
class Account
{
    private int bal;
    Account()
    {    bal=1000;  }
    boolean isSufficient(int amt)
    {
        if(amt<bal)
            return true;
        else
            return false;
    }
    public void withdrawal(int amt)
    {
        bal=bal-amt;
        System.out.println("Withdrawal Money is "+amt);
        System.out.println("Your Current amount is "+bal);
    }
}
class Customer implements Runnable
{
    String name;
    private Account A1;
    Customer(String n,Account A)
    {
        A1=A;
        name=n;
    }
    public void run()
    {
           Scanner S1=new Scanner(System.in);
           System.out.println(name+",Enter amount to withdraw ");
           int amt=S1.nextInt(); 
        synchronized(A1)
        {
           if(A1.isSufficient(amt))
           {
               System.out.println(name);
               A1.withdrawal(amt);
           }
           else
               System.out.println("Insufficient Balance.");
        }
    }
}
public class Synchronized
{
    public static void main(String[] args)
    {
        Customer C1=new Customer("Raj",new Account());
        Customer C2=new Customer("Simran",new Account());
        Thread T1=new Thread(C1);
        Thread T2=new Thread(C2);
        T1.start();
        T2.start();
    }
}