package multiArray;
import java.util.Scanner;
public class waveform 
{
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int m=a.length;
    int n=a[0].length;    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }  
    System.out.println("column wise waveform");
    for(int j=0;j<n;j++)
    {
        if(j%2!=0)
        {
            for(int i=0;i<m;i++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
        else
        {
            for(int i=m-1;i>=0;i--)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    System.out.println();
System.out.println("row wise waveform");
    for(int i=0;i<m;i++)
    {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}

