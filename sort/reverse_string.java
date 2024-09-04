package sort;
public class reverse_string 
{
    public static void reverse(char[] a,int i,int j)
        {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
           
        }
   public static void main(String[] args) 
   {
        char[] s={'h','e','l','l','o'};
        int l=0,k=s.length-1;
        while(l<k)
        {
            reverse(s,l,k);
            if(l==k)
            break;
            l++;
            k--;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]+" ");
        }
    }
}