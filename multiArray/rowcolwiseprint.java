package multiArray;
import java.util.*;
public class rowcolwiseprint 
{
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)      
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(a[i][j]);      // coloumn wise printing
            }
        }
        for(int i=0;i<2;i++)               
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");  // row wise printing
            }
        }
       }
}
