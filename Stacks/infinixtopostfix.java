package Stacks;
import java.util.*;
public class infinixtopostfix
{
    public static void main(String[] args) 
    {
        String str="9-(5+3)*4/6";
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)
            {
                st.push(ch+"");
            }
            else
            {
                if(op.size()==0 || ch=='(' || op.peek()=='(')
                {
                    op.push(ch);
                }
                else
                {
                    if(ch==')')
                    {
                        while(op.peek()!='(')
                        {
                            String val2 = st.pop();
                            String val1 = st.pop();
                            char op1 = op.pop();
                            String newop = val1+val2+op1;
                            st.push(newop);
                        }
                        op.pop();
                    }
                    if(ch=='+' || ch=='-')
                    {
                        String val2 = st.pop();
                        String val1 = st.pop();
                        char op1 = op.pop();
                        String newop = val1+val2+op1;
                        st.push(newop);
                        op.push(ch);
                    }
                    else
                    if(ch=='*' || ch=='/')
                    {
                        if(op.peek()=='-' || op.peek()=='+') op.push(ch);
                        else
                        {
                            String val2 = st.pop();
                        String val1 = st.pop();
                        char op1 = op.pop();
                        String newop = val1+val2+op1;
                        st.push(newop);
                        op.push(ch);
                        }
                    }
                }
            }
            System.out.println(st+" "+op);
        }
        while(st.size()>1)
        {
                        String val2 = st.pop();
                        String val1 = st.pop();
                        char op1 = op.pop();
                       String newop = val1+val2+op1;
                        st.push(newop);
                        System.out.println(st+" "+op);
        }
        System.out.println(st.peek());  // postfix 
    }
}