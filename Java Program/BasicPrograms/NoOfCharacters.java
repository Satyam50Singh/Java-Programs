package BasicPrograms;

import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class NoOfVowels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Program to take a string from user, then create a file and save string in it. and also read 
 * that same file and calculate no. of vowels,special characters,spaces,numeric character
 * and consonants.
 */
public class NoOfCharacters
{
    public static void main(String[] args)
    {        
        Scanner S1=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=S1.nextLine();
        
        FileWriter fw=null;
        try{
            fw=new FileWriter("CountVowel.txt");
            fw.write(str);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                fw.close();
            }catch(IOException e1){
                System.out.println(e1.getMessage());
            }
        }
        
        FileReader fr=null;
        int data,vowel=0,consonant=0,numeric=0,space=0,special=0;
        try{
            fr=new FileReader("CountVowel.txt");
            char c;
            while((data=fr.read())!=-1){
                c=(char)data;
                if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
                    vowel++;     
                else if(c==' ')
                    space++;
                else if((c>='A' && c<='Z')||(c>='a' && c<='z'))
                    consonant++;
                else if(c>='0' && c<='9')
                    numeric++;
                else
                    special++;
            }
            System.out.println("No. of Vowels : "+vowel);
            System.out.println("No. of Numeric Characters : "+numeric);
            System.out.println("No. of Spaces : "+space);
            System.out.println("No. of Consonants : "+consonant);
            System.out.println("No. of Special : "+special);            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }   
        finally{
            try{
                fr.close();
            }catch(IOException e1){
                System.out.println(e1.getMessage());
            }        
        } 
    }
}
