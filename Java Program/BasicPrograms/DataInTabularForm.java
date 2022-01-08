package BasicPrograms;
import java.util.*;
class Student
{
    Scanner S1;
    public byte n,age;
    Student(Scanner S1,byte n)
    {
        this.S1=S1;
        this.n=n;
    }
    private String name[]=new String[10],phoneno[]=new String[10];
    private String address[]=new String[10];
    public void getData()
    {
        for(int i=0; i<n; i++)
        {
            System.out.println("Student no. "+(i+1));
            System.out.print("\nEnter your name :-");
            name[i]=S1.nextLine();
            System.out.print("Enter your age :-");
            age=S1.nextByte();
            S1.nextLine();
            System.out.print("Enter your phoneno. :-");
            phoneno[i]=S1.nextLine();
            System.out.print("Enter your Address :-");
            address[i]=S1.nextLine();
        }
    }
    public void showData()
    {
        System.out.println("\nNAME\t\tAGE\tPHONE NO.\tAddress\n");
        for(int i=0; i<n; i++)
        {
            System.out.println(name[i]+"\t"+age+"\t"+phoneno[i]+"\t"+address[i]);
        }
    }
}
public class DataInTabularForm
{
    public static void main(String[] args)
    {
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter the no. of student :");
        byte n=S1.nextByte();
        S1.nextLine();
        Student obj=new Student(S1,n);
        obj.getData();
        obj.showData();
    }
}