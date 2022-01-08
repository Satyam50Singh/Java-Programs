package javaPrograms;


/**
 */
abstract class Account
{
    abstract void Fun();
}
class SavingAccount extends Account
{
    void Fun()
    {
        System.out.println("Abstract Fun Function");
    }
}
public class AbstractMethods
{
    public static void main(String[] args)
    {
        SavingAccount A1=new SavingAccount();
        A1.Fun();
    }
}
