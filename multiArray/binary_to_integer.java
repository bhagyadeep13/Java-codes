package multiArray;
import java.util.*;
public class binary_to_integer 
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    for(int i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    int score=0;
    int x=1;
    for(int i=a.length-1;i>=0;i--)
    {
        score+=(a[i]*x);
        x=x*2;
    }
    System.out.println(score);
  }  
}
