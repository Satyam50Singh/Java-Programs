package interviewQuestions;

import java.util.Scanner;
class Demo {
    public void getArray(Scanner S1) {
        int[][] twoD_arr = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                twoD_arr=S1.nextInt();
            }
        }

    }
    public void showArray() {
    
    }
}
public class Array2DSorting
{
    public static void main(String[] args) {
        Demo d1= new Demo();
        Scanner S1= new Scanner(System.in);
        System.out.println("Enter values : ");  
        d1.getArray(S1);
        d1.showArray();
    }
}
