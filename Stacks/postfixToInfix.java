package Stacks;

import java.util.*;

class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ch + "");
            } 
            else {
                String val2 = st.pop();
                String val1 = st.pop();
                String newOp = '(' + val1 +ch+val2 + ')';  // val1+op+val2 --> infix
                st.push(newOp);
            }
        }
        System.out.println(st.peek());
    }
}
