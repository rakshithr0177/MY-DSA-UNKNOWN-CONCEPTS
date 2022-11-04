import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
public class SumOfUppLowTriangle {
    public static void main(String[] args) {
        int [][] arr = {{6, 5, 4},
                {1, 2, 5},
                {7, 9, 7}};
        System.out.println(sumTriangles(arr,arr.length));
    }

    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> ans  = new ArrayList<>();

        int sumLow = 0 ;
        int sumUp =0;

        for (int i = 0; i < row; i++) {
            for (int j = 0 ; j <= i ; j++) {
                sumLow = sumLow + matrix[i][j];
            }
            for (int j = row-1; j >= i ; j--) {
                sumUp = sumUp + matrix[i][j];
            }
        }
        ans.add(sumUp);
        ans.add(sumLow);
        return ans;
    }
}
