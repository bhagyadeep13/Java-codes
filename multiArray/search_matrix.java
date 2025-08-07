package multiArray;
import java.util.*;
public class search_matrix 
{
    static boolean search(int[][] a,int t)
    {
        // start with top right corner
        int i=0;
        int j=a[0].length-1;
        while(i<a.length && j>=0)                       // T.C IN Worst Case - O(n+m)
        {                                               // T.C IN Best Case - O(1)
            if(a[i][j]==t) return true;
            if(a[i][j]<t)
            {
                i++;
            }
            else
            if(a[i][j]>t)
            {
                j--;
            }
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
