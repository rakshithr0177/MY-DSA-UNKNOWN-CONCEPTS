package DoublyLL;

class DoublyLL {

    private Node head = null;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node curr = head;
        Node last = null;
        System.out.print("Start");
        while (curr != null) {
            System.out.print("<-" + curr.val + "->");
            last = curr;
            curr = curr.next;
        }
        System.out.println("End");

        System.out.print("End");
        while (last != null) {
            System.out.print("<-" + last.val + "->");
            last=last.prev;
        }
        System.out.println("Start");
    }
    
    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        node.prev = curr;
        curr.next = node;

    }

    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

public class DLLKonal {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();
        list.insertLast(60);
        list.display();
        
    }
}

