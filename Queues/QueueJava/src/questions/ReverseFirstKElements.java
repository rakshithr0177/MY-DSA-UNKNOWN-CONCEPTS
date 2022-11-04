package questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        a = modifyQueue(a,3);
        System.out.println(a);
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> s = new Stack<>();

        int i = 0 ;
        while(i < k){
            int ele  = q.remove();
            s.push(ele);
            i++;
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        i = 0;
        while(i < q.size() - k){
            int ele = q.remove();
            q.add(ele);
            i++;
        }
        return q ;
    }
}
