package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {
    public static void main(String[] args) {
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        System.out.println(zigZagTraversal(root));
    }
    public static ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans =  new ArrayList<>();

        boolean leftToRight = true ;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        if(root == null){
            return ans;
        }

        while(!q.isEmpty()){

            int sizeOfLevel = q.size();
            System.out.println(q.size());
            //ArrayList<Integer> temp = new ArrayList<>(sizeOfLevel);
            int temp[] = new int[sizeOfLevel];

            for (int i = 0; i < sizeOfLevel; i++) {

                Node front = q.remove();

                int index ;
                if(leftToRight){
                    index = i ;
                }else{
                    index = sizeOfLevel - i - 1 ;
                }
                //temp.add(index,front.data);
                temp[index] = front.data;

                if(front.left != null){
                    q.add(front.left);
                }
                if (front.right != null){
                    q.add(front.right);
                }
            }

            leftToRight = !leftToRight;

            for (int i: temp) {
               ans.add(i);
            }
        }
        return ans ;
    }
}
