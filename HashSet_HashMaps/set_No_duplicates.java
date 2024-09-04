package HashSet_HashMaps;
import java.util.*;
public class set_No_duplicates 
{
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(20);
        s.add(30);
        s.add(30);

        System.out.println(s);  // set does not contains duplicate elements

}
}
