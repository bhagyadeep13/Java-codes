// 2661. First Completely Painted Row or Column

/*You are given a 0-indexed integer array arr, and an m x n integer matrix mat. arr and mat both contain all the integers in the range [1, m * n].
Go through each index i in arr starting from index 0 and paint the cell in mat containing the integer arr[i].
Return the smallest index i at which either a row or a column will be completely painted in mat. */

/*Input: arr = [1,3,4,2], mat = [[1,4],[2,3]]
Output: 2 */

package multiArray;
import java.util.*;
public class Leetcode_2661 
{
    public static int firstCompleteIndex(int[] arr, int[][] mat) 
    {
        int m=mat.length;
        int n=mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        HashMap<Integer,int[]> h=new HashMap<>(); // used to store ele and its position
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                h.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;i++)            // if(row[pos[0]]==no of column)
        {                                        // if(col[pos[1]]==no of rows)
            int[] pos = h.get(arr[i]);
            row[pos[0]]++;
            col[pos[1]]++;
            if(row[pos[0]]==n || col[pos[1]]==m) return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,3,4,2};
        int[][] mat={{1,4},{2,3}};
        System.out.println(firstCompleteIndex(arr, mat));
    }
}
