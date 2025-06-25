package Stacks;
import java.util.*;

 class EvaluateInfinix 
 {
    public static void main(String[] args) 
    {
        String str="9-(5+3)*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)
            {
                st.push(ascii-48);
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
                            int val2 = st.pop();
                            int val1 = st.pop();
                            char op1 = op.pop();
                            if(op1=='*') st.push(val1*val2);
                            else if(op1=='/') st.push(val1/val2);
                            else if(op1=='+') st.push(val1+val2);
                            else if(op1=='-') st.push(val1-val2);
                        }
                        op.pop();
                    }
                    if(ch=='+' || ch=='-')
                    {
                        int val2 = st.pop();
                        int val1 = st.pop();
                        char op1 = op.pop();
                        if(op1=='*') st.push(val1*val2);
                        else if(op1=='/') st.push(val1/val2);
                        else if(op1=='+') st.push(val1+val2);
                        else if(op1=='-') st.push(val1-val2);
                        op.push(ch);
                    }
                    else
                    if(ch=='*' || ch=='/')
                    {
                        if(op.peek()=='-' || op.peek()=='+') op.push(ch);
                        else
                        {
                            int val2 = st.pop();
                            int val1 = st.pop();
                            char op1 = op.pop();
                            if(op1=='*') st.push(val1*val2);
                            else if(op1=='/') st.push(val1/val2);
                            else if(op1=='+') st.push(val1+val2);
                            else if(op1=='-') st.push(val1-val2);
                            op.push(ch);
                        }
                    }
                }
            }
            System.out.println(st+" "+op);
        }
        System.out.println(st);
        while(st.size()>1)
        {
            int val2 = st.pop();
            int val1 = st.pop();
            char op1 = op.pop();
            if(op1=='*') st.push(val1*val2);
            else if(op1=='/') st.push(val1/val2);
            else if(op1=='+') st.push(val1+val2);
            else if(op1=='-') st.push(val1-val2);
        }
        System.out.println(st.peek());
}
 }
