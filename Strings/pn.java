package Strings;

public class pn 
{
    public static int left(int a,char ele,StringBuilder s)
    {
        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)==ele)
            return i;
        }
        return -1;
    }
    public static int right(int a,char ele,StringBuilder s)
    {
        for(int i=a+1;i<s.length();i++)
        {
            if(s.charAt(i)==ele)
            {
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="abaacbcbb";
        StringBuilder s1=new StringBuilder(s);
        boolean flag=false;
        for(int i=0;i<s1.length()-1;i++)
        {
            if(left(i,s.charAt(i),s1)!=-1)
            {
                s1.deleteCharAt(left(i,s.charAt(i),s1));
            }
            if(right(i,s.charAt(i),s1)!=-1)
            {
                s1.deleteCharAt(right(i,s.charAt(i),s1));
            }
        }
       System.out.println(s1.length());
    }
}

