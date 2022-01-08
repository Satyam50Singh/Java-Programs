package javaPrograms;

class SuperClass
{
    private int age,rollno;
    private String name;
    public void setAge(int a)
    {   age=a;  }
    public void setRollno(int r)
    {   rollno=r;  }
    public void setName(String n)
    {   name=n;  }
    public void showData()
    {
        System.out.println("Name is "+name+"\nAge is :"+age+"\nRollno is :"+rollno);
    }
}
class SubClass extends SuperClass
{
    private int idNo;
    public void setId(int i)
    {   idNo=i;    }
    public void showId()
    {
        System.out.println("Id :"+idNo);
    }
}
public class SimpleInheritance
{
    public static void main(String[] args)
    {
        SubClass obj=new SubClass();
        obj.setName("Satyam Singh");
        obj.setAge(19);
        obj.setRollno(23);
        obj.setId(101);
        obj.showData();
        obj.showId();
    }
}
