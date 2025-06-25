package Stacks;

import java.util.Stack;

public class previousSmaller 
{
  public static void main(String[] args) {

        int[] nums = {5,2,4,6,3,5};
        int[] ans = new int[nums.length];

        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(nums[0]);
        for(int i = 1;i<nums.length;i++)
        {
            boolean flag = false;
            while(st.size()>0)
            {
                if(nums[i]>st.peek())
                {
                  ans[i] = st.peek();
                  flag = true;
                  break;
                }
                st.pop();
            }
            if(flag == false)
            {
              ans[i] = -1;
            }
            st.push(nums[i]);
        }
        for(int i=0;i<ans.length;i++)
        {
          System.out.print(ans[i]+" ");
        }
  }
}
