package BasicPrograms;
import java.util.Scanner;
class Calculation
{
    short a,b;
    Scanner S1;
    Calculation(Scanner S1)
    {
        this.S1=S1;
    }
    public void getData()
    {   
        System.out.println("Enter two Numbers : ");        
        a=S1.nextShort();        
        b=S1.nextShort();
        System.out.println("First Value is :"+a+"\nSecond Value is :"+b);    
    }
    public void Add()
    {   System.out.println("Addition is :"+(a+b)); }        
    public void Sub()
    {   System.out.println("Subraction is :"+(a-b));   }
    public void Multiply()
    {   System.out.println("Multiplication is :"+(a*b));    }
    public void Divide()
    {   System.out.println("Division is :"+(float)((float)a/(float)b));    }
}
public class Calculator
{
    public static void main(String[] args)
    {
            Scanner S1=new Scanner(System.in);
        Calculation obj=new Calculation(S1);
        while(true)
        {
            System.out.println("<--------Calculator------------>\n");        
            System.out.println("\n1.Add\n2.Subtraction\n3.Mutiplication\n4.Divide\n5.Exit");        
            System.out.println("\nEnter your choice :");
            byte choice=S1.nextByte();
            if(choice!=5)
            {
                 obj.getData();
            }
            switch(choice)
            {
                case 1: obj.Add();  break;
                case 2: obj.Sub();  break;
                case 3: obj.Multiply();  break;
                case 4: obj.Divide();  break;
                case 5: System.out.println("Thanks for Using :");    System.exit(0);
                default :    System.out.println("Wrong Choice.!!!");  break;
            }
//            System.out.println("<----------------------------->");        
  //          System.out.println("\n<=============================>\n");        
        }
    }
}
