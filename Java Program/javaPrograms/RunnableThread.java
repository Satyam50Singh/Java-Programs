package javaPrograms;

import java.util.*;
class Example implements Runnable
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Thread 1 :"+(i+1));
        }
    }
}
class Example2 implements Runnable
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Thread 2 :"+(i+1));
        }
    }
}
public class RunnableThread
{
    public static void main(String[] args)
    {
        Thread T1= new Thread(new Example());
        Thread T2= new Thread(new Example2());
        T1.start();
        T2.start();
    }
}
