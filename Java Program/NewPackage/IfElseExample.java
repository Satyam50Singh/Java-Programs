package NewPackage;


public class IfElseExample
{
    public static void main(String[] args)
    {
        int a=12,b=0,c=-11;
        if(a!=b || b!=c || a!=c)
        {
            if(a>b)
            {   
                if(a>c)
                    System.out.println("a Value is greater");
            }
            else if(b>c)
                System.out.println("b Value is greater");
            else
                System.out.println("c Value is greater");
        }
        else
        {
            if(a==b)
                System.out.println("a==b");
            else if(b==c)
                System.out.println("b==c");
            else if(a==c)
                System.out.println("a==c");
        }
    }
}
