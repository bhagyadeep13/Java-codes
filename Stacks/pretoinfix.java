package Stacks;
import java.util.*;
class pretoinfix {
    public static void main(String[] args) {
    Stack<String> val=new Stack<>();
    String str="-9/*+5346";
    System.out.println(str);
    for(int i=str.length()-1;i>=0;i--)
    {
        char ch=str.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48&&ascii<=57)
        {
            String s=""+ch;
            val.push(s);
        }
        else
        {
            String v1=val.pop();
            String v2=val.pop();
            char op=ch;
            String s="("+v1+op+v2+")";
            val.push(s);
        }
    }
    System.out.println(val.peek());
}
}


