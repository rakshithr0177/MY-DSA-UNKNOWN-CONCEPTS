package SinglyLinkedList;
import SinglyLinkedList.Node;

public class RemoveLoop {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);
//        first.tail.next = first.head;

        removeLoop(first.head);
        first.display();
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


    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
       if (head == null){
           return;
       }
       Node first = firstNode(head);
        if(first == null){
            return ;
        }
       Node curr = first;
       while(curr.next != first){
           curr=curr.next;
       }
       curr.next = null;
    }
}
