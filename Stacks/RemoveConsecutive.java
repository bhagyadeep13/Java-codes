package Stacks;
import java.util.*;
public class RemoveConsecutive 
{
  public static void helper(int[] a)
  {
      Stack<Integer> st = new Stack<>();
      for(int i=0;i<a.length;i++)
      {
        if(st.size()==0 || st.peek()!=a[i])
        {
          st.push(a[i]);
        }
        else
        if(st.peek()==a[i])
        {
          if(i==a.length-1 || a[i]!=a[i+1])
          {
            st.pop();
          }
        }
      }
      System.out.println(st);
  }
  public static void main(String[] args) 
  {
      int[] a={1,3,2,2,10,10,10,4,4,4,5,7,7,2,2};
      helper(a);
  }
}
