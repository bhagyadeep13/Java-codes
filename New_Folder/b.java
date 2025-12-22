public class b 
{
    public static void main(String[] args) 
    {
        int n = 7;
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i=1;i<a.length;i++)
        {
            if(2*i<=n && 2*i>=2) a[2*i] = a[i];
            if((2*i)+1<=n && (2*i)+1>=2)
            {
                a[(2*i)+1] = a[i] + a[i+1];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        System.out.println(max);
    }
}
