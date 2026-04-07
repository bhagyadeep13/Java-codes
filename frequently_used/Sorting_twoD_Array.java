package frequently_used;
import java.util.*;
public class Sorting_twoD_Array 
{
    public static void main(String[] args) 
    {
        int[][] a1 = {{1,2,3},{1,1,6}};
        Arrays.sort(a1,(a,b) -> a[0]-b[0]); //sort By First Column
        // or
        Arrays.sort(a1,(a,b) -> {
        return a[0]-b[0];
    });
        for(int i=0;i<a1.length;i++)  
        {
            for(int j=0;j<a1[0].length;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        Arrays.sort(a1,(a,b) -> {
        if(a[0]!=b[0]) return a[0]-b[0];
        return a[1]-b[1];
    }); //sort By Multiple Column
        for(int i=0;i<a1.length;i++)  
        {
            for(int j=0;j<a1[0].length;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
