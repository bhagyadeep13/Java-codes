package Bit_manipulation;
import java.util.*;
public class c 
{
    public static void main(String[] args) 
    {
       Stack<Integer> s=new Stack<>();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       System.out.println(s);
       while(s.size()>0)
       {
            s.removeElementAt(0);
       }
    }
}
