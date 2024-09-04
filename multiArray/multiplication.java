package multiArray;
import java.util.*;
public class multiplication
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
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        for(int i=0;i<a.length;i++)
        {           
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int[][] c=new int[a.length][b[0].length];
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
               for(int k=0;k<a[0].length;k++)
               {
                c[i][j]+=a[i][k]*b[k][j];
               }
            }
        }
        System.out.println();
        print(a);
        print(b);
        print(c);

    }
}