package questions;
//https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s ="aabc";
        System.out.println(FirstNonRepeatingChar(s));

    }
    public static String FirstNonRepeatingChar(String A)
    {
        // code here
        HashMap<Character , Integer> map = new HashMap<>();
        String ans = "";
        Queue<Character> q = new LinkedList<>();

        for(int i = 0 ; i < A.length() ; i++){
            char ch = A.charAt(i) ;
            q.add(ch);
            map.putIfAbsent(ch,0);
            map.put(ch , map.get(ch)+1);

            while(!q.isEmpty()){
                if (map.get(q.peek()) > 1){
                    q.remove();
                }
                else{
                    ans = ans + q.peek();
                    break ;
                }
            }
            if(q.isEmpty()){
                ans = ans + "#";
            }

        }
        return ans ;

    }
}
