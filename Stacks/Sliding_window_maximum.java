package Stacks;
import java.util.*;
public class Sliding_window_maximum 
{
  static class Pair
  {
    int val;
    int idx;
    Pair(int val,int idx)
    {
      this.val=val;
      this.idx=idx;
    }
  }
  public static void nextgreater(int[] a,int[] nge)
  {
      int n=a.length;
      Stack<Pair> st = new Stack();
      nge[a.length-1]=n;
      st.push(new Pair(a[a.length-1],a.length-1));
      for(int i=a.length-2;i>=0;i--)
      {
        boolean flag = false;
        while(st.size()>0)
        {
            if(st.peek().val>a[i])
            {
              flag=true;
              nge[i]=st.peek().idx;
              break;
            }
            st.pop();
        }
        if(flag==false)  nge[i] = n;
        st.push(new Pair(a[i],i));
      }
  }
  public static void main(String[] args) 
  {
      int[] a={1,3,-1,-3,5,3,6,7};
      int n=a.length;
      int k=3;
      int[] nge =new int[a.length];
      nextgreater(a, nge);
      System.out.println();
      List<Integer> ans = new ArrayList<>();
      int j=0;
      for(int i=0;i<n-k+1;i++)
      {
        if(j>=i+k) j=i;   // Agar j pehle se hi bahar h toh j=i kar do 
        int max = a[j];
        while(j<i+k)
        {
          max=a[j];
          j=nge[j];
        }
        ans.add(max);
      }
      System.out.println(ans);
  }
}
