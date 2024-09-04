package multiArray;
import java.util.*;
public class score_after_flipping 
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
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[3][4];
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i][0]==0)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==0)
                a[i][j]=1;
                else
                a[i][j]=0;
            }
        }
    }
    int zero,one;
    for(int j=0;j<a[0].length;j++)
    {
         zero=0;
         one=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i][j]==0)
            {
                zero++;
            }
            else
            one++;
        }
        if(zero>one)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i][j]==0)
                a[i][j]=1;
                else
                a[i][j]=0;
            }
        }
    }
    int score = 0;
    int x = 1;
    for(int j=a[0].length-1;j>=0;j--)
    {
        for(int i=0;i<a.length;i++)
        {
           score+=(a[i][j]*x);
        }
        x=x*2;
    }
    System.out.println(score);
    }
}
