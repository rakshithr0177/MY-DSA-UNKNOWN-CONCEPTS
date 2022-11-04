package binarytree;

public class IdenticalTree {
    public static void main(String[] args) {

    }
    public static boolean isIdentical(Node root1, Node root2)
    {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null && root2 != null){
            return false;
        }
        if(root1 != null && root2 == null){
            return false;
        }
        boolean leftAns = isIdentical(root1.left , root2. left);
        boolean rightAns = isIdentical(root1.right , root2.right);
        boolean  check = root1.data == root2.data;

        boolean ans = leftAns && rightAns && check ;

        return ans;
    }
}
