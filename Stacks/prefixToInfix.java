package Stacks;
import java.util.*;
public class prefixToInfix 
{
  public static void main(String[] args) 
  {
    String s = "-9/*+5346";
    Stack<String> st = new Stack<>();

    for(int i=s.length()-1;i>=0;i--)
    {
        char ch = s.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48 && ascii<=57)
        {
          st.push(ch+"");
        }
        else
        {
          String val1= st.pop();
          String val2= st.pop();
          String newOp = "("+val1+ch+val2+")";
          st.push(newOp);
        }
    }
    System.out.println(st.peek());
  }
}
