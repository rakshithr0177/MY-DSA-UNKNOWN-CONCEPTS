package SinglyLinkedList;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        SLL first = new SLL();
//        first.insertLast(4);
        first.insertLast(1);
        first.insertLast(2);
//        first.insertLast(4);
        first.display();
        System.out.println(isPalindrome(first.head));
    }

    private static Node getMiddle(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static Node reverse(Node head){
        Node prev = null ;
        Node curr = head ;
        Node next = null;

        while(curr != null){
            next =  curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next;
        }

        return prev;
    }

    public static boolean isPalindrome(Node head){
        if (head == null || head.next == null){
            return true;
        }
        Node middle = getMiddle(head);
        middle.next = reverse(middle.next);

        Node curr1 = head;
        Node curr2 = middle.next;

        while(curr2 != null){
            if (curr1.value  != curr2.value){
                return false;
            }
            curr1 = curr1.next;
            curr2 =  curr2.next;
        }


        return true;
    }
}
