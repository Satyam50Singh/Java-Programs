package javaPrograms;

import java.io.*;
import java.util.*;
public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector V=new Vector(); //Create default vector
        System.out.println("Default Capacity of V :- "+V.capacity());
        V.add(12);          //Methods to add element using add() of list
        V.addElement(123);  //Methods to add element using addElement() of Vector
        V.addElement(12.93);
        V.addElement("Satya");
        V.addElement('w');
        System.out.println("Vector V : "+V);
        
        Vector V1=new Vector(8);  //Set size of vector manually
        System.out.println("\nInitial Capacity of V1 :- "+V1.capacity());
        for (int i=1;i<=10; i++){             
            V1.add(i);
        }
        System.out.println("Vector V1 : "+V1);
        System.out.println("Capacity of V1 :- "+V1.capacity());
        
        Vector<Integer> V2=new Vector<Integer>(2,3); //Create generics vector
        System.out.println("\nInitial Capacity of V2 :- "+V2.capacity());
        V2.add(8);
        V2.add(18);
        V2.add(84);
        V2.add(38);
        System.out.println("Vector V2 : "+V2);
        System.out.println("Initial Capacity of V2 :- "+V2.capacity());
        
        V2.set(2,28);  //set(index,new_value) is used to a replace a value on a particular index.
        System.out.println("Updated Vector V2 : "+V2);
        
        V2.remove(1);  //remove(index) is used to remove element.
        System.out.println("Updated Vector after deletion V2 : "+V2);
        
        //Iterate vector
        Vector V3=new Vector();
        V3.add(12);
        V3.add("Apple");
        V3.add(23.32);
        V3.add("Haseena");
        
        System.out.println("\nSize of V3 : "+V3.size()); //total no. of element in a vector
        System.out.println("Vector V3 : \n");
        //using get() method
        for(int i=0; i<V3.size(); i++)
        {
            System.out.println("AT index : "+i+" --> "+V3.get(i));
        }
        
        Vector<Integer> V4=new Vector<Integer>();
        V4.add(11);
        V4.add(22);
        V4.add(32);
        V4.add(42);
        V4.add(2,82);//Add new values by shifting old onces.
        
        System.out.println("\nVector V4 : \n");
        int j=0;
        for(int i:V4){
            System.out.println("AT index : "+(j++)+" --> "+i);
        }
        
    }
}
