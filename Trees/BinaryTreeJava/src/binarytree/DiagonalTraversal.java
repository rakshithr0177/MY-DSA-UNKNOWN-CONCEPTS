package binarytree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        ArrayList<Integer> ans  = diagonalTraversal(root);
        System.out.println(ans);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }

    public static ArrayList<Integer> diagonalTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer , ArrayList<Integer>> map = new TreeMap<>();
        solve(root , map , 0);
        for (Map.Entry<Integer,ArrayList<Integer>> i: map.entrySet()) {
            ans.addAll(i.getValue());
        }
        return ans;
     }

    private static void solve(Node root, Map<Integer, ArrayList<Integer>> map, int hd) {
        if(root == null){
            return ;
        }
        map.putIfAbsent(hd , new ArrayList<>());
        map.get(hd).add(root.data);
        solve(root.left , map , hd+1);
        solve(root.right , map , hd);
    }

}
