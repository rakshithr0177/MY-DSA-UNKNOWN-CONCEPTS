package binarytree;

import java.util.ArrayList;

public class LeftView {
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        ArrayList<Integer> ans  = leftView(root);
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

        solve(root.left , ans , level + 1);
        solve(root.right , ans , level+1);
    }

    public static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans  = new ArrayList<>();
        solve(root,ans,0);
        return ans ;
    }
}
