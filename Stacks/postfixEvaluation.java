package Stacks;
import java.util.*;

class postfixEvaluation 
{
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57)
            {
                st.push(ascii-48);
            }
            else
            {
                int val2 = st.pop();  
                int val1 = st.pop();
                if(ch=='+') st.push(val1+val2);
                if(ch=='-') st.push(val1-val2);
                if(ch=='*') st.push(val1*val2);
                if(ch=='/') st.push(val1/val2);
            }
            System.out.println(st);
        }
    System.out.println(st.peek());
}
}
