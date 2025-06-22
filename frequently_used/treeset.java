package frequently_used;
import java.util.*;
public class treeset 
{
  public static void main(String[] args) 
  {
    String s = "bbbccccaa";
    TreeMap<Character,Integer> t=new TreeMap<>();
    for(int i=0;i<s.length();i++)
    {
      if(t.containsKey(s.charAt(i)))
      {
        t.put(s.charAt(i),t.get(s.charAt(i))+1);
      }
      else
      {
        t.put(s.charAt(i),1);
      }
    }
    System.out.println(t);
    System.out.println(t.firstKey()); // lexographically smallest 
    System.out.println(t.lastKey()); // lexographically largest 
    System.out.println(t.firstEntry()); // lexographically small char, frequency
    System.out.println(t.lastEntry()); // lexographically large char, frequency
  }
}
