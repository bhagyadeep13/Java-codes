package Stacks;

import java.util.*;
public class NextGreater 
{ 
  public static void main(String[] args) 
  {
        int[] nums = {1,3,2,1,8,6,3,4};
        int[] ans = new int[nums.length];

        Stack<Integer> st = new Stack<>();
        st.push(nums[nums.length-1]);
        ans[ans.length-1]=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
          boolean flag = false;
           while(st.size()>0)
           {
              if(st.peek()>nums[i])
              {
                ans[i]=st.peek();
                flag = true;
                break;
              }
              st.pop();
           }
           if(flag == false)
           {
              ans[i]=-1;
           }
           st.push(nums[i]);
        }
        for(int i=0;i<ans.length;i++)
        {
          System.out.print(ans[i]+" ");
        }
  }
}
