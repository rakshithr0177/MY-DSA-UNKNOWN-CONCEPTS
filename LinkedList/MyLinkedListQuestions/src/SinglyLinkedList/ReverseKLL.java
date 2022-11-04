package SinglyLinkedList;

import SinglyLinkedList.Node;

public class ReverseKLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);

        first.head = reverse(first.head,2);

        first.display();

    }
    public static Node reverse(Node node, int k) {
        if (node == null || k==1 ){
            return node ;
        }
        Node prev  = null;
        Node curr = node;
        Node fast = null ;
        int count  = 0;

        while(curr != null && count < k ){
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
            count++;
        }


        if (curr != null){
            node.next = reverse(curr ,k);
        }
        return  prev;

    }



}
