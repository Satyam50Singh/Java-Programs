package javaPrograms;

import java.io.*;
/**
 * Write a description of class FileClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileClass
{
    public static void main(String[] args){
        
        try{
            File f1=new File("java123.txt");
            if(f1.createNewFile()){
                System.out.println("New File is created...");
            }
            else{
                System.out.println("Error in creating File ");
            }
            System.out.println("File Name : "+f1.getName());
            System.out.println("isFile : "+f1.isFile());
            System.out.println("isDirectory : "+f1.isDirectory());
            System.out.println("canRead : "+f1.canRead());
            System.out.println("isAbsolute : "+f1.isAbsolute());
            System.out.println("canWri : "+f1.canWrite());
            System.out.println("canExecute : "+f1.canExecute());
            System.out.println("getFreeSpace : "+f1.getFreeSpace());
        }catch(IOException e){}
    }
}
