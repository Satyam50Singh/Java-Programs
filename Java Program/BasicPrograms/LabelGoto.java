package BasicPrograms;


/** Program to print Output BY using Label Loop. */
public class LabelGoto
{
    public  static void main(String[] args)
    {
        System.out.println("Program to print Output BY using Label Loop.");
        System.out.println("Printing Numbers from 1-10 by using Label Loop.");
        Printing:
        for(byte i=1; i<=20; i++)
        {
            System.out.print(i+"  ");
            if(i==10)
                break Printing;
        }
        
        byte h;
        /***
         * 
         * * 
         * * *
         * * * *
         * * * * *
         */
        System.out.println("\nPrinting Asterik-Pattern by using Label Loop.");
        Pattern :
        for(byte k=0; k <(Integer.parseInt(args[0])); k++)
        {
            System.out.println(" ");
            if(k>=5)
            break Pattern;
            for(byte i=0; i<(Integer.parseInt(args[0])); i++)
            {
                System.out.print("* ");
                if(k==i)
                continue Pattern;
            }
        }
    }
}
