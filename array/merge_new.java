package array;
import java.util.*;
public class merge_new
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int[] a=new int[n1+n2];
    int[] a1=new int[n2];
    for(int i=0;i<n1;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a1.length;i++)
    {
        a1[i]=sc.nextInt();
    }
    int i=0,j=0,k=0;
    while(i<n1&&j<n2)
    {
        if(a[i]<a1[j])
        {
            a[k++]=a[i++];
        }
        else
        {
            a[k++]=a1[j++];
        }
    }
    while(i<n1)
    {
        a[k++]=a[i++];
    }
    while(j<n2)
    {
        a[k++]=a1[j++];
    }
    for(int l=0;l<a.length;l++)
    {
        System.out.print(a[l]+" ");
    }
}
}

    
