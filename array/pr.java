package array;

public class pr 
{
    public static int countSubarrays(int[] arr, int minLen, int maxSum) {
    int start = 0;
    int sum = 0;
    int count = 0;

    for (int end = 0; end < arr.length; end++) {
        sum += arr[end];

        // shrink window if sum exceeds maxSum
        while (sum > maxSum) {
            sum -= arr[start];
            start++;
        }

        int windowLength = end - start + 1;

        // if window length is valid
        if (windowLength >= minLen) {
            count += (windowLength - minLen + 1);
        }
    }
    return count;
}
public static void main(String[] args) 
{
    int[] a={1,2,1,1};
    System.out.println(countSubarrays(a, 2, 3));
}
}
