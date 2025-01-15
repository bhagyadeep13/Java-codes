package frequently_used;
import java.util.*;
public class binary_to_deci 
{
    public static int helper(String s)
    {
        int fac=1;
        int ans=0;
        int i=s.length()-1;
        while(i>=0)
        {
            ans=ans+Integer.parseInt(s.charAt(i)+"")*fac;
            fac=fac*2;
            i--;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "1010";
        System.out.println(Integer.parseInt(s,2));  // to binary
        System.out.println(helper(s));           // TO binary (old method)

        String s1 = "1A3F";
        System.out.println(Integer.parseInt(s1,16)); // to hexadecimal

        System.out.println(Integer.parseInt(s,10));  // to decimal
    }
}
