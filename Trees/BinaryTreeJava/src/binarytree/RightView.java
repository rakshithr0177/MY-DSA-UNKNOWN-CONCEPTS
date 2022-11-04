package binarytree;

import java.util.ArrayList;

public class RightView {
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        ArrayList<Integer> ans  = rightView(root);
        System.out.println(ans);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }
    private static void solve(Node root , ArrayList<Integer> ans , int level){
        if(root == null){
            return;
        }

        if(level == ans.size()){
            ans.add(root.data);
        }

        solve(root.right , ans , level + 1);
        solve(root.left , ans , level+1);
    }

    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans  = new ArrayList<>();
        solve(root,ans,0);
        return ans ;
    }
}
