package binarytree;

public class HeigthOfBinnaryTree {
    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        System.out.println(height(root));
    }
    public static int height(Node node){
        if(node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return  Math.max(left,right)+1;
    }
}
