package MyQueue;
import java.util.*;
import java.util.Queue;
public class ReorderQueue 
{
  public static void main(String[] args) 
  {
    Queue<Integer> q = new ArrayDeque<>();
    Stack<Integer> st = new Stack<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    int size = q.size();
    for(int i=0;i<size/2;i++)
    {
      st.push(q.remove());
    }
    System.out.println(q+" "+st);
    while(st.size()>0)
    {
      q.add(st.pop());
    }
    for(int i=0;i<size/2;i++)
    {
      st.push(q.remove());
    }
    while(st.size()>0)
    {
      q.add(st.pop());
      q.add(q.remove());
    }
    while(q.size()>0)
    {
      st.push(q.remove());
    }
    while(st.size()>0)
    {
      q.add(st.pop());
    }
    System.out.println(q);
  }
}
