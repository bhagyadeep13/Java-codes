import java.util.HashSet;
import java.util.Set;

public class Bitwise_OR_subarray 
{
    public static int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>(); // stores all unique OR results
        Set<Integer> prev = new HashSet<>();   // stores ORs ending at previous index

        for (int num : arr) {                     // T.C -- O(POW(N,2))
            Set<Integer> curr = new HashSet<>();
            curr.add(num);

            for(int p : prev)
            {
                curr.add(p | num);
            }
            
            result.addAll(curr);
            prev = curr;
        }
        return result.size();
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,4};
        System.out.println(subarrayBitwiseORs(arr));
    }
}
