package javaPrograms;

class Car
{
    String color,name;
    int modelyear,Vehicleno;
    public void getData(String n,String c,int m,int V)
    {
        name=n;
        color=c;
        modelyear=m;
        Vehicleno=V;
    }
    public void showDetails()
    {
        System.out.println("Car Name :"+name+"\nColor :"+color+"\nModel Year :"+modelyear+"\nVehicleno :"+Vehicleno);
    }
}

class SportsCar extends Car
{
    int gear;
    public void getDetails(int G)
    {
        gear=G;
    }
    public int Gear()
    {   return gear;  }
}

class RaceCar extends Car
{
    int milege;
    public void getMilegeDetail(int G)
    {
        milege=G;
    }
    public int milege()
    {   return milege;  }
}

public class HierarchialInheritance
{
    public static void main(String []args)
    {
        //SportsCar Details...
        System.out.println("-------------Sports Car-------------");
        SportsCar obj1=new SportsCar();
        obj1.getData("CretaX","Greyish",2012,989);
        obj1.getDetails(5);
        obj1.showDetails();
        System.out.println("No. of Gears : "+obj1.Gear());
        System.out.println("\n--------------Race Car-------------");

        //RaceCar Details..
        RaceCar obj2=new RaceCar();
        obj2.getData("Maruti","White",1998,99);
        obj2.getMilegeDetail(18);
        obj2.showDetails();
        System.out.println("Milege : "+obj2.milege);        
    }
}
