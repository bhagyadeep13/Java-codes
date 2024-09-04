package Strings;
import java.util.*;
public class StringBuild_impMethods 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // setCharAt(int index,char ch)

        StringBuilder s2=new StringBuilder("bhagyadeep");
        s2.setCharAt(1,'2');
        System.out.println(s2);


        // APPEND() METHOD----picche se add karna

        StringBuilder s1=new StringBuilder("bhagyadeep");

        s1.append(10);              // APPEND A INTEGER
        System.out.println(s1);
        s1.append("cys");           // APPEND A STRING
        System.out.println(s1);
        s1.append('c');                 // APPEND A CHARACTER
        System.out.println(s1);
        char[] ch={'a','b','c'};            // APPEND A CHAHRACTER ARRAY
        s1.append(ch);
        System.out.println(s1);


// DELETE(START IDX, END IDX) ,DELETECHARAT(INT INDEX) AND INSERT(INT IDX,INT ELE)
        StringBuilder s3=new StringBuilder("Mahawar");
            String s="naha";
        s3.deleteCharAt(4);
        System.out.println(s3);
        s3.delete(2, 4); // delete characters from idx(2)----> idx(4)
        System.out.println(s3);
        
        // Insert(int index,int element)
        s3.insert(2,'r');
        System.out.println(s3);
        System.out.println(s3.charAt(2));

        //IndexOf--> Also return the first index of the substring
        System.out.println(s2.indexOf("deep"));   //s2="bhagyadeep"



        


    }
}
