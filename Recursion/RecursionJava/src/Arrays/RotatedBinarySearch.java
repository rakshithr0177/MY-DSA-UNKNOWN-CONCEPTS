package Arrays;

import java.util.ArrayList;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {6,7,8,9,3,4};
        System.out.println(binarySearch(arr,7,0,arr.length-1));
    }

    public static int binarySearch(int []arr , int target ,int start ,int end){

        if (start > end){
            return -1;
        }

        int mid =  start + (end - start)/2;

        if (arr[mid] == target){
            return mid ;
        }

        //case1:In the first half of the array
        //ie, if the first part is sorted
        if (arr[start] <= arr[mid] ){
            if (target >= arr[start] && target <= arr[mid]) {
                return binarySearch(arr, target , start , mid - 1);
            }
            else{
                return binarySearch(arr, target , mid + 1 , end);
            }
        }
        //case2:In the second part
        //if it is sorted
        if (target >= arr[start] && target <= arr[end]){
            return binarySearch(arr,target,mid+1,end);
        }
       return binarySearch(arr, target,start,mid-1);
    }
}
