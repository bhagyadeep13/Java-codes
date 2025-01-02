package Backtracking;
import java.util.*;
public class b 
{
    public static List<String> makeString(char[][] board)
    {
        List<String> al=new ArrayList<>();    // converting  direct 1D array String
        for(int i=0;i<board.length;i++)
        {
            System.out.println(board[i]);
        }
        return al;
    } 
    public static void main(String[] args) 
    {
        int n=4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        System.out.println(makeString(board));
    }
}
