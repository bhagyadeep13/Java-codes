package multiArray;
import java.util.Scanner;
public class spiral 
{
    public static void main(String[] args) 
    {                                           // T.C -- O(M*N)
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
    while(minr<=maxr && minc<=maxc)
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
/*In this code, I'm printing a 2D matrix in spiral order.
I start from the top-left corner and move right across the top row, then down the last column, then left across the bottom row, and then up the first column — like moving in a spiral.
To do this, I use four variables to keep track of the boundaries: minr, maxr for rows and minc, maxc for columns.
After printing each side, I update the boundaries so that the spiral keeps moving inward until all elements are printed."** */
}
}