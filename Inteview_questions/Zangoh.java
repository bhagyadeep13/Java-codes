package Inteview_questions;
import java.util.*;
// Reverse the string and check that it is a palindrome and also remove special
// characters and spaces
public class Zangoh 
{
    public static void main(String[] args) 
    {
        String s="A war at Tarawa!";
        String[] s2=s.split(" ");
        StringBuilder s1=new StringBuilder("");
        for(int i=0;i<s2.length;i++)
        {
            s1.append(s2[i].toLowerCase());
        }
        for(int i=0;i<s1.length();i++)
        {
            if(!Character.isLetter(s1.charAt(i)))
            {
                s1.deleteCharAt(i);
            }
        }
        System.out.println(s1);
        StringBuilder s3=new StringBuilder(s1.toString());
        s1.reverse();
        System.out.println(s1);
        if(s1.toString().equals(s3.toString()))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
