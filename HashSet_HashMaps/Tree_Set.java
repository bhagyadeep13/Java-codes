package HashSet_HashMaps;
import java.util.*;
public class Tree_Set 
{
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(5);
        h.add(3);
        h.add(4);

        System.out.println(h);   // Print the elements in sorted order

        for(int ele : h)     // Print by using for each loop
        {
            System.out.print(ele+" ");
        }
    }
}
