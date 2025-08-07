package practice;

import java.util.*;

public class a 
{
    static class Pair
    {
      int val;
      int idx;
      Pair(int val,int idx)
      {
        this.val = val;
        this.idx = idx;
      }
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5};
        int[] nexGre = new int[a.length];
        nexGre[a.length-1] = -1;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(a[a.length-1],a.length-1));
        for(int i=a.length-2;i>=0;i--)
        {
            int val1 = a[i];
            while(st.size()>0)
            {
                if(st.peek().val>val1)
                {
                    nexGre[i] = st.peek().val;
                    break;
                }
                st.pop();
            }  
            if(st.size()==0)
            nexGre[i] = -1;

            st.push(new Pair(a[i],i));
        }
        for(int i=0;i<nexGre.length;i++)
        {
            System.out.print(nexGre[i]+" ");
        }

    }
}
