// 2429. Minimize XOR

/*Given two positive integers num1 and num2, find the positive integer x such that:
x has the same number of set bits as num2, and
The value x XOR num1 is minimal.
Note that XOR is the bitwise XOR operation.
Return the integer x. The test cases are generated such that x is uniquely determined.
The number of set bits of an integer is the number of 1's in its binary representation. */
package Bit_manipulation;
import java.util.*;
public class minimize_XOR 
{
    public static int minimizeXor(int num1, int num2) 
    {
        int count=0;
        StringBuilder s1=new StringBuilder(Integer.toBinaryString(num1));
        StringBuilder s2=new StringBuilder(Integer.toBinaryString(num2));
        count=Integer.bitCount(num2); // count the sets bits in s2
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1' && count>0)    // Traverse s1 string
            {                                   // if(s1.charAt(i)=='1') && count>0
                ans.append('1');              // ans me add kar do 1
                count--;                       
            }
            else                                
            {
                ans.append('0');
            }
        }
        if(count==0) return Integer.parseInt(ans.toString(),2);
        StringBuilder ans2=new StringBuilder("");
        int i=s1.length()-1;
        while(i>=0)                             // if(count>0)
        {                                       // Traverse from lastIdx of s1
            if(s1.charAt(i)=='0' && count>0)    // if(s1.charAt(i)=='0' && count>0)
            {                                   // ans2 me starting me 1 add kar do
                ans2.insert(0,"1");
                count--;
            }
            else
            {
                ans2.insert(0,ans.charAt(i));
            }
            i--;
        }
        while(count>0)                           // if(count>0) 
        {                                       // ans2 ke starting me 1  add kar do
            ans2.insert(0,"1");
            count--;
        }
        return Integer.parseInt(ans2.toString(),2);
    }
    public static void main(String[] args) 
    {
        int num1=3;
        int num2=5;
        System.out.println(minimizeXor(num1, num2));
    }
}
