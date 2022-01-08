
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
    public void getVehicleInfo()
    {
        System.out.print("Enter Vehicle Name : ");
        name=S1.nextLine();
        System.out.print("\nEnter Vehicle model year : ");
        model_year=S1.nextInt();
        System.out.print("\nEnter Vehicle purchase year  : ");
        purchase_year=S1.nextInt();        
    }
    public void showVehicleInfo()
    {
        System.out.print("\nVehicle Details ::\n");
        System.out.print("\nName :"+name+"\nModel Year :"+model_year+"\nPurchase year :"+purchase_year);        
    }    
}
class Car extends Vehicle
{
    int seats;
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
        seats=S1.nextInt();
    }
    void showDetails()
    {
        System.out.print("\nNo.of seats :"+seats+"\nAc or Non-Ac :"+temp);
    }
}
public class SingleInheritance
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Simple Inheritance \n");
        Car C1=new Car(S1);
        C1.getVehicleInfo();
        C1.getDetails();
        C1.showVehicleInfo();        
        C1.showDetails();
    }
}
