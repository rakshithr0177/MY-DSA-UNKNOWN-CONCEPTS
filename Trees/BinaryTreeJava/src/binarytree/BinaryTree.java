package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node left ;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = null;
        BinaryTree s = new BinaryTree();
        root = s.buildTree(root);
        s.preorder(root);
        System.out.println();
        s.postorder(root);
        System.out.println();
        s.inorder(root);
        System.out.println();
        s.levelorder(root);
        System.out.println();
        s.iterPreOrder(root);
    }


    public Node buildTree(Node root){
        int data;
        System.out.println("Enter data:");
        data = rd.nextInt();
        root =  new Node(data);
        if(data == -1){
            return null;
        }
        System.out.println("Enter the left side:");
        root.left = buildTree(root.left);
        System.out.println("Enter the right side:");
        root.right = buildTree(root.right);
        return root;
    }

    public  void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public  void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public  void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node top = q.remove();
            if(top == null){
                System.out.println();
                if (!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                System.out.print(top.data + " ");
                if(top.left != null){
                    q.add(top.left);
                }
                if(top.right != null){
                    q.add(top.right);
                }
            }
        }
    }

    public void iterPreOrder(Node root){
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node top = s.pop();
            System.out.print(top.data+" ");
            if(top.right != null){
                s.push(top.right);
            }
            if (top.left != null){
                s.push(top.left);
            }
        }
    }

}
