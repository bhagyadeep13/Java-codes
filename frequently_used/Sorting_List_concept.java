package frequently_used;
import java.util.*;

public class Sorting_List_concept 
{
    public static void main(String[] args) 
    {
        List<List<Integer>> all= new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(5);
        all.add(al1);
        List<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(1);
        al2.add(3);
        al2.add(4);
        all.add(al2);
        all.sort(Comparator.comparing((List<Integer> a) -> a.get(0))
        .thenComparing(a -> a.get(1)));
        System.out.println(all);
    }
}
