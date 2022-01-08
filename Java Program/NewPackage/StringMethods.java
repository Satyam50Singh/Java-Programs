package NewPackage;


public class StringMethods
{
    public static void main(String[] args)
    {
        String Str1="Satyam";
        System.out.println(Str1);
        
        String Str2=new String("Singh Satyam");
        System.out.println(Str2);
        
        String Str3="Thakur ";
        Str3=Str3.concat(Str2);  //String Concatenation
        System.out.println(Str3);
        
        String s1="APPLE";
        String s2="Apple";
        String s3="Ball";
        String s4="Ball";
        String s5=new String("Ball");
        
        System.out.println("equals()\n1."+s1.equals(s2));
        System.out.println("2."+s3.equals(s4));
        
        System.out.println("== operator \n1."+(s3==s4));
        System.out.println("2."+(s3==s5));
        
        System.out.println("compareTo operator \n1."+s2.compareTo(s3));
        System.out.println("2."+s4.compareTo(s3));
        System.out.println("3."+s3.compareTo(s1));
        
        System.out.println("equalsIgnoreCase()\n1."+s1.equalsIgnoreCase(s2));
        
        System.out.println("replace()\n"+s2.replace('p','d'));
        System.out.println(s2);
        
        String num="    1234567890";
        System.out.println("\nnum :"+num+"\n"+num.substring(4));
        System.out.println(num.substring(4,7));
        
        num=num.trim();
        System.out.println("\nnum :"+num);
        System.out.println("\nnum :"+num.charAt(7));
        
        
    }
}
