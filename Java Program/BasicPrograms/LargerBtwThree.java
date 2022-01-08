package BasicPrograms;

import java.util.*;
/**Program to find the larger no among 3 different no.s*/
public class LargerBtwThree
{
    public static void main(String[] args)
    {
        System.out.println("Program to find the larger no among 3 different no.s");
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter Three numbers");
        short A=S1.nextShort(),B=S1.nextShort(),C=S1.nextShort();
        String Str=A>C ? (A>B?("Greater No. is "+A):("Greater No. is "+B)):(C>B?("Greater No. is "+C):("Greater No. is "+B));
        System.out.println(Str);
    }
}
