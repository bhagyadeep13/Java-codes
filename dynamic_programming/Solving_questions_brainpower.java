// 2140. Solving Questions With Brainpower

/*You are given a 0-indexed 2D integer array questions where questions[i] = [pointsi, brainpoweri].
The array describes the questions of an exam, where you have to process the questions in order (i.e., starting from question 0) and make a decision whether to solve or skip each question. Solving question i will earn you pointsi points but you will be unable to solve each of the next brainpoweri questions. If you skip question i, you get to make the decision on the next question.

For example, given questions = [[3, 2], [4, 3], [4, 4], [2, 5]]:
If question 0 is solved, you will earn 3 points but you will be unable to solve questions 1 and 2.
If instead, question 0 is skipped and question 1 is solved, you will earn 4 points but you will be unable to solve questions 2 and 3.
Return the maximum points you can earn for the exam. */

/*Input: questions = [[3,2],[4,3],[4,4],[2,5]]
Output: 5 */

package dynamic_programming;
import java.util.*;
public class Solving_questions_brainpower 
{
    public static long helper(int[][] q,int i,long[] dp)
    {
        if(i>=q.length) return 0;
        if(dp[i]!=-1) return dp[i];
        long solve = q[i][0] + helper(q,i+q[i][1]+1,dp); // skip q[i][1] index
        long skip = helper(q,i+1,dp); // same as next value
        return dp[i] = Math.max(skip,solve);
    }
    public static void main(String[] args) 
    {
        int[][] q={{3,2},{4,3},{4,4},{2,5}};
        int n=q.length;
        long[] dp = new long[n]; // i --> 0 to n-1
        Arrays.fill(dp,-1);
        System.out.println(helper(q,0,dp));
    }
}
