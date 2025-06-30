package MyQueue;
import java.util.*;
import java.util.Queue;
public class reverse_k_elements 
{
    public static void main(String[] args) 
    {
        // Example usage:
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        int n= queue.size();
        int k = 2;
        int d = k;
        Stack<Integer> st = new Stack<>();
        while(k>0 && queue.size()>0)
        {
            st.push(queue.remove());
            k--;
        }
        while(st.size()>0)
        {
            queue.add(st.pop());
        }
        int i=n-d;
        while(i>0)
        {
            queue.add(queue.remove());
            i--;
        }
        System.out.println(queue);
    }
}
