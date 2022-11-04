package binarytree;

import java.util.*;

public class BottomView {
    public static void main(String[] args) {
        Node root = null;
        DiameterOrWidth.Height h = new DiameterOrWidth.Height();
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        ArrayList<Integer> ans  = bottomView(root);
        System.out.println(ans);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }
    static class Pair{
        Node node;
        int hd;
        Pair(Node node , int hd){
            this.node = node ;
            this.hd = hd;
        }
    }
    public static ArrayList<Integer> bottomView(Node root){
        Map<Integer,Integer > map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans ;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair temp = q.remove();
            Node front = temp.node;
            int hd = temp.hd;
            map.put(hd,front.data);

            if(front.left != null ){
                q.add(new Pair(front.left,hd-1));
            }
            if(front.right != null ){
                q.add(new Pair(front.right,hd+1));
            }
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            ans.add(i.getValue());
        }
        return ans ;
    }
}
