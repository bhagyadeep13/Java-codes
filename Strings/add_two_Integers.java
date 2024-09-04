package Strings;
import java.util.*;
public class add_two_Integers
{
    public static String left(String s,int i,int c)
    {
        int val=c+Integer.parseInt(s.substring(0,i+1));
        StringBuilder s4=new StringBuilder(val+"");
        s4.reverse();
        return s4.toString();
    }
    public static String sum(String s1,String s2)
    {
        if(s1.length()==1 && s2.length()==1)
        {
        int v=Integer.parseInt(s1.charAt(0)+"")+Integer.parseInt(s2.charAt(0)+"");
            StringBuilder s7=new StringBuilder(v+"");
            return s7.toString();
        }
        String s3="";
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
String s5= new String((Integer.parseInt(s1.charAt(i)+"")+Integer.parseInt(s2.charAt(j)+"")+carry)+"");
        if(s5.length()==2)
        {
            carry=1;
        }
        else 
        {
            carry=0;
        }
        s3=s3+s5.charAt(s5.length()-1);
        i--;
        j--;
        }
        System.out.println(i+""+j);
        if(s1.length()==s2.length() && carry==1)
        {
            s3=s3+"1";
        } 
        if(i==-1 && j>=0)
        {
            s3=s3+left(s2,j,carry);
        }
        if(j==-1 && i>=0)
        {
            s3=s3+left(s1,i,carry);
        }
        StringBuilder s6=new StringBuilder(s3);
        return s6.reverse().toString();
    }
    public static void main(String[] args) 
    {
        String s1="456";
        String s2="77";
        System.out.println(sum(s1,s2));
    }
}
