package Stacks;
import java.util.*;
public class BalancedBrackets 
{
  public static boolean helper(String s)
  {
    Stack<Character> st = new Stack();
    if(s.length()==0) return true;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='(') st.push('(');
      else
      {
        if(st.size()==0) return false;
        else
        {
          if(st.peek()=='(')
          {
            st.pop();
          }
        }
      }
    }
    if(st.size()==0) return true;
    else return false;
  }
  public static void main(String[] args) 
  {
      String s = "";
      System.out.println(helper(s));
  }
}
