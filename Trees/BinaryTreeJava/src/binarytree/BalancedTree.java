package binarytree;

public class BalancedTree {

    static class Height{
        int h;
    }

    public static boolean isBalanced(Node root, Height height){
        if(root == null){
            height.h = 0 ;
            return true;
        }
        Height lh = new Height();
        Height rh = new Height();

        //For condition 1
        boolean leftAns = isBalanced(root.left,lh);

        //For condition 2
        boolean rightAns = isBalanced(root.right,rh);

        //For condition 3
        height.h = Math.max(lh.h,rh.h)+1;


        return (Math.abs(lh.h-rh.h)<= 1) && leftAns && rightAns;

    }

    public static void main(String[] args) {
        Node root = null;
        BalancedTree.Height h = new BalancedTree.Height();
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        System.out.println(isBalanced(root,h));
    }


}
