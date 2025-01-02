package Backtracking;
import java.util.*;
public class N_Queens 
{
    public static List<String> makeString(char[][] board)
    {
        List<String> al=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String row = String.valueOf(board[i]);  //direct conversion char[] arr to 
            al.add(row);                 // String 
        }
        return al;
    } 
    public static boolean isSafe(char[][] board,int row,int col)
    {
        // check vertically
        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q')
            return false;
        }

        // check leftdiagonally
        int maxLeft = Math.min(row,col);
        for(int i=0;i<=maxLeft;i++)
        {
            if(board[row-i][col-i]=='Q')
            return false;
        }

        // check Rightdiagonally
        int maxRight = Math.min(row,board.length-1-col);
        for(int i=0;i<=maxRight;i++)
        {
            if(board[row-i][col+i]=='Q')
            return false;
        }
        return true;
    }
    public static void helper(List<List<String>> all,char[][] board, int row)
    {
        if(row==board.length)
        {
            all.add(makeString(board));
        }
        for(int col=0;col<board[0].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = 'Q';
                helper(all,board,row+1);
                board[row][col] = '.';
            }
        }
    }
    public static void main(String[] args) 
    {
        int n=4;
        List<List<String>> all =new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        helper(all, board, 0);
        for(int i=0;i<all.size();i++)
        {
            System.out.println(all.get(i));
        }
    }
}
