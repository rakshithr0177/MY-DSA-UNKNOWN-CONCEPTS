package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumI {
    public static void main(String[] args) {
        ArrayList<Integer > a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(subsetSums(a , a.size()));
     }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr , int N){
        ArrayList<Integer> ans  = new ArrayList<>() ;
        int i = 0 ;
        int sum = 0;
        solve(arr ,  N  , i , sum ,  ans);
        Collections.sort(ans);
        return ans ;
    }

    private static void solve(ArrayList<Integer> arr, int n, int i,int sum , ArrayList<Integer> ans) {
        if( i >= n){
            ans.add(sum);
            return ;
        }
        // excluding call
        solve(arr , n , i+ 1 , sum , ans );
        //including call
        solve(arr , n , i + 1,  sum + arr.get(i) , ans);
    }
}
