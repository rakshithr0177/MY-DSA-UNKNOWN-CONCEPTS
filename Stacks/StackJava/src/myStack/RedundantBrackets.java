package myStack;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        String s = "((a+b))";
        System.out.println(checkRedundancy(s));

    }
    public static int checkRedundancy(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s. length() ; i++){
            char ch  =  s.charAt(i);
            if(ch =='(' || ch =='+' || ch =='-' || ch =='*' || ch =='/'){
                stack.push(ch);
            }
            else{
                if(ch == ')'){
                    int isRedundent = 1 ;
                    while(stack.peek() != '('){
                        if( stack.peek() =='+' || stack.peek() =='-' || stack.peek() =='*' || stack.peek() =='/'){
                            isRedundent = 0;
                        }
                        stack.pop();
                    }
                    if(isRedundent == 1){
                        return 1;
                    }
                    stack.pop();
                }
            }
        }
        return 0;
    }
}
