package HashSet_HashMaps;
import java.util.*;
public class set_iterate 
{
    public static void main(String[] args) {
    HashSet<Integer> s=new HashSet<>();
    ArrayList<Integer> al=new ArrayList<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(28);
        s.add(50);

        for(int ele: s)   // Iterate into the set (IMP)
        {
            System.out.println(ele);
        }
        
        al.addAll(s);  // Add all the element of the set into the arraylist
        System.out.println(al);

    
}
}
