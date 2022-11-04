package binarytree;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static void main(String[] args) {
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        System.out.println(boundaryTraversal(root));
    }
    public static ArrayList<Integer> boundaryTraversal(Node root){
        ArrayList<Integer> ans =  new ArrayList<>();
        if(root == null){
            return ans ;
        }
        ans.add(root.data);
        traverseLeft(root.left,ans);
        traverseLeaf(root,ans);
        traverseRight(root.right, ans) ;
        return ans ;
    }

    private static void traverseRight(Node root, ArrayList<Integer> ans) {
        if(root == null || root.left == null && root.right == null){
            return ;
        }
        if (root.right != null){
            traverseRight(root.right, ans);
        }
        if(root.left != null){
            traverseRight(root.left,ans);
        }
        ans.add(root.data);
    }

    private static void traverseLeaf(Node root, ArrayList<Integer> ans) {
        if (root == null){
            return ;
        }
        if(root.left == null  && root.right ==  null){
            ans.add(root.data);
        }
        if (root.left != null){
            traverseLeaf(root.left,ans);
        }
        if(root.right != null){
            traverseLeaf(root.right,ans);
        }
    }

    private static void traverseLeft(Node root, ArrayList<Integer> ans) {
        if(root == null || root.left == null && root.right == null){
            return ;
        }
        ans.add(root.data);
        if (root.left != null){
            traverseLeft(root.left, ans);
        }
        if(root.right != null){
            traverseLeft(root.right,ans);
        }
    }
}
