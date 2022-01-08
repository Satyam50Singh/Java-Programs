package javaPrograms;

/**
 * Interface just only specify the method declaration(implicitly public & abstract) and can only contains fields (which are implicitly public static final).
 * Data Variables inside the interface are public static final by default.
 * Member function inside the Interface are public abstract by default.
 * Interface does have Constructor bcoz its data member variables are static in nature.
 * Those member fn declared inside the block of interface then these must be defined by that class who implement that particular interface.
 * 
 */
interface Data
{
    byte Rec=12; //public static variable
    void getDetails(String name,int rollno,String Address);
    void showDetails();
}
class Students implements Data
{
    private String name,Address;
    private int rollno;
    public void showDetails()
    {
        System.out.println("Name is :"+name+"\nRollno :"+rollno+"\nAddress is :"+Address);
    }
    public void getDetails(String n,int r,String A)
    {
        name=n;
        rollno=r; 
        Address=A;
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        Students S1=new Students();
        S1.getDetails("Arun",56,"Maharashtra");
        S1.showDetails();
 }
    
}
