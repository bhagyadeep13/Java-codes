package HashSet_HashMaps;
import java.util.*;
public class Tree_Map 
{
    public static void main(String[] args) {

        List<Character> al=new ArrayList<>();
        TreeMap<Character,Integer> t=new TreeMap<>(); // USED TO STORE ELEMENTS IN SORTED ORDER
        t.put('a', 1);
        t.put('v', 3);
        t.put('d', 2);
        t.put('r', 4);
        t.put('g', 5);
        System.out.println();
        System.out.println(t);   // PRINT THE TREE ELEMENTS IN SORTED ORDER

        for(char key : t.keySet())
        {
            al.add(key);
        }
        System.out.println(al);  // sort in lexographical order
    }
}
