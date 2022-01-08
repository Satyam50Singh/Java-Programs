package javaPrograms;

import java.io.*;
/**
 * Write a description of class InputStream here.
 *
 * @author (Satyam Singh)
 * @version (22-01-2021)
 * 
 * A simple program to read a single character or a complete data from a text file.
 */
public class CharStreamExample
{
    public static void main(String[]args)
    {        
        FileWriter fw=null;
        try{
            fw=new FileWriter("CharStreamData.txt");
            fw.write("Welcome to my new writing program.");       
            fw.write("\nSome Numbers : "+10+" "+98);       
            fw.write("\nSome Special characters : ^##%*%&$@#@");       
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
        finally{
            try{
                fw.close();
            }catch(IOException e1){
                System.out.print(e1.getMessage());
            }
        }

        int data;
        //Reading the content of the same file.
        FileReader fr=null;
        try{
            fr=new FileReader("CharStreamData.txt");
            while((data=fr.read())!=-1){
                System.out.print((char)data);
            }
        }catch(IOException e){
                System.out.print(e.getMessage());
            }
        finally{
            try{
                fr.close();
            }catch(IOException e1){
                System.out.print(e1.getMessage());
            }
        }
    }
}
