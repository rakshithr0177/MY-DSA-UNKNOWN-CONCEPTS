package SinglyLinkedList;

import SinglyLinkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class DetectLoopInLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);
        first.tail.next = first.head;


        System.out.println(detectLoop1(first.head));
    }

    //Approach1: Brute force
    public static  boolean detectLoop1(Node head){
        if(head == null){
            return true ;
        }
        Map<Node, Boolean> visited = new HashMap<>();
        Node curr = head ;
        while(curr != null){
            visited.putIfAbsent(curr,false);
            if (visited.get(curr)){
                return true;
            }
            visited.put(curr,true);
            curr = curr.next;
        }
        return false;
    }


    public static boolean detectLoop2(Node head){
        if (head == null){
            return true;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null){
            fast = fast.next;
            if (fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            if(fast == slow){
                return true;
            }

        }

        return false;
    }
}
