package CircularLL;
class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n=node.next;
            if(n.val==val) {
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
        
    }

    public void display() {
        Node curr = head;
        do{
            System.out.print(curr.val + "->");
            curr = curr.next;
        } while (curr != head);
        System.out.println("End");
    }
    
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
public class CLLKonal {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.delete(20);
        list.display();
    
    }
}
