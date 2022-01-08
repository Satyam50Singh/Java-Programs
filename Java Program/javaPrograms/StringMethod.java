package javaPrograms;


/**
 * Write a description of class StringMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMethod
{
    public static void main(String[] args)
    {
        String Str="Hii i am Satyam Singh";
        String Str1="Hii i am Karan Sharma";
        String Str2="";
        String Str3="Hii i Am SatYam SinGh";
        String Str4="   ki           po            che";
        System.out.println("Strings\nString Str :"+Str);
        System.out.println("String Str1 :"+Str1);
        System.out.println("String Str2 : Empty"+Str2);
        System.out.println("String Str3 : "+Str3);
        System.out.println("String Str4 : "+Str4);
        System.out.println("--------------------------------");
        //char charAt() 
        System.out.println("\nString Str--charAt(index) : "+Str.charAt(7));
        //int length() 
        System.out.println("String Str--length() : "+Str.length());
        //String substring(int beginIndex)
        System.out.println("String Str--substring(int beginIndex) : "+Str.substring(10));
        //String substring(int beginIndex,int endIndex)
        System.out.println("String Str--substring(int beginIndex,int endIndex) : "+Str.substring(10,18));
        //boolean contains(CharSequences)
        System.out.println("String Str--contains(CharSequences) : "+Str.contains("Satya"));
        //static String join(CharSequence delimiter,Char Sequence....elements)
        System.out.println("String Str--join(CharSequence delimiter,Char Sequence....elements) : "+Str.join(",",Str,Str1,Str2));
        //boolean equals(Object another)
        System.out.println("Compare Str & Str1--equals(Object another) : "+Str.equals(Str1));
        //boolean isEmpty()
        System.out.println("Str2--isEmpty() : "+Str2.isEmpty());
        //String concat(String)
        System.out.println("Str & Str1--String concat(String) : "+Str.concat(Str1));
        //String replace(char old,char new)
        System.out.println("Str3--String replace(char old,char new) : "+Str3.replace('S','s'));
        //String replace(char old,char new)
        System.out.println("Str3--String replace(char old,char new) : "+Str3.replace("Singh","and lakhan"));
        //static String equalsIgnoreCase(String another)
        System.out.println("Str & Str3--static String equalsIgnoreCase(String another) : "+Str.equalsIgnoreCase(Str3));
        //String[] spilt(String regex)        
        System.out.println("Str--String[] spilt(String regex) :");
        String[] Java=Str.split("a");
        for(String S : Java)
        {
            System.out.println(S);
        }
        System.out.println("Str--String[] spilt(String regex,int limit) :");
        String[] Java2=Str.split("a",3);
        for(String S : Java2)
        {
            System.out.println(S);
        }
        //int indexOf(char ch)
        System.out.println("Str--int indexOf(char ch) : "+Str.indexOf('m'));
        //int indexOf(char ch,int fromIndex)
        System.out.println("Str--int indexOf(char ch,int fromIndex) : "+Str.indexOf('m',8));
        //int indexOf(String substring)
        System.out.println("Str--int indexOf(String substring) : "+Str.indexOf("yam"));
        //int indexOf(String substring,int fromIndex)
        System.out.println("Str--int indexOf(String substring,int fromIndex) : "+Str.indexOf("am",5));
        //String toLowerCase()
        System.out.println("Str--String toLowerCase() : "+Str.toLowerCase());
        //String toUpperCase()
        System.out.println("Str--String toUpperCase() : "+Str.toUpperCase());
        //String trim
        System.out.println("Str4--String trim() : "+Str4.trim());
        System.out.println("\n--------------------------------");
        
    }
}
