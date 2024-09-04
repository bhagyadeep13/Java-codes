package multiArray;
import java.util.*;
public class basic 
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
    int m=a.length;
    int n=a[0].length;     // Print numbers of columns
     
   for(int[] ele:a)      // By for each loop
    {
        for(int x:ele)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    System.out.println(m+" "+n);
}    
}
