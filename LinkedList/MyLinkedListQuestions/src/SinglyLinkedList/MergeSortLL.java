package SinglyLinkedList;

public class MergeSortLL {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(25);
        first.insertLast(10);
        first.insertLast(15);
        first.insertLast(40);
        first.display();
        first.head = mergeSort(first.head);
        first.display();
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node mid = getMid(head);
        Node leftPart = head;
        Node rightPart = mid.next;
        mid.next = null;

        leftPart = mergeSort(leftPart) ;
        rightPart = mergeSort(rightPart);

        return merge(leftPart,rightPart);

    }

    private static Node merge(Node head1,Node head2){
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

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
        }
        return slow;
    }
}
