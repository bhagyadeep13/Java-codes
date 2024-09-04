package array;
import java.util.*;
public class sort2 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,0,2,1,0,2,1,0,2,0,1};
        int zero=0,one=0,two=0;
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            zero++;
            else
            if(a[i]==1)
            one++;
            else
            two++;

        }
        for(int i=0;i<a.length;i++)
        {
            if(i<zero)
            {
                a[i]=0;
            }
            else
            {
            if(i<one+zero)
            a[i]=1;
            else
            a[i]=2;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
