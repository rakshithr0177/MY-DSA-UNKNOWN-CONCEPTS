import java.util.Arrays;

public class Rotate90Degree {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static  void rev(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = col-1 ;

        while(i<j){
            for (int k = 0; k < row; k++) {
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
            i++;
            j--;
        }
    }

    static void rotate(int matrix[][]) {
        transpose(matrix);
        rev(matrix);
        transpose(matrix);
        rev(matrix);
        transpose(matrix);
        rev(matrix);
    }
}
