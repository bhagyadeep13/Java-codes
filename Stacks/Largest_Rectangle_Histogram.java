package Stacks;
import java.util.*;
public class Largest_Rectangle_Histogram 
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
    public static void NextSmaller(int[] nums,int[] ans)
    {
        Stack<Pair> st = new Stack<>();
        ans[ans.length-1] = nums.length;
        st.push(new Pair(nums[nums.length-1],nums.length-1));
        for(int i=nums.length-2;i>=0;i--)
        {
            boolean flag = false;
            while(st.size()>0)
            {
              if(nums[i]>st.peek().val)
              {
                ans[i] = st.peek().idx;
                flag = true;
                break;
              }
              st.pop();
            }
            if(flag == false)
            {
              ans[i] = nums.length;
            }
            st.push(new Pair(nums[i],i));
        }
    }
    public static void PreviousSmaller(int[] nums,int[] ans)
    {
        Stack<Pair> st = new Stack<>();
        ans[0] = -1;
        st.push(new Pair(nums[0],0));
        for(int i = 1;i<nums.length;i++)
        {
            boolean flag = false;
            while(st.size()>0)
            {
                if(nums[i]>st.peek().val)
                {
                  ans[i] = st.peek().idx;
                  flag = true;
                  break;
                }
                st.pop();
            }
            if(flag == false)
            {
              ans[i] = -1;
            }
            st.push(new Pair(nums[i],i));
        }
    }
    public static void main(String[] args) 
    {
        int[] nums = {5,2,4,6,3,5};
        int[] nextSmaller = new int[nums.length];
        int[] previousSmaller = new int[nums.length];

        NextSmaller(nums,nextSmaller);
        PreviousSmaller(nums, previousSmaller);

        for(int i=0;i<nextSmaller.length;i++)
        {
          System.out.print(nextSmaller[i]+" ");
        }
        System.out.println();
        for(int i=0;i<previousSmaller.length;i++)
        {
          System.out.print(previousSmaller[i]+" ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
          max = Math.max(max,nums[i]*(nextSmaller[i]-previousSmaller[i]-1));
        }
        System.out.println(max);

        // Explanation 

        /* 1️⃣ NextSmaller() → Find for each bar:
👉 Index of next smaller bar on the right.
👉 If none → nums.length

2️⃣ PreviousSmaller() → Find for each bar:
👉 Index of previous smaller bar on the left.
👉 If none → -1

3️⃣ Main loop:
For each bar i:

arduino
Copy
Edit
width = nextSmaller[i] - previousSmaller[i] - 1
area = height * width
update max area */
    }
}
