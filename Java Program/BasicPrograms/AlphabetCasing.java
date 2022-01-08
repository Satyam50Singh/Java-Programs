package BasicPrograms;

/**Program to Display Alphabets in Upper And Lower Case. */
public class AlphabetCasing
{
    public static void main(String[] args)
    {
        System.out.println("Program to Display Alphabets in Upper And Lower Case.");
        System.out.println("Alphabets in Upper Case.");
        char []Str=new char[27];
        char []Str2=new char[27];
        byte j=0;
        for(byte i=65; i<=90; i++)
        {
            Str[j]=((char)i);
            System.out.print(Str[j++]+"  ");
        }
        System.out.println("\nAlphabets in Lower Case.");
        byte k=0;
        for(byte i=97; i<=122; i++)
        {
            Str2[k]=((char)i);
            System.out.print(Str2[k++]+"  ");    
        }
    }
}
