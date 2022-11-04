package SinglyLinkedList;
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public class SLL {
     Node head;
     Node tail;

     int size;

    public SLL() {
        this.size = 0;
    }




    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("End");
    }
}
