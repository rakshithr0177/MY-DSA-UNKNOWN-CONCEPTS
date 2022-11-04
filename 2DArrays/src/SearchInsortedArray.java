public class SearchInsortedArray {
    public static void main(String[] args) {
        int [][]arr ={{10, 20, 30, 40},{15, 25, 35 ,45},{27, 29, 37, 48},{32, 33, 39, 50}};
        System.out.println(searchMatrix(arr,37));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0 ;
        int end = (row * col)-1;
        int mid = start + (end - start)/2;

        while(start <= end){
            int element = matrix[mid/col][mid%col];
            if(target == element){
                return true;
            }
            else if (target < element){
                end = mid - 1;
            }
            else{
                start = mid+1 ;
            }
            mid = start + (end - start)/2;
        }

        return false;
    }
}
