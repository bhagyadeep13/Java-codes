package multiArray;
import java.util.*;
public class practice 
{
    static void print(int[][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
   public static void main(String[] args) 
   {
        int[][] a={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        for(int i=0;i<a.length;i++)
        {
            if(a[i][0]==0)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    if(a[i][j]==0) a[i][j] = 1;
                    else a[i][j] = 0;
                }
            }
        }
        for(int j=1;j<a[0].length;j++)
        {
            int one=0,zero=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i][j]==0) zero++;
                else one++;
            }
            if(zero>one)
            {
                for(int i=0;i<a.length;i++)
                {
                    if(a[i][j]==0) a[i][j] = 1;
                    else a[i][j] = 0;
                }
            }
        }
        int sum =0;
        for(int i=0;i<a.length;i++)
        {
            StringBuilder s = new StringBuilder();
            for(int j=0;j<a[0].length;j++)
            {
                s.append(a[i][j]);
            }
            sum = sum + Integer.parseInt(s.toString(),2);
        }
        System.out.println(sum);
   }
}

