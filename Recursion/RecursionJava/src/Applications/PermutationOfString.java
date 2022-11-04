package Applications;

import java.util.ArrayList;
import java.util.List;

//sumit sir

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "abc";
        List<Integer> a =new ArrayList<>(3);
        System.out.println(a);
        List<String> ans  = permutations(s) ;
        System.out.println(ans);
    }

    public static List<String> permutations(String s){
        List<String> ans  = new ArrayList<>();
        String output = "" ;
        solve(s , output ,ans );
        return ans;
    }

    private static void solve(String s , String output , List<String> ans){
        if(s.length() == 0 ){
            ans.add(output);
            return ;
        }

        for(int i = 0 ; i < s.length() ; i++ ){
            //element that is taken
            char element  = s.charAt(i);

            //string that should be sent to next call
            //ex: str = "abc" if the above line choose 'b' then leftPart will be "a"
            String leftPart = s.substring(0,i);

            //string that should be sent to next call
            //ex: str = "abc" if the above line choose 'b' then leftPart will be "c"
            String rightPart =  s.substring(i+1 );

            //string that should be sent to next call
            //ex: str = "abc" after the above lines run both should be joined the string sent to next call is "ac"
            String rest = leftPart + rightPart;

            //next call
            solve(rest , output + element  , ans );
        }

    }
}
