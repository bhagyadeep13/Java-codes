package frequently_used;

public class check_String_isSubsequence 
{
    public static void main(String[] args) 
    {
        String s ="abc";
        String t = "cbaabc"; // check a string s is a Subsequence of t or not
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        if(i==s.length()) 
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
