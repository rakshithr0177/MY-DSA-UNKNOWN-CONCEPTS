package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {

        int [] nums = {1,2 ,3};
        System.out.println(permute(nums));

    }
    public static List<List<Integer>> permute(int []nums){
        List<List<Integer>> ans   =  new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int n = nums.length ;
        int i = 0 ;
        solve(nums , i , n  , output , ans);
        return ans ;
    }

    private static void solve(int[] nums, int i, int n ,List<Integer> output, List<List<Integer>> ans) {
        if(i == n ){
            for(int j = 0 ; j < n ; j++){
                output.add(nums[j]);
            }
            ans.add(new ArrayList<>(output));
            output.removeAll(output);
            return ;
        }
        for(int  j =  i ; j  < n ; j ++  ){
            int temp =  nums[i];
            nums[i] =  nums[j];
            nums[j] = temp ;

            solve(nums , i + 1 , n , output , ans);

            temp =  nums[i];
            nums[i] =  nums[j];
            nums[j] = temp;

        }
    }
}
