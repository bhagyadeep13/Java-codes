package Recursion;
import java.util.*;
public class pow2{
    static int pow(int a,int b)
    {
      if(b==0||a==0)
      return 1;
      int ans=pow(a, b/2);
      if(b%2!=0)
      return ans*ans*a;
      else
      return ans*ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(pow(a,b));
    }
}