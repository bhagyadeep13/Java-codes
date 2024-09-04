package Strings;
public class toggle_each_char 
{
    public static void main(String[] args) {
        
        StringBuilder s1=new StringBuilder("RaGhAv");
        for(int i=0;i<s1.length();i++)
        {
            int ch=(int)s1.charAt(i);
            if(ch>=65&&ch<=90)
            {
                char ch1=(char)(ch+32);
                s1.setCharAt(i,ch1);
            }
            else
            {
                char ch1=(char)(ch-32);
                s1.setCharAt(i,ch1);
            }
        }
        System.out.println(s1);
    }
}
