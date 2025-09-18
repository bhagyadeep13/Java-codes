package Recursion;
import java.util.*;
public class mazePath 
{
    static int m,n;
    static int maze(int r,int c)
    {
        if((c==n-1)||(r==m-1))
        return 1;
        int right=maze(r,c+1);
        int left=maze(r+1,c);
        return right+left;
    }
    static int maze2(int m,int n)
    {
        if(m==0 || n==0) return 1;
        int left = maze2(m,n-1);
        int right = maze2(m-1,n);
        return left + right;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         m=sc.nextInt();
        System.out.println(maze(0,0));
        System.out.println(maze2(m-1, n-1));
    }
}
