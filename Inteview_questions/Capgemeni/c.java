package Inteview_questions.Capgemeni;

public class c 
{
    public static int gcd(int a,int b)
    {
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public static void main(String[] args) 
    {
        int[] a={2,5,5,7,12,18};
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(gcd(a[i],a[j])==1)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
