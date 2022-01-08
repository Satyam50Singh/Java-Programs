//Program to import data members and member function of another class of another package into a new package
//where we want to use.
package NewPackage;
import javaPrograms.ImportKeyword;
public class Import
{
    protected int Apple=45;
    public void Display()
    {
        System.out.println("This Function is Imported or used in Access Specifier class of javaProgram Package.");
    }

    public static void main(String []args)
    {
        ImportKeyword obj=new ImportKeyword();
        
        obj.setRollno(23);
        obj.setName("Satyam");
        System.out.println("Name :"+obj.getName());
        System.out.println("Rollno. :"+obj.getRollno());
    }
}
