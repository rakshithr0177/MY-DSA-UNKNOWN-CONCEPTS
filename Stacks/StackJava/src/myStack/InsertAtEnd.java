package myStack;

import java.util.Stack;

public class InsertAtEnd {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s);
        System.out.println(pushAtBottom(s,9));
    }
    public static void pushBottom(Stack<Integer> myStack, int x) {
        if(myStack.isEmpty()){
            myStack.push(x);
            return;
        }
        int elementPoped = myStack.pop();
        pushBottom(myStack,x);
        myStack.push(elementPoped);
    }
    public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x)
    {
        pushBottom(myStack,x);
        return myStack;
    }
}
