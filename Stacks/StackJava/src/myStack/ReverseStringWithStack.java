package myStack;

import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        String s = "Make";
        System.out.println(reverse(s));
    }
    public static String reverse(String S){
        Stack<Character> s = new Stack<>();
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            s.push(S.charAt(i));
        }

        while(!s.isEmpty()){
            ans = ans + s.pop();
        }
        return ans;
    }
}
