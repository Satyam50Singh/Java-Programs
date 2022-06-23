package javaPrograms;

/**
 *this is reference pointer which is used to represent caller object.
 *this object reference is a local variable in instance member method referening the caller object.
 *this is not passed when we call static member fns.
 */
class Demo 
{
    private int l,b,h;  //Here l,b,h are Instance Variable
    public void Fun(int l,int b,int h)  //Here l,b,h are Local Variable
    {
        this.l=l;  this.b=b;  this.h=h;
        System.out.println("Length :"+this.l+"\nBreadth :"+this.b+"\nHeight :"+this.h);
    }
    
}
public class ThisKeyword
{
    public static void main(String []args)
    {
        Demo obj=new Demo();
        obj.Fun(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
}
