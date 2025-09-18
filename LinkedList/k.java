package LinkedList;
import java.util.*;
public class k 
{
  public static int helper(int[] a,int st,int end,int val)
  {
      int count=0;
      for(int i=st;i<=end;i++)
      {     
        if(a[i]==val) count++;
      }
      return count;
  }   
  public static int distinct(int[] a,int st,int end)
  {
    HashSet<Integer> h=new HashSet<>();
    for(int i=st;i<=end;i++)
    {
      h.add(a[i]);
    }
    return h.size();
  }
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int[] a={2,2,3,1,5};
      int count=0;
      for(int i=0;i<a.length;i++)
      {
        for(int j=i+1;j<a.length;j++)
        {
          if(helper(a,1,i,a[i])+helper(a,j,a.length-1,a[j]) <= ((distinct(a, 1, i))/2 + distinct(a, j, a.length-1))/2)
          {
            System.out.println(a[i]+" "+a[j]);
          }
        }

      }
      System.out.println(count);
  }
}
