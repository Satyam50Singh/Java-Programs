package javaPrograms;

import java.io.*;
/**
 * Write a description of class CharRead here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharRead
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader fr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(fr);
        fun1(br);
        fun2(br);
    }
    public static void fun1(BufferedReader br) throws IOException{
        String c=br.readLine();
        System.out.print(c);
    }    
    public static void fun2(BufferedReader br) throws IOException{
        char c=(char)br.read();
        System.out.print(c);
    }    
}
