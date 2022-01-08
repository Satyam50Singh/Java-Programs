package BasicPrograms;

import java.util.*;
/**Program to Add marks of all subject of student and calculate it's percentage.*/
class Student
{
    private byte M1,M2,M3,M4,M5;
    private float totalMark;
    public void getMarks()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter total marks :");
        totalMark=S1.nextFloat();
        System.out.println("Enter marks of Subject 1 :");
        M1=S1.nextByte();
        System.out.println("Enter marks of Subject 2 :");
        M2=S1.nextByte();
        System.out.println("Enter marks of Subject 3 :");
        M3=S1.nextByte();
        System.out.println("Enter marks of Subject 4 :");
        M4=S1.nextByte();
        System.out.println("Enter marks of Subject 5 :");
        M5=S1.nextByte();
    }
    public void  addPercent()
    {
        System.out.println("Sum of all marks is :"+(M1+M2+M3+M4+M5));
        System.out.println("Percentage is :"+((float)(((M1+M2+M3+M4+M5)*100)/totalMark))+" %");
    }
}
public class MarksPercent
{
    public static void main(String []args)
    {
        Student s1=new Student();
        s1.getMarks();
        s1.addPercent();
    }
}
