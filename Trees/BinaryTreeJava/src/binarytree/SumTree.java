package binarytree;

public class SumTree {
    public static void main(String[] args) {
        Node root = null;
        Sum m = new Sum();
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        System.out.println(isSumTreeFast(root , m));
    }
    static class Sum{
        int s;
    }
    public static boolean isSumTreeFast(Node root, Sum sum)
    {
        if(root == null){
            sum.s = 0 ;
            return true;
        }

        if(root.left == null && root.right == null){
            sum.s = root.data;
            return true;
        }

        Sum ls = new Sum();
        Sum rs = new Sum();

        boolean leftAns = isSumTreeFast(root.left , ls );
        boolean rightAns = isSumTreeFast(root.right , rs );
        boolean check = root.data == (ls.s + rs.s) ;

        boolean ans ;
        if(leftAns && rightAns && check){
            sum.s = 2*root.data;
            ans = true;
        }
        else{
            ans = false;
        }

        return ans;
    }
}
