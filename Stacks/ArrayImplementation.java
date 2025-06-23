package Stacks;

class Stacks
{
    int[] a = new int[10];
    int idx = 0;
    public void push(int n)
    {
      if(idx==a.length)
      {
        System.out.println("Stack is full");
        return;
      }
      a[idx] = n;
      idx++;
    }
    public int peek()
    {
      if(idx==0)
      {
        System.out.println("stack is empty");
        return Integer.MIN_VALUE;
      }
      return a[idx-1];
    }
    public int size()
    {
      return idx;
    }
    public int pop()
    {
      if(idx==0)
      {
        System.out.println("stack is empty");
        return Integer.MIN_VALUE;
      }
      int val = a[idx-1];
      a[idx-1] = 0;
      idx--;
      return val;
    }
    public boolean isEmpty()
    {
      if(idx==0)
      return true;
      else return false;
    }
    public void display()
    {
      for(int i=0;i<idx;i++)
      {
        System.out.print(a[i]+" ");
      }
      System.out.println();
    }
    public boolean isFull()
    {
        if(a.length==idx)
        {
          return true;
        }
        else return false;
    }
}
public class ArrayImplementation 
{
    public static void main(String[] args) 
    {
      Stacks st = new Stacks();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(1);
      st.push(2);
      System.out.println(st.isFull());
      st.display();
      System.out.println(st.peek());
      System.out.println(st.pop());
      st.display();
      st.pop();
      st.pop();
      st.pop();
      System.out.println(st.peek());
      System.out.println(st.size());
      System.out.println(st.isEmpty());
    }
}
