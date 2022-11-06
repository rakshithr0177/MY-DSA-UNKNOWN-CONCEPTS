package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>(n);
        char[][] board =  new char[n][n];
        int col = 0 ;
        solve(n, board , ans , col);
        return ans;
    }

    private static void solve(int n ,char[][] board, List<List<String>> ans, int col) {
        if(col == n ){
            solveBoard(board , ans , n);
            return;
        }

        for(int row = 0 ;  row < n ; row++){
            if(isSafe(n , board , row , col)){
                board[row][col] = 'Q';
                solve(n, board, ans, col+1);
                board[row][col] = '.';
            }
        }
    }

    private static void solveBoard(char[][] board, List<List<String>> ans , int n) {
        String row ="";
        List<String> output =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            row ="";
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'Q'){
                    row += "Q";
                }
                else{
                    row += ".";
                }
            }
            output.add(row);
        }
        ans.add(output);
    }

    private static boolean isSafe(int n, char[][] board, int row, int col) {
        int x =  row ;
        int y = col ;
        while(y >= 0){
            if(board[x][y] == 'Q'){
                return false;
            }
            y--;
        }
        x =  row ;
        y = col ;
        while(x >= 0 && y >= 0){
            if(board[x][y] == 'Q'){
                return false;
            }
            x--;
            y--;
        }
        x =  row ;
        y = col ;
        while(x < n && y >= 0){
            if(board[x][y] == 'Q'){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    public static void main(String[] args) {
        int n= 4 ;
        System.out.println(solveNQueens(n));
    }
}
