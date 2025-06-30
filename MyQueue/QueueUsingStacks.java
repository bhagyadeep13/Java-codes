package MyQueue;
import java.util.*;;
class MyQueue1
{
  Stack<Integer> st1= new Stack<>();
  Stack<Integer> st2 = new Stack<>();
  public void add(int val)
  {
    st1.push(val);
  }
  public int remove()
  {
    if(size()==0)
    {
      System.out.println("Queue is Empty");
      return -1;
    }
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
    if(size()==0)
    {
      System.out.println("Queue is Empty");
      return -1;
    }
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
  public int size()
  {
    return st1.size();
  }
  public boolean isEmpty()
  {
    if(size()==0) return true;
    else return false;
  }
}
public class QueueUsingStacks 
{
  public static void main(String[] args) 
  {
    MyQueue1 m = new MyQueue1();
    m.add(1);
    m.add(2);
    m.add(3);
    m.add(4);
    m.display();
    System.out.println(m.remove());
    m.display();
    System.out.println(m.peek());
    m.remove();
    m.remove();
    m.remove();
  }
}
