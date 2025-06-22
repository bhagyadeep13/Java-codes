package Stacks;

import java.util.*;

public class basic {

  public static void insertAtBottom(int data,Stack<Integer> st)
  {
      Stack<Integer> st1 = new Stack<>();
      while(st.size()>0)
      {
        st1.push(st.pop());
      }
      st1.push(data);
      while(st1.size()>0)
      {
        st.push(st1.pop());
      }
  }
  public static void reverseStack(Stack<Integer> st) // stack reverse
  {
      if(st.size()==0) return;
      int val = st.pop();
      System.out.print(val+" ");
      reverseStack(st);
  }
   public static void display(Stack<Integer> st)  // stack display
  {
      if(st.size()==0) return;
      int val = st.pop();
      display(st);
      System.out.print(val+" ");
  }
  public static void pushEleAtIdx(int idx,int data,Stack<Integer> st)
  {
      if(idx>st.size())
      {
        System.out.println("Invalid Index");
        return;
      }
      List<Integer> al= new ArrayList<>();
      while(st.size()>idx)
      {
          al.add(st.pop());
      }
      st.push(data);
      for(int i=al.size()-1;i>=0;i--)
      {
        st.push(al.get(i));
      }
  }
  public static void reverseRecursive(Stack<Integer> st)  // Reverse Stack Recursively
  {
      if(st.size()==0) return;
      int val = st.pop();
      reverseRecursive(st);
      insertAtBottom(val, st);
  }
  public static void main(String[] args) 
  {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st);
    insertAtBottom(6, st);
    System.out.println(st);
    /*System.out.println(st.lastElement());   // access last element 
    System.out.println(st.firstElement());  // access first element
    System.out.println(st.removeFirst());   // remove first element
    System.out.println(st.removeLast());    // remove last element*/
    pushEleAtIdx(5, 7, st);
    System.out.println(st);
    reverseRecursive(st);
    System.out.println(st);
  }
}
