// 1710. Maximum Units on a Truck

/*You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
Return the maximum total number of units that can be put on the truck. */

/*Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8 */

package Greedy;
import java.util.*;
public class Max_unit_on_trunk 
{
    public static int maximumUnits(int[][] b, int t) 
    {
        int sum=0;
        Arrays.sort(b,(b1,b2) -> b2[1]-b1[1]); // sort on basis of ele at idx=1 of
        for(int i=0;i<b.length;i++)            // both arrays b1,b2
        {
            int num = b[i][0];
            int unit = b[i][1];
            int min = Math.min(t,num);
            t=t-min;
            sum=sum+min*unit;
            if(t==0)
            {
                return sum;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int[][] a = {{1,3},{2,2},{3,1}};
        int trucksize=4;
        System.out.println(maximumUnits(a, trucksize));
    }
}
