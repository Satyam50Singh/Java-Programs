package NewPackage;


interface Mall
{
    int Val=12;
    void Mall();
}
interface SubMall1 extends Mall
{
    String str="Stanley";
    void SubMall1();
}
interface SubMall2 extends Mall
{
    float x=12.89f;
    void SubMall2();
}
class Shop implements SubMall1,SubMall2
{
    double d1=678675.3242;
    public void Mall()
    {
        System.out.println("\nint Val : "+Val);
        System.out.println("Super Class : Mall\n");
    }
    public void SubMall1()
    {
        System.out.println("String str : "+str);
        System.out.println("Sub Class 1 : SubMall1\n");
    }
    public void SubMall2()
    {
        System.out.println("float x : "+x);
        System.out.println("Sub Class 2 : SubMall2\n");
    }
    void Shop()
    {
        System.out.println("double d1 : "+d1);
        System.out.println("Child Class : Shop");
    }
}
public class HybridInheritance
{
    public static void main(String[] args)
    {
        System.out.print("HybridInheritance\n");
        Shop S1=new Shop();
        S1.Mall();
        S1.SubMall1();
        S1.SubMall2();
        S1.Shop();
    }
}
