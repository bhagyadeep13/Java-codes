package HashSet_HashMaps;
import java.util.*;
public class map_iterate 
{
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();
        h.put("abhinav",04); 
        h.put("Aakash",01);
        h.put("arin",34);
        h.put("abhay",02);
        h.put("Bhagyadeep",41); 

        for(String key : h.keySet())        // For each loop to iterate in KEYS
        {
            System.out.print(key+" "+h.get(key)+" ");
        }
        System.out.println();
        for(int val : h.values())            // For each loop to iterate in VALUES
        {
            System.out.print(val+" ");
        }
        System.out.println();
        for(Object pair: h.entrySet())    // By using entrySet()
        {
            System.out.print(pair+" ");
        }

    }
}
