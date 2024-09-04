package multiArray;
import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int m=a.length;
    int n=a[0].length;    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(i!=j)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
       System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
   /*  int[][] t=new int[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            t[i][j]=a[j][i];
            System.out.print(t[i][j]+" ");
        }
        System.out.println();
    }*/
    }
}
