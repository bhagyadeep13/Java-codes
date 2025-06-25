package Stacks;
import java.util.*;
class postfixToPrefix 
{
    public static void main(String[] args) {
        String str="953+4*6/-";               // postfix -- 
        Stack<String> val=new Stack<>();        // 1) val2 pehele then val1
                                                // 2) siddha loop chalega
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)
            {
                val.push(ch+"");
            }
            else
            {
                String val2 = val.pop();
                String val1 = val.pop();
                String newOp = ch+val1+val2;
                val.push(newOp);
            }
        }
    System.out.println(val.peek());
}
}
