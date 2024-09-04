package HashSet_HashMaps;
import java.util.*;
public class Extra_points_Of_hashmaps 
{
    public static void main(String[] args) {
        
        HashMap<String,Integer> h=new HashMap<>();
        h.put("abhinav",04);   // Put method - used to add elements in hashmaps
        h.put("Aakash",01);
        h.put("arin",34);
        h.put("abhay",02);
        h.put("Bhagyadeep",41); 

        System.out.println(h);

        h.put("Bhagyadeep",98); // Point-1 -- update the value of that key 

        System.out.println(h);

        // Point-2 -- elements of hashmaps are arranged in random order
    }
}
