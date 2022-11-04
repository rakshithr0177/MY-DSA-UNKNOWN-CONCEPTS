public class RowWithMax1s {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(arr,4,4));
    }
    static int rowWithMax1s(int arr[][], int n, int m) {
        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                if(arr[row][col] == 1){
                    return row;
                }
            }
        }
        return -1;
    }
}
