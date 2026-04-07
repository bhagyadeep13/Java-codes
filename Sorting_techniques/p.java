package Sorting_techniques;

import java.util.*;
import java.util.stream.Collectors;
public class p 
{
    static HashMap<String,String> h;
    static HashMap<String,Integer> h2;
    public static void add(String s, String s1)
    {
        h.put(s,s1);
    }
    public static List<String> search(String text)
    {
        String[] a = text.split(" ");
        List<String> l2 = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            l2.add(a[i]);
        }
        List<String> ans = new ArrayList<>();
        for(String ele : h.keySet())
        {
            String[] b = h.get(ele).split(" ");
            int count=0;
            for(int j=0;j<b.length;j++)
            {
                if(l2.contains(b[j]))
                {
                    count++;
                }
            }
            h2.put(ele,count);
            boolean flag=true;
            for(int i=0;i<l2.size();i++)
            {
                if(!h.get(ele).contains(l2.get(i)))
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
        h2 = new HashMap<>();
        add("D1","data structures and algorithms Algorithms are good");
        add("D2","introduction to data science & algorithms");
        add("D3","algorithms data algorithms data algorithms data for machine learning");

        List<String> ans = search("data algorithms");
        // Sort by value in descending order
        LinkedHashMap<String, Integer> sortedDesc = h2.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        for(String ele : sortedDesc.keySet())
        {
            System.out.println(ele+" ");
        }
    }
}
