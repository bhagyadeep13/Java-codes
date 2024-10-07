package arraylist;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static int helper2(int n1,int n2)
    {
        if(n1%n2==0) return n1;
        return helper2(n1%n2,n1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n1,n2;
        while(t>0)
        {   
            n1=sc.nextInt();
            n2=sc.nextInt();
            System.out.println(helper2(n1,n2));
            t--;
        }
    }
}