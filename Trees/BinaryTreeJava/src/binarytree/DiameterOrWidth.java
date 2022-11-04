package binarytree;
//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

public class DiameterOrWidth {
    public static void main(String[] args) {
        Node root = null;
        Height h = new Height();
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        System.out.println(diameterFast(root,h));
    }
    //time complexity O(n^2)
    public static int diameter(Node root) {
        if(root == null){
            return 0;
        }
        int ansOfLeft = diameter(root.left);
        int ansOfRight = diameter(root.right);
        int combinationOfLeftRight = height(root.left)+1+height(root.right);
        return Math.max(combinationOfLeftRight,Math.max(ansOfRight,ansOfLeft));
    }

    private static int height(Node root) {
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }

    static class Height{
        int h;
    }

    public static int diameterFast(Node root ,Height height ){
        //To get right and left height
        Height lh = new Height(), rh = new Height();

        if(root == null){
            height.h = 0;
            return 0;
        }
        int op1 = diameterFast(root.left, lh); // ans got from the left
        int op2 = diameterFast(root.right, rh); // ans got from the right
        int op3 = lh.h + rh.h +1;

        //updating the Height
        height.h = Math.max(lh.h, rh.h) + 1;

        return Math.max(op3,Math.max(op1,op2));
    }

}
