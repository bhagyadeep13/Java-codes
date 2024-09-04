package multiArray;
import java.util.Scanner;
public class spiral 
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][4];
        int m=a.length;
    int n=a[0].length;    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }  
    int minr=0,minc=0;
    int maxr=m-1,maxc=n-1;
    while(minr<=maxr&&minc<=maxc)
    {
    for(int j=minc;j<=maxc;j++)
    {
        System.out.print(a[minr][j]+" ");
    }
    minr++;
    if(minr>maxr||minc>maxc)
    return;
    for(int i=minr;i<=maxr;i++)
    {
       System.out.print(a[i][maxc]+" ");
    }
    maxc--;
    if(minr>maxr||minc>maxc)
    return;
    for(int j=maxc;j>=minc;j--)
    {
        System.out.print(a[maxr][j]+" ");
    }
    maxr--;
    if(minr>maxr||minc>maxc)
    return;
    for(int i=maxr;i>=minr;i--)
    {
       System.out.print(a[i][minc]+" ");
    }
    minc++;
}
}
}
