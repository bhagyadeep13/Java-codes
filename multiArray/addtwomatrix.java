package multiArray;
import java.util.*;
public class addtwomatrix
 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[4][4];
    int[][] a1=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
               a1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=a[i][j]+a1[i][j];
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
   } 
}
