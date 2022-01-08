package javaPrograms;


/**
 * Write a description of class ForEachLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForEachLoop
{
    public static void main(String[] args)
    {
        int arr[]=new int[10];//using new 
        int arr2[]={1,2,3,4,5}; //using literals
        System.out.print("\nUsage of For-each loop with Array : ");
        for(int i: arr2)
        {
            System.out.print(i +",");
        }
        System.out.print("\nUsage of For-each loop with String : ");
        String[] Str={"Satyam","Rahul"};
        for(String S : Str)
        {
            System.out.print(S+",");
        }
        
    }
}
