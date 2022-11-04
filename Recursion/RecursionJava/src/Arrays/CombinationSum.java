package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int [] nums = { 10 , 1 , 2 , 7 ,6 ,1 , 5};
        int target = 8 ;
        System.out.println(combinationSum(nums , target));
    }

    // 1, 2 ,3  target =  4 ; 112 13 22
    public static  List<List<Integer>> combinationSum(int[] candidates, int target){

        List<List<Integer>> ans  = new ArrayList<>();

        List<Integer> output = new ArrayList<>() ;

        int  i =  0  ;

        HashSet<List<Integer>> initial  = new HashSet<>();

        solve(candidates , target , i , output , initial );

        for (List<Integer> a: initial) {
            ans.add(new ArrayList<>(a));
        }


        return ans ;
    }

    private  static void  solve(int[] candidates, int target, int i , List<Integer> output, HashSet<List<Integer>> ans) {

        if(i >= candidates.length){
            if ( target == 0 ) {
                ans.add(new ArrayList<Integer>(output));
            }
            return ;
        }
        if ( target == 0 ) {
            ans.add(new ArrayList<Integer>(output));
            return;
        }


        if(candidates[i] <= target){
            output.add(candidates[ i ]);
            target = target - candidates[i];
            // Including the ith element again
            solve(candidates, target, i+1, output, ans);

            output.remove(output.size()-1);
            target = target + candidates[i];

        }

        solve(candidates, target, i+1, output, ans);

    }
}
