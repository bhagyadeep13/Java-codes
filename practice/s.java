package practice;
import java.util.*;
public class s 
{
  public static void main(String[] args)
   {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    while(st.size()!=0)
    {
        System.out.print(st.pop()+" ");
    }
    
  }  
}
