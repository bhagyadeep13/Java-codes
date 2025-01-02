// 37. Sudoku Solver

/*Write a program to solve a Sudoku puzzle by filling the empty cells.
A sudoku solution must satisfy all of the following rules:
Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells. */

package Backtracking;
import java.util.*;;
public class Sudoko_solver 
{
    public static boolean isValid(int row,int col,int k,char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            int blkrow=3*(row/3);
            int blkcol=3*(col/3)*3;
            if(board[i][col]==k) return false;
            if(board[row][i]==k) return false;
            if(board[blkrow+i/3][blkcol+i%3]==k) return false; 
        }
        return true;
    }
    public static boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(isValid(i,j,k,board))
                        {
                            board[i][j] = k;
                            if(solve(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)  // T.C -- O(1)
    {
        char[][] board ={{}};
        System.out.println(solve(board));
    }
}
