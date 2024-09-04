package multiArray;
import java.util.Scanner;
public class tranformintotranspose 
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int m=arr.length; 
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<i;j++)
        {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    for(int l=0;l<m;l++)
    {
        for(int j=0;j<m;j++)
        {
       System.out.print(arr[l][j]+" ");
        }
        System.out.println();
    } 
}
}
   
