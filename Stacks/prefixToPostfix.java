package Stacks;
import java.util.*;
class prefixToPostfix
{
    public static void main(String[] args) {
        String str="-9/*+5346";                 // prefix -- 
                                                // 1) val1 <-> val2
        Stack<String> val=new Stack<>();        //2) ulta loop chalega

        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57)
            {
                val.push(ch+"");
            }
            else
            {
                String val1 = val.pop();
                String val2 = val.pop();
                String newOp = val1+val2+ch;
                val.push(newOp);
            }
        }
    System.out.println(val.peek());
}
}
