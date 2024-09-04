package Strings;
public class a 
{
    public static String lead(int n)
    {
        StringBuilder s1=new StringBuilder(n+"");
        int diff=4-s1.length();
        int i=0;
        while(i<diff)
        {
            s1.insert(i,'0');
            i++;
        }
        return s1.toString();
    }
    public static void main(String[] args) 
    {
        int n1=987,n2=879,n3=798;
        String s1=lead(n1);
        String s2=lead(n2);
        String s3=lead(n3);
        System.out.println(s1+" "+s2+" "+s3);
        String ans="";
        for(int i=0;i<4;i++)
        {
            int v1=Integer.parseInt(s1.charAt(i)+"");
            int v2=Integer.parseInt(s2.charAt(i)+"");
            int v3=Integer.parseInt(s3.charAt(i)+"");
            if(v1<=v2 && v1<=v3) ans=ans+v1;
            else if(v2<v1 && v2<v3) ans=ans+v2;
            else ans=ans+v3;
        }
        int idx=0;
        for(int i=0;i<ans.length();i++)
        {
            if(ans.charAt(i)!='0')
            {
                idx=i;
                break;
            }
        }
        System.out.println(Integer.parseInt(ans.substring(idx)+""));
    }
}
