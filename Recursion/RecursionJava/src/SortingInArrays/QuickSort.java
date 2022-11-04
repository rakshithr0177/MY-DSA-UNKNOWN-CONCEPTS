package SortingInArrays;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = {8,7,6,5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr , int low , int high){
        if(low>=high){
            return ;
        }
        int pivot = findPivot(arr,low , high);
        sort(arr,low ,pivot-1 );
        sort(arr,pivot+1,high);
    }


    private static int findPivot(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low -  1;

        for (int j = low ; j < high ; j++) {
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp ;
        return i;
    }
}
