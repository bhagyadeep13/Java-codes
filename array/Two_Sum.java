package array;
import java.util.*;
public class Two_Sum 
{
    static boolean twosum(int[] a,int t)  // TWO SUM
    {
        int l=0,r=a.length-1;
        while(l<r)
        {
            if(a[l]+a[r]==t) return true;
            else if(a[l]+a[r]<t) l++;
            else r--;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int[] a={2,7,11,15};
        System.out.println(twosum(a, key));
    }
}
