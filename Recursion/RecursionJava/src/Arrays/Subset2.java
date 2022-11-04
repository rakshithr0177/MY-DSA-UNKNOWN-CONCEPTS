package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Subset2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> output =  new ArrayList<>();
        solve(nums , 0 , output , ans );
        return ans ;
    }

    private static void solve(int[] nums, int i, List<Integer> output, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(output));
        for (int j = i; j <nums.length ; j++) {
            if (j > i && nums[j] == nums[j-1] ){
                continue;
            }
            output.add(nums[j]);
            solve(nums, j+1, output, ans);
            output.remove(output.size()-1);
        }
    }
}
