package multiArray;
import java.util.*;
public class search_matrix 
{
    static boolean search(int[][] a,int target)
    {
        int i=a.length-1,j=0;
        while(i>=0&&j<a[0].length)
        {
            if(a[i][j]==target)
            {
               return true;
            }
            else if(a[i][j]>target)
            i--;
            else
            j++;
        }
        return false;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[3][3];
    int target=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
       System.out.println(search(a,target));
   }    
}
