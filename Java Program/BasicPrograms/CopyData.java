package BasicPrograms;

import java.io.*;

/**
 * Write a description of class CopyData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyData
{
    public static void main(String[] args)throws IOException,FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("CopyData1.txt");
        FileOutputStream fos=new FileOutputStream("CopyData2.txt");
        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }
        
        fis.close();
        fos.close();
        
        FileReader fr=new FileReader("CopyData2.txt");
        System.out.println("Data from the copied file or second file.");
        while((data=fr.read())!=-1){
            System.out.print((char)data);
        }        
        fr.close();        
    }
}
