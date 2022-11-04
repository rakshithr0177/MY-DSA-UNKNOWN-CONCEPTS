package myStack;

import java.util.ArrayList;

import java.util.Stack;

public class LargestRectangularAreaHistogram {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(6);
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(5);
        a.add(1);
        a.add(6);
        ArrayList<Integer> ans = leftSmaller(a);
        System.out.println(ans);
        ArrayList<Integer> an = rightSmaller(a);
        an = reverse(an);
        System.out.println(an);
        System.out.println(largestArea(a));
    }
    public static ArrayList<Integer> leftSmaller(ArrayList<Integer> a){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        for(int i = 0 ; i < a.size() ;i++){
            int curr = a.get(i);
            while(s.peek() != -1 && a.get(s.peek()) >= curr){
                s.pop();
            }
            ans.add(s.peek()+1);
            s.push(i);
        }
        return ans ;
    }
    public static ArrayList<Integer> rightSmaller(ArrayList<Integer> a){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(a.size());

        for(int i = a.size()-1 ; i >= 0 ;i--){
            int curr = a.get(i);
            while(s.peek() != a.size() && a.get(s.peek()) >= curr){
                s.pop();
            }
            ans.add(s.peek()-1);
            s.push(i);
        }
        return ans ;
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> a){
        int l = 0;
        int h = a.size()-1;
        while(l<=h){
            int temp = a.get(l);
            a.set(l,a.get(h));
            a.set(h,temp);
            l++;
            h--;
        }
        return a;
    }

    public static int largestArea(ArrayList<Integer> a){
        ArrayList<Integer> leftBound = leftSmaller(a);
        ArrayList<Integer> rightBound = rightSmaller(a);
        rightBound = reverse(rightBound);
        int area = 0;

        for (int i = 0; i < a.size(); i++) {
            int newArea = (rightBound.get(i)-leftBound.get(i)+1) * a.get(i);
            area = Math.max(area,newArea);
        }
        return area;
    }
}
