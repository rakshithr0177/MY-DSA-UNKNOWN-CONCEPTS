package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthInTree {
    static class Pair{
        Node node ;
        int index ;
        Pair(Node node , int index){
           this.node =  node ;
           this.index = index;
        }
        Pair(){
            this.node = null;
            this.index = 0;
        }
    }
    public static int maxWidth(Node root){
        if(root == null){
            return 0;
        }
        int ans = 0 ;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root , 0));

        int firstIndex = 0 ,lastIndex = 0;

        while(!q.isEmpty()){
            int min = q.peek().index;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                assert q.peek() != null;
                Node curr = q.peek().node;
                int curr_id = q.peek().index - min ;
                q.remove();

                if(i == 0){
                    firstIndex = curr_id;
                }else if(i == size-1){
                    lastIndex = curr_id;
                }

                if (curr.left != null){
                    q.add(new Pair(curr.left,curr_id*2+1));
                }
                if (curr.right != null){
                    q.add(new Pair(curr.right,curr_id*2+2));
                }

                ans = Math.max(ans, (lastIndex-firstIndex+1));

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        int ans  = maxWidth(root);
        System.out.println(ans);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }
}
