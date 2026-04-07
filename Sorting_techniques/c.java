package Sorting_techniques;
import java.util.*;
public class c 
{
    public static void fibo()
    {
        String s = "aabbccdhdjk";
        StringBuilder s1 = new StringBuilder();
        LinkedHashSet<Character> h = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            h.add(s.charAt(i));
        }
        for(char ch : h)
        {
            s1.append(ch);
        }
        System.out.println(s1.toString());
    }
    public static void main(String[] args) 
    {
        fibo();
    }
}
