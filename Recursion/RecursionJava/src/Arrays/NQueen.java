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
    //-----------------------------------------------------------------------------------
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int [][] board = new int[n][n];
        int col = 0 ;
        solve(n , board , col, ans);
        return ans ;
    }

    static void solve(int n , int [][] board , int col ,ArrayList<ArrayList<Integer>> ans ){
        if(col == n){
            for(int i = 0 ; i < n ;i++){
                System.out.print( board[0][i]+" ");
            }
            System.out.println();
            makeAns(board , ans , n );
            return;

        }
        for(int row =  0 ; row  < n ;  row++){
            if(isSafe(board , row ,col , n)){
                board[row][col] = 1 ;
                solve(n , board , col+1  , ans);
                board[row][col] = 0;
            }
        }
    }
    static boolean isSafe(int[][] board, int row, int col ,int n) {
        int x =  row ;
        int y = col ;
        while(y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            y--;
        }
        x =  row ;
        y = col ;
        while(x >= 0 && y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            x--;
            y--;
        }
        x =  row ;
        y = col ;
        while(x < n && y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    static void makeAns(int [][]board , ArrayList<ArrayList<Integer>>ans ,int n ){

        ArrayList<Integer> output = new ArrayList<>();

        for(int i =  0 ;  i < n ;  i++){
            for(int j = 0 ; j < n ; j++){
                if(board[j][i] == 1 ){
                    output.add(j+1);
                }
            }
        }
        ans.add(new ArrayList<>(output));

    }

    public static void main(String[] args) {
        int n= 4 ;
        System.out.println(nQueen(n));
    }
}
