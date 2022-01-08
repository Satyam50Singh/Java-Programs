package javaPrograms;

import java.io.*;
/**
 * Write a description of class FileOSExample here.
 *
 * @author (Satyam Singh)
 * @version (23-01-2021)
 * 
 * A program to create a file and also write and read data from the file.
 */
public class ByteStreamExample
{
    public static void main(String[]args)
    {
        String str="hii i am A good boy. @132.245.45";
        byte buf[]=str.getBytes();
        //Writing data into a file
        FileOutputStream fos=null;
                
        try{
            fos=new FileOutputStream("ByteStreamData.txt",true);  //appending mode
            for(int i=0; i<buf.length; i++)
                fos.write(buf[i]);
        }catch(IOException e){
            System.out.println("An I/O Error Occured.");
        }
        finally
        {
            try{
                fos.close();
            }
            catch(IOException e){
                System.out.print("Error Closing ByteStreamData.txt");
            }
        }
        
        //Reading Data from file
        FileInputStream f2=null;     
        int data;
        try{
            f2=new FileInputStream("ByteStreamData.txt");        
            while((data=f2.read())!=-1)
            {
                System.out.print((char)data);
            }
        }catch(IOException e){}
        finally{
            try{
                f2.close();              
            }catch(IOException e){ 
                System.out.print(e.getMessage()); 
            }
        }
    }
}
