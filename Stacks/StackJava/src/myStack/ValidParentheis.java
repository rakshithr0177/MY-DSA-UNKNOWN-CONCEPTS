package myStack;

import java.util.Stack;

public class ValidParentheis {
    public static void main(String[] args) {
        String s = "{()}";
        boolean d = ispar(s);
        System.out.println(d);
    }
    static boolean ispar(String x) {
        Stack <Character> s = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '(' || ch=='{'|| ch == '['){
                s.push(ch);
            }
            else{
                if (!s.isEmpty()){
                    if (ch == ')' && s.peek() == '('  ||
                            ch == '}' && s.peek() == '{'  ||
                            ch == ']' && s.peek() == '['
                    ){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
