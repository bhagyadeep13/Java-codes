package HashSet_HashMaps;
import java.util.*;
public class basics_OF_Sets 
{
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(28);
        s.add(50);

        System.out.println(s.contains(10));  // Search -- O(1)

        s.add(38); // Insert -- O(1)
        System.out.println(s);

        s.remove(28);  // Remove -- O(1)
        System.out.println(s);

        Object[] a=s.toArray();  // TO array method
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }



    }
}
