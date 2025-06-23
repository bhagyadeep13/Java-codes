package Stacks;

import java.util.*;
class Stacks
{
    List<Integer> al= new ArrayList<>();
    int size=al.size();
    public void push(int n)
    {
      al.add(n);
    }
    public int peek()
    {
      if(size==0)
      {
        System.out.println("Stack is empty");
        return Integer.MIN_VALUE;
      }
      return al.get(al.size()-1);
    }
    public int size()
    {
      return size;
    }
    public int pop()
    {
      if(size==0)
      {
        System.out.println("Stack is empty");
        return Integer.MIN_VALUE;
      }
      int val = al.remove(al.size()-1);
      return val;
    }
    public boolean isEmpty()
    {
      if(size==0)
      return true;
      else return false;
    }
    public void display()
    {
      for(int i=0;i<size;i++)
      {
        System.out.print(al.get(i)+" ");
      }
      System.out.println();
    }
}
public class ArrayListImplementation 
{
    public static void main(String[] args) 
    {
      Stacks st = new Stacks();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.display();
      System.out.println(st.size());
      System.out.println(st.peek());
      System.out.println(st.pop());
      st.pop();
      st.pop();
      st.pop();
      System.out.println(st.isEmpty());
    }
}
