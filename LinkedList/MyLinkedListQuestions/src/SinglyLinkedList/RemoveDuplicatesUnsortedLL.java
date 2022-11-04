package SinglyLinkedList;
import SinglyLinkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesUnsortedLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(4);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(2);
        first.insertLast(1);
        first.display();

        first.head = removeDuplicates(first.head);

        first.display();
    }
    public static Node removeDuplicates(Node head){
        if (head == null){
            return null;
        }
        Node curr = head;
        Node prev = null;
        Map<Integer,Boolean> visited = new HashMap<>();

        while(curr != null){
            visited.putIfAbsent(curr.value,false);
            if (visited.get(curr.value)){
                assert prev != null;
                Node afterRemove = curr.next;
                curr = curr.next;
                prev.next = afterRemove;
            }
            else{
                visited.put(curr.value,true);
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
