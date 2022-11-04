package binarytree;

import java.util.ArrayList;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        Node ans  = lca(root , 4 , 5);
        System.out.println(ans.data);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }
    public static Node lca(Node root, int n1,int n2) {
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node left = lca(root.left , n1 , n2);
        Node right =  lca(root.right , n1 , n2);
        if(left == null){
            return right;
        }
        else if(right == null){
            return left ;
        }
        else{
            return root ;
        }
    }
}
