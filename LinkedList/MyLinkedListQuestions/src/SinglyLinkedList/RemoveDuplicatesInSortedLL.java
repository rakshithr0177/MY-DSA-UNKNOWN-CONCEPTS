package SinglyLinkedList;
import SinglyLinkedList.Node;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicatesInSortedLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(3);

        first.display();

        first.head = uniqueSortedList(first.head);
        first.display();
    }
    public static Node uniqueSortedList(Node head) {
        if(head == null){
            return null;
        }
        Node curr = head;
        while(curr.next != null){
            if (curr.value == curr.next.value){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}
