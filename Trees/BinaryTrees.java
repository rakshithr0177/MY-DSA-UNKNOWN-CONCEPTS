import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//FOR CREATING THE NODE 
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTrees {
    static Scanner read = new Scanner(System.in);

    // THIS METHOD CREATES THE BINARY TREE
    public static Node createTree() {
        Node root = null;
        System.out.println("Enter the data:");
        int d = read.nextInt();
        if (d == -1) {
            return null;
        }
        root = new Node(d);

        // FOR LEFT SUB TREE
        System.out.println("Enter the data for left of " + d);
        root.left = createTree();

        // FOR RIGHT SUB TREE
        System.out.println("Enter the data for right of " + d);
        root.right = createTree();

        return root;
    }

    public static int ind=-1;

    public static Node BuiltTree(int arr[]) {
        ind++;
        if (arr[ind]==-1) {
            return null;
        }
        Node newNode = new Node(arr[ind]);
        newNode.left = BuiltTree(arr);
        newNode.right = BuiltTree(arr);
        return newNode;
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        //A QUEUE OF LINKED LIST
        Queue<Node> q = new LinkedList<>();

        //INITIALING THE QUEUE WITH ROOT AND NULL
        q.add(root);
        q.add(null);

        //IF THE QUEUE IS SET NULL NEXT LINE
        while (!q.isEmpty()) {

            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

    public static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return SumOfNodes(root.left) + SumOfNodes(root.right) + root.data;
    }

    public static int height(Node newNode) {
        if (newNode == null) {
            return 0;
        }
        int leftHeight = height(newNode.left);
        int rightHeight = height(newNode.right);
        int realHeight = Math.max(leftHeight, rightHeight) + 1;
        return realHeight;
    }
    
    //DIAMETER IS THE NUMBER OF NODES THAT CAN FORM MAX HEIGHT
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diaLeft = diameter(root.left);
        int diaRight = diameter(root.right);
        int diaRoot = height(root.left) + height(root.right) + 1;
        return Math.max(diaRoot, Math.max(diaLeft, diaRight));
    }
    
    static class TreeInfo {
        int ht;
        int dia;

        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht ) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int myDiameter = Math.max(Math.max(dia1, dia2), dia3);
        
        TreeInfo myTreeInfo = new TreeInfo(myHeight,myDiameter);
        return myTreeInfo;
    }

    public static void main(String[] args) {
        //Node root = createTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BuiltTree(arr);
        System.out.println("Preorder tree");
        preorder(root);
        System.out.println();
        System.out.println("Inorder tree");
        inorder(root);
        System.out.println();
        System.out.println("Postorder tree");
        postorder(root);
        System.out.println();
        System.out.println("Level order");
        levelorder(root);
        System.out.println();
        System.out.println("No of nodes in tree is " + count(root));
        System.out.println("Sum of naodes in tree is " + SumOfNodes(root));
        System.out.println("Height is " + height(root));
        System.out.println("Diameter is " + diameter(root));
        System.out.println("diameter is "+diameter2(root).dia);
    }

}
