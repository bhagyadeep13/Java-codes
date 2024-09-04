package array;

public class nextgreater2 
{
    public static void main(String[] args) {
        int[] a={1,26,59,45,2,1,5,4,9,6,6,55,4,8,48};
        int[] res=new int[a.length];
        int nge=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            res[i]=nge;
            nge=Math.max(a[i],nge);
        }
        res[a.length-1]=-1;
        for(int x: res)
        {
            System.out.print(x+" ");
        }
    }
}
