package Stacks;
import java.util.*;
public class previousGreater 
{
  public static void main(String[] args) 
  {
        int[] nums = {1,3,2,1,8,6,3,4};
        int[] ans = new int[nums.length];
        if(nums.length==0) 
        {
          System.out.println("array is empty");
          return;
        }
        Stack<Integer> st = new Stack<>();
        ans[0]=-1;
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++)
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
