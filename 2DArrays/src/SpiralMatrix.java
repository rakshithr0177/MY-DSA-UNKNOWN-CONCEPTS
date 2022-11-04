import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
    public static void main(String[] args) {
        List<Integer> ans  = new ArrayList<>();
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}

        };
        ans = spiralOrder(matrix);
        System.out.println(ans);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans  = new ArrayList<>();
        int row =matrix.length;
        int col = matrix[0].length;
        int totalElements = row * col ;
        int count = 0 ;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row-1;
        int endingCol =  col-1 ;



        while(count < totalElements){

            for (int i = startingCol; i <=endingCol && count < totalElements ; i++) {
                ans.add(matrix[startingRow][i]);
                count++;
            }
            startingRow++;

            for (int i = startingRow; i <=endingRow  &&count < totalElements; i++) {
                ans.add(matrix[i][endingCol]);
                count++;
            }
            endingCol--;

            for (int i = endingCol; i >=startingCol && count < totalElements; i--) {
                ans.add(matrix[endingRow][i]);
                count++;
            }
            endingRow--;

            for (int i = endingRow; i >=startingRow && count < totalElements ; i--) {
                ans.add(matrix[i][startingCol]);
                count++;
            }
            startingCol++;


        }

        return ans ;
    }
}
