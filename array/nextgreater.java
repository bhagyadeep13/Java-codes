package array;

public class nextgreater 
{
    public static void main(String[] args) 
    {
        int[] a={12,8,41,37,2,49,16,28,21};
        int[] res=new int[a.length];
        for(int i=0;i<a.length-1;i++)
        {
            int max=Integer.MIN_VALUE;
             for(int j=i+1;j<a.length;j++)
             {
                 max=Math.max(max,a[j]);
             }
             res[i]=max;
            
        }
        res[a.length-1]=-1;
        for(int x : res)
        {
            System.out.print(x+" ");
        }
    }
}
