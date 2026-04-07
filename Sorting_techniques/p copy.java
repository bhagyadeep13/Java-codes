package Sorting_techniques;

import java.util.*;

public class pcopy 
{
    static HashMap<String,String> h;
    public static void add(String s, String s1)
    {
        h.put(s,s1);
    }
    public static List<String> search(String text)
    {
        String[] a = text.split(" ");
        List<String> ans = new ArrayList<>();
        for(String ele : h.keySet())
        {
            boolean flag=true;
            for(int i=0;i<a.length;i++)
            {
                if(!h.get(ele).contains(a[i]))
                {
                    flag=false;
                    break;
                }
            }
                if(flag==true)
                {
                    ans.add(ele);
                }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        h = new HashMap<>();

        add("D1","data structures and algorithms Algorithms are good");
        add("D2","introduction to data science & algorithms");
        add("D3","algorithms data algorithms data algorithms data for machine learning");

        List<String> ans = search("data algorithms");
        System.out.println(ans);
    }
}
