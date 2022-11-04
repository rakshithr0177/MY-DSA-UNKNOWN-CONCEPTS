package binarytree;

import java.util.ArrayList;

public class RootToLeaf {
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        ArrayList<ArrayList<Integer>> ans  = paths(root);
        System.out.println(ans);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }
    public static ArrayList<ArrayList<Integer>> paths(Node root){
        ArrayList<Integer> curr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(root , curr , ans);
        return ans;
    }

    private static void solve(Node root, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans) {
        if(root == null){
            return ;
        }
        curr.add(root.data);
        if(root.left == null && root.right == null){
            ans.add(curr);
        }
        solve(root.left , curr , ans);
        solve(root.right, curr ,ans);
    }
}
