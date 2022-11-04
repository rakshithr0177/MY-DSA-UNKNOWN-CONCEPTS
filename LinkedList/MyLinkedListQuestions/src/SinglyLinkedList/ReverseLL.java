package SinglyLinkedList;
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
import SinglyLinkedList.Node;

public class ReverseLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(3);
        first.insertLast(5);
        first.insertLast(7);
        first.insertLast(9);


        first.head = reverseList(first.head);
        first.display();

        first.head = reverseListRec(first.head);
        first.display();



    }
    public static Node reverseList(Node head){

        if (head == null || head.next == null){
            return  head;
        }

        Node prev = null;
        Node curr = head ;
        Node forward;


        while (curr != null){
            forward = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = forward;
        }
        return prev;
    }



    public static Node reverseListRec(Node head){
        if (head.next == null){
            return  head;
        }
        Node newHead = reverseListRec(head.next);
        head.next.next =  head;
        head.next = null;
        return newHead;
    }

}
