package Recursion;
import java.util.*;
public class  StringPermutation_leetcode
{
        static ArrayList<String> al;
        static void permu(String ans,String s)
        {
            if(s.length()==0)
            {
            al.add(ans);
            return;
            }
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                String left=s.substring(0,i);
                String right=s.substring(i+1);
                permu(ans+ch,left+right);
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
           al=new ArrayList<>();
           permu("","ab");
           String s2=sc.nextLine();
           for(int i=0;i<al.size();i++)
           {
            if(s2.contains(al.get(i))==true)
            {
                System.out.println("true");
                return;
            }
           }
           System.out.println("false");
        }
    }

