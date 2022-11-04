package binarytree;

import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        Node root = null;
        DiameterOrWidth.Height h = new DiameterOrWidth.Height();
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        ArrayList<Integer> ans  = verticalOrder(root);
        System.out.println(ans);
    }
    
    static class NodeHD{
        Node node ;
        int hd ;
        
        NodeHD(Node node , int hd){
            this.node = node ;
            this.hd = hd ;
        }
        NodeHD(){
            this.node = null ;
            this.hd = 0 ;
        }
    }
    
    public static ArrayList<Integer> verticalOrder(Node root) {
        Map<Integer,ArrayList<Integer>> nodes =  new TreeMap<>();
        ArrayList<Integer> ans =  new ArrayList<>();
        if(root == null){
            return ans ;
        }
        Queue<NodeHD> q = new LinkedList<>();
        NodeHD first = new NodeHD(root,0);
        q.add(first);

        int min = 0 ;
        int max = 0;
        
        while(!q.isEmpty()){
            NodeHD temp = q.remove() ;
            int hd = temp.hd;
            Node fNode = temp.node;
            nodes.putIfAbsent(hd,new ArrayList<>());
            nodes.get(hd).add(fNode.data);
            if(fNode.left != null){
                q.add(new NodeHD(fNode.left , hd-1));
                min = min - 1;
            }
            if(fNode.right != null){
                q.add(new NodeHD(fNode.right , hd+1));
                max =  max + 1;
            }
        }
//        for (int i = min+1; i < max ;i++){
//            ans.addAll(nodes.get(i));
//        }

        for (Map.Entry<Integer, ArrayList<Integer>> i : nodes.entrySet()) {
            ArrayList<Integer> a = i.getValue();
            ans.addAll(a);
        }

        return ans ;
    }
}
