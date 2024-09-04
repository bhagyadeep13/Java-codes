package Recursion;
import java.util.*;
public class mazePath 
{
    static int m,n;
    static int maze(int r,int c)
    {
        if((c==n)||(r==m))
        return 1;
        int right=maze(r,c+1);
        int left=maze(r+1,c);
        return right+left;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         m=sc.nextInt();
        System.out.println(maze(1,1));
    }
}
