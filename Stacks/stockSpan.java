package Stacks;
import java.util.*;
public class stockSpan 
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
        int[] nums = {21473,14891,26474,2116};
        int[] ans = new int[nums.length];
        if(nums.length==0) 
        {
          System.out.println("Array is empty");
          return;
        }
        Stack<Pair> st = new Stack<>();
        ans[0]=1;
        st.push(new Pair(nums[0],0));
        for(int i=1;i<nums.length;i++)
        {
          boolean flag = false;
           while(st.size()>0)
           {
              if(st.peek().val>nums[i])
              {
                ans[i]= i - st.peek().idx;
                flag = true;
                break;
              }
              st.pop();
           }
           if(flag == false)
           {
              ans[i] = i-0+1;  // if no previous greater is present
           }
           st.push(new Pair(nums[i],i));
        }
        for(int i=0;i<ans.length;i++)
        {
          System.out.print(ans[i]+" ");
        }
  }
}
