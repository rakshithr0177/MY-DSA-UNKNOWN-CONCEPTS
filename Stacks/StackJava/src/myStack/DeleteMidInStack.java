package myStack;

import java.util.Stack;

public class DeleteMidInStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        deleteMid(s,3);
        System.out.println(s);

    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        int count = 0;
        solve(s,sizeOfStack,count);
    }

    private static void solve(Stack<Integer> s, int sizeOfStack, int count) {
        if (count == sizeOfStack/2 ){
            s.pop();
            return;
        }
        int popedElement = s.pop();

        solve(s,sizeOfStack,count+1);

        s.push(popedElement);

    }
}
