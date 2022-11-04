package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class BookAllocation {
    public static void main(String[] args) {

    }
    public static boolean isPossibleSol(ArrayList<Integer> arr, int n, int m , int mid){
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i <n ; i++) {
            if(pageSum + arr.get(i) <= mid){
                pageSum = pageSum + arr.get(i);
            }
            else{
                studentCount++;
                if(studentCount > m || arr.get(i) > mid){
                    return false;
                }
                pageSum = arr.get(i);
            }
        }
        return true;
    }

    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {

        int ans = -1 ; // if answer is not possible ie there is only one student

        int sum = 0 ;
        for (Integer i: arr) {
            sum = sum + i ;
        }

        int start = Collections.min(arr); ;  //minimum no of pages ie not really in the array
        int end = sum ;
        int mid = start + (end-start)/2;

        while( start <= end ){

            //If answer is possible try to find in left part of mid else in the right part
            if(isPossibleSol(arr,n,m,mid)){
                ans = mid ;
                end =  mid - 1 ;
            }else {
                start = mid + 1 ;
            }

            mid = start + (end-start)/2;

        }

        return ans;
    }
}
