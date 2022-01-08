package javaPrograms;


/**
 * Write a description of class BreakLabelLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BreakLabelLoop
{
    public static void main(String[] args)
    {
        boolean t = true;
        
        int i2=0;
        Stay :
        {
            for(int i=0; i<90; i++)
            {
            i2++;
            System.out.print(i2);
            if(i2==6)
                break Stay;
            }
        };
    }
}
