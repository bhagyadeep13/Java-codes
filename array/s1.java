package array;

public class s1 
{
    public static void main(String[] args) {
        int[] a={0,0,0,1,1,1};
        int z=0,one=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0) z++;
            else one++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(i<z)
            {
                a[i]=0;
            }
            else
            if(i<z+one)
            {
                a[i]=1;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
