package NewPackage;

import java.util.*;
class Vehicle 
{
    private String name;
    private int model_year;
    private int purchase_year;
    Scanner S1;
    Vehicle(Scanner S1)
    {   this.S1=S1;    }    
    public int getVehicleInfo()
    {
        System.out.print("\nEnter Vehicle Name : ");
        name=S1.nextLine();
        System.out.print("\nEnter Vehicle model year : ");
        model_year=S1.nextInt();
        System.out.print("\nEnter Vehicle purchase year  : ");
        purchase_year=S1.nextInt();        
        System.out.print("Enter Vehcile Category \n\t1 :Two Vehicle \n\t2 :Four Vehicle \n:");
        return S1.nextInt();
    }
    public void showVehicleInfo()
    {
        System.out.print("\nVehicle Details ::\n");
        System.out.print("\nName :"+name+"\nModel Year :"+model_year+"\nPurchase year :"+purchase_year);        
    }    
}
class Car extends Vehicle
{
    int str;
    String temp;
    Car(Scanner S1)
    {
        super(S1);
    }
    public void getDetails()
    {
        S1.nextLine();
        System.out.print("\nAC or Non AC :");
        temp=S1.nextLine();
        System.out.print("\nNo. of seater :");
        str=S1.nextInt();
    }
    void showDetails()
    {
        System.out.print("\nNo.of seats :"+str+"\nAc or Non-Ac :"+temp);
    }
}
class Bike extends Vehicle
{
    int str;
    String temp;
    Bike(Scanner S1)
    {
        super(S1);
    }
    public void getDetails()
    {
        S1.nextLine();
        System.out.print("\nScooty or Bike :");
        temp=S1.nextLine();
        System.out.print("\nMileage :");
        str=S1.nextInt();
    }
    void showDetails()
    {
        System.out.print("\nScooty or Bike :"+temp+"\nMileage :"+str+" km");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Hierarchial Inheritance\n");
        Car C1=new Car(S1);
        if(C1.getVehicleInfo()==1)
        {
            Bike B1=new Bike(S1);
            B1.getDetails();
            C1.showVehicleInfo();        
            B1.showDetails();
        }
        else if(C1.getVehicleInfo()==2)
        {
            C1.getDetails();
            C1.showVehicleInfo();        
            C1.showDetails();
        }
    }
}
