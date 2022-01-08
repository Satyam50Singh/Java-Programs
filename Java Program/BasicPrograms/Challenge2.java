package BasicPrograms;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a 7 digit number : ");
        int n = in.nextInt();
        
        System.out.println("Today is my fi\nnal exam");
        System.out.print("Computer Leraing is funn");
        System.out.println("sbd");
        int count=0;
        int temp = n;
         while (temp != 0) {
          temp /= 10;
          ++count;
        }
        
        if(count == 7){
            temp=n;
            int evenDigit=0,oddDigit=0;
            while(temp>0)
            {
                int rem=temp%10;
                if(rem%2==0)
                    evenDigit++;
                else
                    oddDigit++;
                temp/=10;
            }        
            System.out.println("\nNo. of Even digits in a number is : "+evenDigit);
            System.out.println("\nNo. of Odd digits in a number is : "+oddDigit);
        }
        else {
            System.out.println("Invailed Input !!Number of digits in entered number: "+count);
        }
        //System.out.println("Number of digits in entered number: " + count);
    }
}
