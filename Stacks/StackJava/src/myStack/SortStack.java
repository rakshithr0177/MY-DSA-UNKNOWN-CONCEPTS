package myStack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(4);
        s.push(7);
        s.push(23);
        System.out.println(s);

        Stack<Integer> d = sort(s);

        System.out.println(d);
    }
    public static Stack<Integer> sort(Stack<Integer> s)
    {
        sortSolve(s);
        return s;
    }

    public static void sortSolve(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int popedElement = s.pop();
        sortSolve(s);
        sortedInsert(s,popedElement);
    }

    public static void sortedInsert(Stack<Integer> s , int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int topElement = s.peek();
        if(topElement < x){
            s.push(x);
            return;
        }
        int poped = s.pop();
        sortedInsert(s,x);
        s.push(poped);

    }
}
