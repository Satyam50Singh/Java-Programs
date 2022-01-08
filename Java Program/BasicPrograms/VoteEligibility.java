package BasicPrograms;

import java.util.*;
/** Program to check a person is eligible for voting or not by using ternary operator.*/
public class VoteEligibility
{
    public static void main(String []args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Program to check a person is eligible for voting or not by using ternary operator");
        System.out.println("Enter age :");
        byte age=S1.nextByte();
        System.out.println(age>=18?"Yes,Person is eligible":"No,Person is not eligible");
    }
}
