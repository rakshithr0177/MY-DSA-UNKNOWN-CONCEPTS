import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] Mat={{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        Mat = sortedMatrix(Mat.length, Mat);
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[0].length; j++) {
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] sortedMatrix(int N, int Mat[][]) {
        int row = Mat.length;
        int col = Mat[0].length;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp.add(Mat[i][j]);
            }
        }
        Collections.sort(temp);

        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Mat[i][j] = temp.get(k);
                k++;
            }
        }
        return Mat;
    }
}
