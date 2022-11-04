package SinglyLinkedList;
//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

public class SortZOT {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(1);
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(2);
        first.insertLast(1);

        first.display();

        first.head = sortList2(first.head);

        first.display();

    }
    public static Node sortList(Node head) {

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        Node curr = head;

        while (curr != null) {
            if (curr.value == 0) {
                zeroCount++;
            } else if (curr.value == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {
            if (zeroCount != 0) {
                curr.value = 0;
                zeroCount--;
            } else if (oneCount != 0) {
                curr.value = 1;
                oneCount--;
            } else if (twoCount != 0) {
                curr.value = 2;
                twoCount--;
            }
            curr = curr.next;
        }
        return head;
    }
    public static Node sortList2(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node zeroHeadNode = new Node(-1);
        Node zeroTailNode = zeroHeadNode;

        Node oneHeadNode = new Node(-1);
        Node oneTailNode = oneHeadNode;

        Node twoHeadNode = new Node(-1);
        Node twoTailNode = twoHeadNode;

        Node curr = head ;

        while (curr != null ){

            int value = curr.value;

            if (value == 0) {

                zeroTailNode.next = curr;

                curr = curr.next;

                zeroTailNode =  zeroTailNode.next;

            } else if (value == 1) {
                oneTailNode.next = curr;

                curr = curr.next;

                oneTailNode =  oneTailNode.next;

            } else if( value == 2){
                twoTailNode.next = curr;

                curr = curr.next;

                twoTailNode =  twoTailNode.next;

            }

        }


        if (oneHeadNode.next != null){
            zeroTailNode.next = oneHeadNode.next;
        }else{
            zeroTailNode.next = twoHeadNode.next;
        }

        oneTailNode.next = twoHeadNode.next ;
        twoTailNode.next=null;


        head = zeroHeadNode.next;

        return head;
    }

}
