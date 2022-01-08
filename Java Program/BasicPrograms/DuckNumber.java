    package BasicPrograms;
    
    
    /**
     * A duck no. is a +ve no. which has zeroes present in it, for ex : 3210,8050987
     * Please Not that  a number with only leading 0s is not consider as Duck number.
     */
    import java.util.Scanner;
    public class DuckNumber
    {
        public static void main(String[] args)
        {
        Scanner S1=new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        String Str=S1.nextLine();
        System.out.println("Count :"+Str.length());
        String temp=Str;
        int p=1,digit=0,count=0,size=0;
        for(int i=0; i<Str.length(); i++)
        {
            System.out.print(Str.charAt(i));
            if(Str.charAt(0)=='0')
                p=0;
            else if(Str.charAt(i)=='0')
            {
                p=1;   break;
            }
            else 
                p=0;
        }
        if(p==1)
            System.out.println("It's a Duck number");
        else
            System.out.println("It's not a Duck number");
    }
}
