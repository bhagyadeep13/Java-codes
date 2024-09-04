package HashSet_HashMaps;
import java.util.*;
public class basics_Of_hashmap
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> h=new HashMap<>();
        h.put("abhinav",04);   // Put method - used to add elements in hashmaps
        h.put("Aakash",01);
        h.put("arin",34);
        h.put("abhay",02);
        h.put("Bhagyadeep",41); 

        System.out.println(h.get("abhinav"));  // get(key)-- print the value ot that key

        System.out.println(h);  // Print the hashmaps directly

        System.out.println(h.containsKey("Bhagyadeep"));  // containskey(key)--return true Agar key hashmap me present h
        // else return false

        System.out.println(h.containsValue(41)); // containsvalue(value)--return true Agar value hashmap me present h
        // else return false

        h.remove("Bhagyadeep"); // remove(key)-- remove the value of that key and key also
        System.out.println(h);

        System.out.println(h.size()); // size()--return the  size of the hashmap


    }   
}
