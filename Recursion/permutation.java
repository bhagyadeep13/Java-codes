package Recursion;
import java.util.*;
public class permutation 
{
    static void permu(String ans,String s)
    {
        if(s.equals(""))
        {
        System.out.println(ans);
        return;
        }
        for(int i=0;i<s.length();i++)
        {
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            permu(ans+s.charAt(i), left+right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permu("",s);
    }
}
