package MyQueue;
import java.util.*;
import java.util.Queue;

class Stacks
{
  Queue<Integer> q = new ArrayDeque<>();
  public void push(int val)                  // T.C -- O(1)
  {
    q.add(val);
  }
  public int peek() throws Exception     // T.C -- O(N)
  {
    if(size()==0)
    {
      throw new Exception("Queue is Empty");
    }
    int size = q.size();
    for(int i=0;i<size-1;i++)
    {
      q.add(q.remove());
    }
    int val = q.peek();
    q.add(q.remove());
    return val;
  }
  public int pop() throws Exception          // T.C -- O(N)
  {
    if(size()==0)
    {
      throw new Exception("Queue is Empty");
    }
    int size = q.size();
    for(int i=0;i<size-1;i++)
    {
      q.add(q.remove());
    }
    int val = q.peek();
    q.remove();
    return val;
  }
  public void display()
  {
    System.out.println(q);
  }
  public int size()
  {
    return q.size();
  }
  public boolean isEmpty()
  {
    if(size()==0) return true;
    else return false;
  }
}
public class StackUsingQueue 
{
  public static void main(String[] args) throws Exception{
  Stacks st = new Stacks();
  st.push(10);
  st.push(20);
  st.push(30);
  st.push(40);
  st.display();
  System.out.println(st.pop());
  st.display();
  // System.out.println(st.peek());
  // st.display();
  // st.pop();
  // st.pop();
  // st.display();
  // System.out.println(st.peek());
}
}
