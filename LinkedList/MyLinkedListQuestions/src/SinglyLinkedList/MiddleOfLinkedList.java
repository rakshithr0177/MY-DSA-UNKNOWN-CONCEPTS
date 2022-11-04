package SinglyLinkedList;

import SinglyLinkedList.Node;
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(3);
        first.insertLast(5);
        first.insertLast(7);
        first.insertLast(9);
        //first.insertLast(12);

        System.out.println(getMiddle2(first.head));
    }
    public static int getLength(Node head){
        int count = 0 ;
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    static int getMiddle(Node head) {
        int length = getLength(head);
        int count  = 1;
        Node curr = head ;

        while(count < (length/2)+1){
            curr = curr.next;
            count++;
        }
        return curr.value;
    }

    static int getMiddle2(Node head) {
        if ( head.next == null){
            return head.value;
        }
        if ( head.next.next == null){
            return head.next.value;
        }
        Node slow = head;
        Node fast = head.next;

        while(fast != null){
            fast = fast.next;
            if (fast != null){
                fast = fast.next;
            }
            slow = slow.next;
        }

        return slow.value;
    }


}
