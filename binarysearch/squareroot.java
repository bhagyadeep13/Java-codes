package binarysearch;
import java.util.*;
public class squareroot 
{
    static int square(int t)
    {
        int mid=0,ans=0;
        int st=0,end=t;
        while(st<=end)
        {
            mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==t)
            {
                return mid;
            }
            else
            if(val>t)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(square(target));
    }
}
