package Inteview_questions.Capgemeni;

public class b 
{
    public static void main(String[] args) 
    {
        String s = "#lau#bahab#";
        int count=0;
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='#') 
            {
                count++;
                s1.deleteCharAt(i);
            }
        }
        for(int i=0;i<count;i++)
        {
            s1.insert(0,'#');
        }
        System.out.println(s1);
    }
}
