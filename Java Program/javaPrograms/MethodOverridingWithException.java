package javaPrograms;
import java.io.*;
/*
 * WHEN OVERRIDING WUTH EXCEPTION HANDLING IF SUPER CLASS METHOD DOES NOT DECLARE ANY EXCEPTION THEN
 * SUB CLASS OVERRIDDEN METHOD CANNOT DECLARE CHECKED EXCEPTION BUT IT CAN DECLARE UNCECKED EXCEPTION
*/
class Parent
{
    void show()
    {
        System.out.println("Parent Class");
    }
}
public class MethodOverridingWithException extends Parent
{
    void show() throws ArithmeticException//IOException Not Allowed
    {
        System.out.println("Child Class");
    }
    public static void main(String[] args)
    {
        Parent P2=new MethodOverridingWithException();
        P2.show();
    }
}
