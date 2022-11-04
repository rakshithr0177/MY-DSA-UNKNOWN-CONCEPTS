package Applications;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneN0 {
    public static void main(String[] args) {
        String  name = "23";
        List<String> ans  = letterCombinations(name);
        System.out.println(ans);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans ;
        }
        String output = "";
        String letters[] = {"" ,"" , "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int i = 0 ;
        solve(digits , letters , i , output ,ans);
        return ans ;
    }

    private static void solve(String digits , String [] letters , int i ,String output , List<String> ans){
        if( i >= digits.length()){
            ans.add(output);
            return ;
        }

        int number = digits.charAt(i) - '0';

        String values = letters[number];
        for(int j = 0 ; j < values.length() ; j++){
            output = output + values.charAt(j) ;

            solve(digits , letters , i+1 ,output ,ans);

            output = output.substring(0 ,output.length() - 1);
        }
    }
}
