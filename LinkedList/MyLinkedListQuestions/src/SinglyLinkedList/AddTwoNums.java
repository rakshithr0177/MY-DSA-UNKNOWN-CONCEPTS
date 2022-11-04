package SinglyLinkedList;
//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

public class AddTwoNums {
    public static void main(String[] args) {
        SLL first = new SLL();
        first.insertLast(5);
        first.insertLast(4);
        first.insertLast(1);
        first.insertLast(0);

        SLL second = new SLL();
        second.insertLast(2);
        second.insertLast(3);
        second.insertLast(2);

        first.display();
        second.display();

        first.head = addTwoLists(first.head,second.head);

        first.display();


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
    static Node addTwoLists(Node first, Node second){
        Node rFirst = reverse(first);
        Node rSecond = reverse(second);

        //To move through the linked list
        Node curr1 = rFirst;
        Node curr2 = rSecond;

        //this is the result that is reversed later
        Node head = null;
        Node result = null;

        //Carry  and sum variables
        int carry = 0;
        int sum  = 0 ;

        while( curr1 != null || curr2 != null || carry != 0){
            int value1 = 0 ;
            if (curr1 != null){
                value1 = curr1.value;
            }
            int value2 = 0 ;
            if (curr2 != null){
                value2 = curr2.value;
            }

            //to move the sum in result
            sum = carry + value1 + value2;
            carry = sum / 10;
            int digit = sum % 10 ;

            if (curr1 != null){
                curr1 = curr1.next;
            }

            if (curr2 != null){
                curr2 = curr2.next;
            }

            result = new Node(digit);

            if (head == null) {
                head = result;
            }
            result.next = head;
        }
        return result;
    }



}
