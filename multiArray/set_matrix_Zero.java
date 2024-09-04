package multiArray;
import java.util.*;
public class set_matrix_Zero 
{
    static void print(int[][] a)
    {
        int m=a.length;
        int n=a[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int[][] b=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                b[i][j]=a[i][j];
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                if(b[i][j]==0)
                {
                    for(int k=0;k<b[0].length;k++)
                    {
                        a[i][k]=0;
                    }
                    for(int l=0;l<b.length;l++)
                    {
                        a[l][j]=0;
                    }
                }
            }
        }
        System.out.println();
        print(b);
        print(a);
    }
}
