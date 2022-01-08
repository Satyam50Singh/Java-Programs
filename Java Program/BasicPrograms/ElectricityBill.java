package BasicPrograms;
import java.util.*;
class Electricity
{
    private byte unitsConsumed;
    private float charge;
    private String name,consumerNumber;
    void getCustumerDetail(Scanner S1)
    {
        System.out.print("Enter Your Name : ");
        name=S1.nextLine();
        System.out.print("\nEnter Your Consumer Number : ");
        consumerNumber=S1.nextLine();
        System.out.print("\nEnter Number of units you consumed : ");
        unitsConsumed=S1.nextByte();        
    }
    void calculateBill()
    {
        if(unitsConsumed<=100)
            charge=unitsConsumed*0.8f;
        else if(unitsConsumed>100 && unitsConsumed<200)
            charge=unitsConsumed*1;
        else if(unitsConsumed>200)
            charge=unitsConsumed*1.25f;
        System.out.println("\nElectricty Bill (Charges) :: "+charge);
    }
}
public class ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        Electricity E1=new Electricity();
        E1.getCustumerDetail(S1);
        E1.calculateBill();        
    }
}
