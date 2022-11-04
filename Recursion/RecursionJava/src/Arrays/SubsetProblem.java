package Arrays;
//https://leetcode.com/problems/subsets/submissions/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetProblem {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(subsets(A));

    }
    public static List<List<Integer>> subsets(ArrayList<Integer> A) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(A,A.size()-1,output,ans);
        return ans;
    }
    private static void solve(ArrayList<Integer> A, int index ,List<Integer> output ,List<List<Integer>> ans){

        if (index < 0){
           // Collections.sort(output);
            ans.add(new ArrayList<>(output));

            return;
        }

        solve(A,index-1,output,ans);
        int element = A.get(index);
        output.add(element);
        solve(A,index-1,output,ans);
        output.remove(output.size()-1);
    }
}
