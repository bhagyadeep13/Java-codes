package binarysearch;
import java.util.*;
public class squareroot 
{
    static int square(int t)
    {
        int st = 0;
        int end = t;
        while(st<=end)
        {
            int mid = (st+end)/2;
            int val = mid*mid;
            if(val==t) return mid;
            else
            if(val>t)
            {
                end = mid-1;
            }
            else
            {
                st = mid + 1;
            }
        }
        return end;  // true for all the cases when t == odd number
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(square(target));
    }
}
