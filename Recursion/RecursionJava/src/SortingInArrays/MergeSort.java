package SortingInArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {8,7,6,5,4,3,2,1};

        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static int [] sorting(int []arr ){
        if (arr.length == 1 ){
            return arr;
        }
        int mid = arr.length / 2;
        int []left = sorting(Arrays.copyOfRange(arr,0,mid));
        int []right = sorting(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int []first , int []second){
        int []ans = new int[first.length+ second.length];
        int i = 0 ;
        int j  =  0 ;
        int k = 0;

        while(i< first.length && j < second.length){
            if (first[i] < second[j]){
                ans[k] = first[i];
                i++;
            }else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }



    public static void mergeSortInPlace(int[]arr , int start ,int end){
        if (end - start == 1){
            return;
        }
        int mid = start + (end -  start ) / 2;
        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);

        mergeInPlace(arr,start,mid,end);
    }

    public static  void mergeInPlace(int []arr , int start ,int mid , int end ){
        int [] ans = new int[end - start];
        int i = start ;
        int j = mid ;
        int k = 0;
        
        while(i< mid && j < end){
            if (arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i< mid){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j< end){
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < ans.length ; l++) {
            arr[start+l] = ans[l];
        }

    }


}
