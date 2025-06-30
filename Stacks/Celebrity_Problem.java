// GFG

/*A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people. A square matrix mat[][] (n*n) is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

Note: Follow 0-based indexing. */

/*Input: mat[][] = [[1, 1, 0], [0, 1, 0], [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1st person. Therefore, 1 is the celebrity person.  */

package Stacks;
import java.util.*;
public class Celebrity_Problem              //  T.C -- O(N)
{
  public static int helper(int[][] a)
  {
    int n = a.length;
    Stack<Integer> st = new Stack();
    for(int i=0;i<n;i++)
    {
        st.push(i);
    }
    while(st.size()>1)
    {
      int val1 = st.pop();
      int val2 = st.pop();
      if(a[val1][val2]==0) st.push(val1);  // val1 not know val2
      else if(a[val2][val1]==0) st.push(val2);  // val2 not know val2
    }
    if(st.size()==0)
    {
      return -1;
    }
    int potential = st.peek();       
    for(int j=0;j<a[0].length;j++)   // To check that in that row all the ele are 0 except 
    {                                 // j==potential
      if(j==potential) continue;
      if(a[potential][j]==1) return -1;
    }
    for(int i=0;i<a.length;i++)     // To check that in that column all the ele are 1 
    {
      if(a[i][potential]==0) return -1;
    }
    return potential;
  }
  public static void main(String[] args) 
  {
    int n = 2;
    int[][] a ={{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
    System.out.println(helper(a));
  }
}
