//here we are studying about how to pass aruments in a main fn.
package javaPrograms;

public class Arguments
{
    public static void main(String[] args)
    {
        int s=0;
        System.out.println("Arguments are :");
        for(int i=0; i<args.length; i++)
        {
            
            s=s+Integer.parseInt(args[i]);
            System.out.print(args[i]+"  ");
        }
        System.out.println("\nSum of values of all aruments :"+s);
    }
}