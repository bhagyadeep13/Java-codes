package array;
import java.util.*;
public class merge_two_sort
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int[] a=new int[n1];
    int[] a1=new int[n2];
    int[] a2=new int[n1+n2];
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a1.length;i++)
    {
        a1[i]=sc.nextInt();
    }
    int i=0,j=0,k=0;
   while(i<=a.length-1||j<=a1.length-1)
   {
    if(a[i]<=a1[j])
    {
        a2[k]=a[i];
        i++;
        k++;
    }
    if(i==a.length)
    {
        break;
    }
    if(a1[j]<=a[i])
    {
        a2[k]=a1[j];
        j++;
        k++;
    }
    if(j==a1.length)
    break;
   }
   if(i==a.length)
   {
    for(int l=j;l<a1.length;l++)
    {
        a2[k]=a1[j];
        j++;
        k++;
    }
   }
   else
   if(j==a1.length)
   {
    for(int l=i;l<a.length;l++)
    {
        a2[k]=a[i];
        i++;
        k++;
    }
   }
    for(int y=0;y<a2.length;y++)
    {
        System.out.print(a2[y]+" ");
    }
    
  }  
}
