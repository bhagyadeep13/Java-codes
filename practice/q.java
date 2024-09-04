package practice;
import java.util.*;
public class q 
{
   static void reverse(Queue<Integer> q)
    {
        Stack<Integer> st=new Stack<>();
         int n=q.size();
         while(q.size()!=0)
         {
             st.push(q.remove());
         }
         while(st.size()!=0)
         {
             q.add(st.pop());
         }
         System.out.println(q);
    }
    static void pallin(Queue<Integer> q)
    {
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        while(q.size()>0)
        {
            if(st.size()==0)
            {
                st.push(q.remove());
            }
            else
            {
                if(st.peek()==q.remove())
                {
                    st.pop();
                }
            }
        }
        if(st.size()==0)
        System.out.println("palindrome");
        else
        System.out.println("Not a pallindrome");
    }
   public static void main(String[] args) 
   {
   Queue<Integer> q1=new ArrayDeque<>();
   q1.add(1);
   q1.add(3);
   q1.add(3);
   q1.add(1);
   reverse(q1);
   pallin(q1);
   } 
}
