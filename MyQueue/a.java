package MyQueue;

import java.util.Stack;

class Queue2
  {
      Stack<Integer> st1 = new Stack<>();
      Stack<Integer> st2 = new Stack<>();
      
      public void add(int n)
      {
          st1.push(n);
      }
      public int remove()
      {
          while(st1.size()>1)
          {
            st2.push(st1.pop());
          }
          int val = st1.pop();
          while(st2.size()>0)
          {
              st1.push(st2.pop());
          }
          return val;
      }
      public int peek()
      {
          while(st1.size()>1)
          {
            st2.push(st1.pop());
          }
          int val = st1.peek();
          while(st2.size()>0)
          {
              st1.push(st2.pop());
          }
          return val;
      }
      public void display()
      {
          System.out.println(st1);
      }
  }
public class a 
{
  public static void main(String[] args)  
  {
      Queue2 q = new Queue2();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.display();
      q.remove();
      q.display();
      System.out.println(q.peek());

  }
}
