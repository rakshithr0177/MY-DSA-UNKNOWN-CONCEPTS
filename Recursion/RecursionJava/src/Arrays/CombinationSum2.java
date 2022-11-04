package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int [] a  = {1,1,1,2,2};
        System.out.println(combinationSum2(a , 4));
    }

    public static List<List<Integer>> combinationSum2(int [] nums ,int target){
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> output =  new ArrayList<>();
        int i = 0 ;
        Arrays.sort(nums);
        solve(nums, target , i , output , ans );
        return ans  ;
    }

    private static void solve(int[] nums, int target, int index, List<Integer> output, List<List<Integer>> ans) {

        if(target == 0){
            ans.add(new ArrayList<>(output));
            return ;
        }

        for(int i = index ;  i < nums.length ; i++  ){

            if (i > index && nums[i] == nums[i-1]){  //i > index this is for the first index of every new recursion call
                continue;
            }

            if (nums[i] > target){
                break ;
            }

            output.add(nums[i]);
            solve(nums, target - nums[i] ,i+1 , output , ans);
            output.remove(output.size()-1);

        }
    }

}
