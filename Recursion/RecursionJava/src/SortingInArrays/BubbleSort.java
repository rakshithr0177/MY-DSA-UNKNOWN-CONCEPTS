package SortingInArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr ={9,2,1,4,3,4};
        System.out.println(Arrays.toString(sorting(arr, arr.length-1, 0)));
    }
    public static int[] sorting(int [] arr , int passes , int currIndex){
        if (passes == 1){       //since n-1 passes
            return arr;
        }
        if (currIndex < passes){
            if(arr[currIndex] > arr[currIndex+1] ){
                int temp = arr[currIndex];
                arr[currIndex] =arr[currIndex+1];
                arr[currIndex+1] = temp ;
            }
            return sorting(arr,passes,currIndex+1);

        }
        else {
            return sorting(arr, passes - 1, 0);
        }
    }
}
