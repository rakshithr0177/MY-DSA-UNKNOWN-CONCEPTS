package SinglyLinkedList;

public class MergeSortedLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(5);
        first.insertLast(10);
        first.insertLast(15);
        first.insertLast(40);

        SLL second = new SLL();
        second.insertLast(2);
        second.insertLast(3);
        second.insertLast(20);
//        second.insertLast(8);

        first.display();
        second.display();

        first.head = merge(first.head, second.head);

        first.display();
    }
    public static Node merge(Node head1,Node head2){
        if (head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }

        Node curr1 = head1;
        Node curr2 = head2;

        Node prev1 = null;

        while(curr1 != null && curr2 != null){
            if(curr1.value <= curr2.value){
                prev1 = curr1;
                curr1 = curr1.next;
            }
            else {
                Node newNode = curr2;
                curr2 = curr2.next;
                if (prev1 != null){
                    prev1.next = newNode ;
                }else{
                    head1 = newNode;
                }
                newNode.next  = curr1;
                prev1 = newNode;
            }
        }

        if(curr1 == null){
            prev1.next = curr2;
        }

        return  head1;
    }
}
