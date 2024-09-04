
    // Find Maximum Number of String Pairs

package HashSet_HashMaps;
import java.util.*;
public class leetcode_2744 
{
    public static String reverse1(String s)
    {
        StringBuilder s1=new StringBuilder(s);
        return s1.reverse().toString();
    }
    public static void main(String[] args) {
        String[] words={"cd","ac","dc","ca","zz"};
        int count=0;
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            if(s.contains(reverse1(words[i])))
            {
            count++;
            s.remove(words[i]);
            }
            else
            {
                s.add(words[i]);
            }
        }
        System.out.println(count);
    }
}
