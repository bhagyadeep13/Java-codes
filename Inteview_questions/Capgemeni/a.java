package Inteview_questions.Capgemeni;

public class a 
{
    static String s1 = "aeiou";
    public static boolean helper(char ch)
    {
        if(s1.contains(ch+"")) return true;
        else return false;
    }
    public static void main(String[] args) 
    {
        String s = "greiay";
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s1.length();i++)
        {
            int val = 0;
            for(int j=0;j<s.length();j++)
            {
                if(helper(s.charAt(j)))
                {
                    val = val + Math.abs((int)s.charAt(j) - (int)s1.charAt(i));
                }
                else
                {
                    val = val + 10;
                }
            }
            min = Math.min(min,val);
        }
        System.out.println(min);
    }
}
