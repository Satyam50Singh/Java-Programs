package BasicPrograms;

import java.util.*;
/**Program to calculate the Profit and loss.
 * 
 * Profit=Selling Price-Cost Price
 * Loss=Cost Price-Selling Price
 */
class Exercise
{
    private float sp,cp;
    public void calculus(Scanner S)
    {
        System.out.println("Enter Selling Price :");
        sp=S.nextFloat();
        System.out.println("Enter Cost Price :");
        cp=S.nextFloat();
        if(sp>cp)
            System.out.println("Here Selling price is greater than cost price\nHence the Profit amount is "+(sp-cp));
        else
            System.out.println("Here Selling price is lesser than cost price\nHence the Loss ampunt is "+(cp-sp));
    }
}
public class ProfitLoss
{
    public static void main(String[] args)
    {
        Exercise E1=new Exercise ();
        Scanner S1=new Scanner (System.in);
        E1.calculus(S1);
        
    }
}
