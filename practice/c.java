package practice;

import java.util.*;

public class c 
{
    public static void main(String[] args) 
    {
        int[][] a={{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(a,(a1,a2)->(a1[0]-a2[0]));
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i][0]+","+a[i][1]+" ");
        }
        }
}
