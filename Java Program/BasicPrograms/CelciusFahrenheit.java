package BasicPrograms;

import java.util.*;
/**Tempature Convertor.*/
class Temperature
{
    public void convert()
    {
        Scanner S1=new Scanner(System.in);
        while(true)
        {
            System.out.println("Temperatures Convertor");
            System.out.print("\n1.Celsius into Fahrenheit\n2.Fahrenheit into Celsius\n3.Exit\nEnter your choice :");
            byte ch=S1.nextByte();
            float cel,fahren,temp;
            switch(ch)
            {
                case 1: {   
                    System.out.println("\nEnter Temperature :");
                    cel=S1.nextFloat();
                    fahren=((cel*1.8f)+32);
                    System.out.println("Temperature in Fahrenheit :"+fahren);
                    break;
                }
                case 2:
                {
                    System.out.println("\nEnter Temperature :");
                    fahren=S1.nextFloat();
                    float flag=((fahren-32)*(5/9f));
                    System.out.println("Temperature in Celsius :"+flag);
                    break;
                }
                case 3:
                {   System.out.println("\nThanks for using.");
                    System.exit(0); }
                default:
                {   System.out.println("\nWrong Choice!!.");  }
            };
        }
    }
}
public class CelciusFahrenheit
{
    public static void main(String[] args)
    {
        Temperature T1=new Temperature();
        T1.convert();
    }    
}
