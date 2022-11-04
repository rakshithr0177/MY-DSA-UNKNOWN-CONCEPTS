package myStack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(4);
        s.push(7);
        s.push(23);
        s.push(878);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return ;
        }
        int elementTop = s.pop();

        reverse(s);

        insertAtBottom(s,elementTop);

    }

    public static void insertAtBottom(Stack<Integer> s , int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int popedElement = s.pop();

        insertAtBottom(s,x);

        s.push(popedElement);

    }
}
