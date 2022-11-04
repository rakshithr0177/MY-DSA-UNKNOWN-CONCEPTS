import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][]arr ={
                {1,1}
        };
        int [] abs = search(arr,2);
        System.out.println(Arrays.toString(abs));
    }

    public static int[] search(int [][]arr , int target){
        int row = 0 ;
        int column = arr[0].length-1;


        while (row < arr.length-1 && column >=0){
            if (target == arr[row][column]) {
                return new int[]{row,column};
            }
            else if (target < arr[row][column]){
                column--;
            }
            if(target > arr[row][column]){
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
