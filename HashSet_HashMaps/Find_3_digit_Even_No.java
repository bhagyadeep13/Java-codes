
// 2094. Finding 3-Digit Even Numbers

package HashSet_HashMaps;
import java.util.*;
public class Find_3_digit_Even_No 
{
    public static void findEvenNumbers(int[] a) 
    {
        List<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(h.containsKey(a[i]))
            {
                int freq=h.get(a[i]);
                h.put(a[i],freq+1);
            }
            else
            h.put(a[i],1);
        }
        for(int i=100;i<=999;i++)
        {
            int x=i;
            int c = x%10;
            x=x/10;
            int b = x%10;
            x=x/10;
            int a1 = x%10;

            if(h.containsKey(a1))
            { 
                int aval=h.get(a1);
                h.put(a1,aval-1);
                if(aval==1) h.remove(a1);
                if(h.containsKey(b))
                {
                int bval=h.get(b);
                h.put(b,bval-1);
                if(bval==1) h.remove(b);
                    if(h.containsKey(c) && c%2==0)
                    {
                        al.add(i);
                    }
                    h.put(b,bval);
                }
                h.put(a1,aval);
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) 
    {
        int[] a={2,2,8,8,2};
        findEvenNumbers(a);
    }
}
