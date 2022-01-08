package javaPrograms;
class Test
{
    int x;//instance variable
          //x is variable for all objects.
    static int y; //static member variable
                  //we does not require an object of class to access static variables.
                  
    void fun() //instance function
    { 
        x=20;
        System.out.println("Value of Instance/Non-Static Variable X is :"+x+" (Accessing through the function)");
        y=15;
        System.out.println("Value of Static Variable Y is : "+y+" (Accessing through the function).");
    }
    
    static void fun2() //static method
    {      
        y=20;
        System.out.println("Value of Static Variable Y is :"+y+" (Accessing inside the static fn.)");
    }
    
    static class Demo //static inner class
    {
        public static String country="India";
    }
}
public class StaticKeyword
{
    public static void main(String[] args)
    {
        Test obj1=new Test();
         
        obj1.x=10;
        System.out.println("Value of Instance/Non-Static Variable X is :"+obj1.x+" (Acessing from the main())");
        
        Test.y=5;
        System.out.println("Value of Static Variable Y is : "+Test.y+" (Accessing from the main()).");
        
        obj1.fun(); //Calling instance fn
        
        Test.fun2();
        
        System.out.println("Value of static variable country is : "+Test.Demo.country); //Here we are accessing static member of static inner class.
        
    }
}