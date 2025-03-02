package frequently_used;
import java.util.*;;
public class subarray_Odd_sum 
{
    public static int numOfSubarrays(int[] arr) // T.C -- O(N)
    {
        int MOD=1000000007; 
        int prefixSum=0;
        int res=0;
        int oddCount=0;    // ye 0 rhega
        int evenCount=1;   // start me 0 rhega to even count 1 he
        for(int i=0;i<arr.length;i++)
        {
            prefixSum = prefixSum + arr[i];
            if(prefixSum%2==0)    // agar sum even h
            {
                res = res + oddCount; // ans me odd count ko add kar do
                evenCount++;     // or even count ko ++ karo kyuki sum even tha
            }
            else    // agar sum odd h
            {
                res = res + evenCount; // ans me even count ko add kar do 
                oddCount++; // or odd count ko ++ kar do kyuki sum odd tha
            }
            res=res%MOD;  // sath me mod nikalte jao given in QUESTION
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int[] a={1,3,5};
        System.out.println(numOfSubarrays(a));
    }
}
