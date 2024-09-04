package multiArray;
import java.util.*;
public class largestele 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[i][j]>lar)
                {
                    lar=a[i][j];
                }
            }
        }
        System.out.println(lar);
    }    
}
