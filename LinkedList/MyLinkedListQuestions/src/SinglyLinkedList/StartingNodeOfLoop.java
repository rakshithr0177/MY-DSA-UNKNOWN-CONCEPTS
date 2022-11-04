package SinglyLinkedList;

import SinglyLinkedList.Node;

public class StartingNodeOfLoop {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);
        first.tail.next = first.head.next.next;

        Node ans = firstNode(first.head);
        System.out.println(ans.value);
    }
    public static Node firstNode(Node head) {
        if (head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null){
            fast = fast.next;

            if (fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            if (slow == fast){
                break;
            }
        }

        if (fast == null){
            return null;
        }

        slow = head;

        while(slow != fast){
            slow =slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
