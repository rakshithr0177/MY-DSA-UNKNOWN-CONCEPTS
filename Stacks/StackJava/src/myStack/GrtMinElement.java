package myStack;

import java.util.Stack;

public class GrtMinElement {
    public static void main(String[] args) {
        GrtMinElement g = new GrtMinElement();
        g.push(5);
        g.push(3);
        g.push(8);
        g.push(2);
        g.push(4);
        System.out.println(g.getMin());
        System.out.println(g.pop());
        System.out.println(g.getMin());
        System.out.println(g.pop());
        System.out.println(g.getMin());
    }



    int minEle;
    Stack<Integer> s = new Stack<>();;


    /*returns min element from stack*/
    int getMin()
    {
        // Your code here
        if(s.isEmpty()){
            return -1;
        }
        return minEle;
    }

    /*returns poped element from stack*/
    int pop()
    {
        // Your code here
        if(s.isEmpty()){
            return -1 ;
        }
        else{
            int curr = s.pop();

            if(curr > minEle){
                return curr;
            }
            else{
                //poping the minimum value that is if curr is mini
                int prevMin = minEle;
                int value = 2* minEle- curr;
                minEle = value;
                return prevMin;
            }

        }
    }

    /*push element x into the stack*/
    void push(int x)
    {
        // Your code here
        if(s.isEmpty()){
            s.push(x);
            minEle = x;
        }
        else{
            if(x < minEle){
                int value =  2*x - minEle;
                s.push(value);
                minEle = x;
            }
            else{
                s.push(x);
            }
        }
    }
}
