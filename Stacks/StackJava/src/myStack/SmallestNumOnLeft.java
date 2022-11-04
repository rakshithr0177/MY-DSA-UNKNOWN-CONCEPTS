package myStack;
//https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmallestNumOnLeft {
    public static void main(String[] args) {
        int[] a = {2,1,4,3};
        List<Integer> ans = leftSmaller(4,a);
        System.out.println(ans);
    }
    public static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        for(int i = 0 ; i < n ;i++){
            int curr = a[i];
            while(s.peek() >= curr){
                s.pop();
            }
            ans.add(s.peek());
            s.push(curr);
        }
        return ans ;
    }
}
