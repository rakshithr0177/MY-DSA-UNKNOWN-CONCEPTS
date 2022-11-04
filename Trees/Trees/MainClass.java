package Trees;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    public Node(){}
        

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {

    Scanner read = new Scanner(System.in);

    public Node createNode1() {

        System.out.println("Enter the data for Node: ");
        int data = read.nextInt();
        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        //left node 
        System.out.println("Enter the data for left node of " + data);
        root.left = createNode1();

        // right node
        System.out.println("Enter the data for right node of " + data);
        root.right = createNode1();

        return root;
    }

    public static int i = -1;

    public Node BuiltTree(int arr[]) {

        i++;

        if (arr[i] == -1) {
            return null;
        }

        Node newNode = new Node(arr[i]); //Node creation
        newNode.left = BuiltTree(arr); //left
        newNode.right = BuiltTree(arr); //Right

        return newNode;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void inorder1(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder1(root.left, list);
        list.add(root.data);
        inorder1(root.right, list);
    }

    public boolean isSameTree(Node p, Node q) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        inorder1(p, list1);
        inorder1(q, list2);
        if (list1 == list2) {
            return true;
        }
        return false;
    }

    public ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<Node>();
        if (root == null) {
            return ans;
        }
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            ans.add(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return ans;
    }

    public List<List<Integer>> zigzag(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<Integer>();
        Stack<Node> mainStack = new Stack<Node>();
        Stack<Node> childStack = new Stack<Node>();

        if (root == null) {
            return result;
        }
        mainStack.push(root);

        boolean leftToRight = true;

        while (!mainStack.isEmpty()) {
            Node temp = mainStack.pop();
            ans.add(temp.data);
            if (leftToRight) {
                if (temp.left != null) {
                    childStack.push(temp.left);
                }
                if (temp.right != null) {
                    childStack.push(temp.right);
                }
            } else {
                if (temp.right != null) {
                    childStack.push(temp.right);
                }
                if (temp.left != null) {
                    childStack.push(temp.left);
                }
            }
            if (mainStack.size() == 0) {
                result.add(ans);
                mainStack = childStack;
                childStack = new Stack<>();
                ans = new ArrayList<Integer>();
                leftToRight = !leftToRight;

            }
        }

        return result;
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int ans = Math.max(left, right) + 1;
        return ans;
    }

    //Brude force techinque
    public int diameter(Node root) {
        if (root == null)
            return 0;
        int diaLeft = diameter(root.left);
        int diaRight = diameter(root.right);
        int comboLeftRight = height(root.left) + 1 + height(root.right);
        int ans = Math.max(Math.max(diaLeft, diaRight), comboLeftRight);
        return ans;
    }

    public void traverseLeft(Node root, ArrayList<Integer> ans) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        //if condition fails add the data 
        ans.add(root.data);

        //traverse to left part
        traverseLeft(root.left, ans);

        //if left of the root node is null then move to rigbht part 
        if (root.left == null)
            traverseLeft(root.right, ans);
    }

    public void traverseLeaf(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        traverseLeaf(root.left, ans);
        if (root.left == null && root.right == null) {
            ans.add(root.data);
        }
        traverseLeaf(root.right, ans);
    }

    public void traverseRight(Node root, ArrayList<Integer> ans) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        //traverse to the right most node
        traverseRight(root.right, ans);

        //if right part is null then traverse right of it
        if (root.right == null) {
            traverseRight(root.left, ans);
        }

        //add the data while returning so it feels to be in the reverse order
        ans.add(root.data);
    }

    public ArrayList<Integer> BoundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // 1.Root should be printed first
        ans.add(root.data);

        // 2.left boundary should be printed excluding leaf nodes
        traverseLeft(root.left, ans);

        //3.Leaf nodes are printed using the inorder traversal
        //left leaf nodes
        traverseLeaf(root.left, ans);
        //Right leaf nodes
        traverseLeaf(root.right, ans);

        //4.left boundary should be printed excluding leaf nodes in reverse
        traverseRight(root.right, ans);

        return ans;
    }

    public ArrayList<Integer> verticalTraversal(Node root) {
        Queue<Pair<Node, Pair<Integer, Integer>>> q = new LinkedList<Pair<Node, Pair<Integer, Integer>>>();
        HashMap<Integer, Map<Integer, ArrayList<Integer>>> nodes = new HashMap<Integer, Map<Integer, ArrayList<Integer>>>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if (root == null) {
            return ans;
        }
        return ans;
    }

}

class Pair<T, I> {
    T first;
    I second;

    Pair(T first, I second) {
        this.first = first;
        this.second = second;
    }
}


public class MainClass {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        
        Tree one = new Tree();
        
        Node root = one.BuiltTree(arr);

        System.out.println("Inorder:");
        one.inorder(root);

        System.out.println("\nPreorder:");
        one.preorder(root);

        System.out.println("\nPostorder:");
        one.postorder(root);

        // List<List<Integer>> q=new ArrayList<List<Integer>>();
        // System.out.println("\nLevel order");
        // q = one.levelOrder(root);
        // System.out.println(q);

        // System.out.println("\nDiameter :" + one.diameter(root));
        
        // System.out.println("\nzigzag order");
        // q = one.zigzag(root);
        // System.out.println(q);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a = one.BoundaryTraversal(root);
        System.out.println(a);
        
       

    }

}
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

// Example 1:


// Input: p = [1,2,3], q = [1,2,3]
// Output: true


// solution 
// class Solution {

//     public void inorder(TreeNode root, ArrayList<Integer> list) {
//         if (root == null) {
//             list.add(-123);
//             return;
//         }
//         inorder(root.left, list);
//         list.add(root.val);
//         inorder(root.right, list);
//     }

//     public void preorder(TreeNode root, ArrayList<Integer> list) {
//         if (root == null) {
//             list.add(-123);
//             return;
//         }
//         list.add(root.val);
//         preorder(root.left, list);

//         preorder(root.right, list);
//     }

//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         ArrayList<Integer> list2 = new ArrayList<Integer>();
//         inorder(p, list1);
//         inorder(q, list2);
//         if (list1.equals(list2)) {
//             list1 = list2 = null;
//             list1 = new ArrayList<Integer>();
//             list2 = new ArrayList<Integer>();
//             preorder(p, list1);
//             preorder(q, list2);
//             if (list1.equals(list2)) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//         return false;
//     }
// }

//Children Sum Parent

// public static int isSumProperty(Node root)
//     {
//        if(root==null || root.left==null && root.right==null){
//            return 1;
//        }
//        int leftSum=0;
//        int rightSum=0;
       
//        if(root.left!=null){
//            leftSum=root.left.data;
//        }
//        if(root.right!=null){
//            rightSum=root.right.data;
//        }
//        if(root.data==leftSum+rightSum && isSumProperty(root.left)==1 &&isSumProperty(root.right)==1){
//            return 1;
//        }
//        return 0;
       
        
//     }