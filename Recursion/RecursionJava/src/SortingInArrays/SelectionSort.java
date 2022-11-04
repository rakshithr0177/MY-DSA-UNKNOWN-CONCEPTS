package SortingInArrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr ={7,6};
        System.out.println(Arrays.toString(sorting(arr, 0, 1)));
    }
    public static int[] sorting(int []arr , int passes ,int currIndex){
        if (passes == arr.length-1 ){
            return arr;
        }
        if (currIndex == arr.length){
            int nextPass = passes + 1;
            currIndex = nextPass + 1;
            return sorting(arr,nextPass,currIndex);
        }
        if (arr[passes]>arr[currIndex]){
            int temp = arr[passes];
            arr[passes] = arr[currIndex];
            arr[currIndex] = temp;
        }
        return sorting(arr,passes,currIndex+1);
    }
}
