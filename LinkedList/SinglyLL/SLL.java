package SinglyLL;

import java.util.List;
import java.util.ArrayList;

// Node class is created 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//class for singly linked list
public class SLL {

    // static head node 
    static Node head;

    // Function to add an element at first
    public static void insertAtFirst(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public static void insertAtLast(int data) {
        if (head == null) {
            insertAtFirst(data);
            return;
        }
        Node new_node = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
    }
    
    // Used to insert at particular position
    public static void insertAtPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Position cannot be less than one");
            return;
        }
        if (head == null) {
            if (pos != 1) {
                System.out.println("Empty list position should be 1");
                return;
            }
            insertAtFirst(data);
            return;
        }

        if (pos == 1) {
            insertAtFirst(data);
            return;
        }
        Node new_node = new Node(data);
        int i = 1;
        Node curr = head;
        while (i < pos - 1) {
            curr = curr.next;
            i++;
        }
        new_node.next = curr.next;
        curr.next = new_node;
    }
    

    //insertion at last using recursion
    public static void insertLastRec(Node curr, int data) {

        if (head == null) {
            Node new_node = new Node(data);
            head = new_node;
            return;
        }
        if (curr.next == null) {
            Node new_node = new Node(data);
            curr.next = new_node;
            return;
        }
        insertLastRec(curr.next, data);

    }

    //Insert at position using recursion
    public static void insertPosRec(int data, int pos,int i,Node curr) {
        if (i == pos - 1) {
            Node new_node = new Node(data);
            new_node.next = curr.next;
            curr.next = new_node;
            return ;
        }
        if (pos < 1) {
            System.out.println("Position cannot be negative");
            return;
        }
        if (head == null) {
            if (pos == 1) {
                insertAtFirst(data);
                return;
            }
            else {
                System.out.println("no element");
                return;
            }
        }
        if (pos == 1) {
            insertAtFirst(data);
            return;
        }
        insertPosRec(data, pos, i+1,curr.next);
    } 
    
    //Remove element in the first
    public static void removeAtFirst() {
        if (head == null) {
            System.out.println("No element present in list to delete");
            return;
        }
        head = head.next;
    }
    //Remove element in the last
    public static void removeAtLast() {
        if (head == null) {
            System.out.println("No element present in list to delete");
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    } 
    //Remove element in first using recurrsion
    public static void removeLastRec(Node curr) {
        if (curr.next.next == null) {
            curr.next = null;
            return;
        }
        removeLastRec(curr.next);
    }

    //Remove an element at given position 
    public static void removeAtPosition(int pos) {
        if (pos < 0) {
            System.out.println("Position can not be negative");
            return;
        }
        if (head == null) {
            System.out.println("No element present in list to delete");
            return;
        }
        if (pos == 1) {
            removeAtFirst();
        }
        Node curr = head;
        int i = 1;
        while (i < pos - 1) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
    }

    //Removing the element at aposition using reccursion
    public static void removePosRec(int pos,Node curr,int i) {
        if (i == pos - 1) {
            curr.next = curr.next.next;
            return ;
        }
        if (pos < 1) {
            System.out.println("Position cannot be negative");
            return;
        }
        if (head == null) {
            System.out.println("No element present in list to delete");
            return;
        }
        if (pos == 1) {
            removeAtFirst();
            return;
        }
        removePosRec(pos,curr.next,i+1);
    } 

    // Used to display
    public static void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    
    public static List<Integer> RemoveDuplicates(Node head) {
        List<Integer> ans = new ArrayList<Integer>();
        if (head == null) {
            return ans;
        }

        Node curr = head;
        ans.add(curr.data);

        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                ans.add(curr.data);
            }

        }
        return ans;
    }
    
    public static Node MergeSorted(Node list1,Node list2) {
        Node ans = new Node();
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                ans.insertAtLast(list1.data);
                list1 = list1.next;
            } else {
                ans.insertAtLast(list2.data);
                list2 = list2.next;
            }
        }
        if (list2!=null) {
            ans.insertAtLast(list1.data);
            list1 = list1.next;
        }
        if (list2 == null) {
            while (list1!=null) {
                ans.insertAtLast(list2.data);
                list2 = list2.next;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // insertAtFirst(1);
        // insertAtLast(2);
        // insertAtLast(3);
        // display();
        // insertAtPosition(4, 3);
        // insertLastRec(head, 5);
        // System.out.println();
        // display();
        // removeAtFirst();
        // display();
        // System.out.println();
        // removeAtLast();
        // display();
        // removeLastRec(head);
        // System.out.println();
        // display();
        // removeAtPosition(3);
        // System.out.println();
        // display();
        // removePosRec(0, head, 1);
        // System.out.println();
        // display();
        // insertPosRec(12, 5, 1, head);
        // System.out.println();
        // display();
        // insertAtLast(1);
        // insertAtLast(1);
        // insertAtLast(1);
        // insertAtLast(2);
        // insertAtLast(2);
        // insertAtLast(3);
        // insertAtLast(3);
        // insertAtLast(3);
        // display();
        // List<Integer> n = new ArrayList<Integer>();
        // n=RemoveDuplicates(head);
        // System.out.println();
        // System.out.println(n);
        // System.out.println();
        // display();
        Node list1 = new Node();
        Node list2 = new Node();

        list1.insertAtLast(1);
        list1.insertAtLast(3);
        list1.insertAtLast(5);

        list2.insertAtLast(2);        
        list2.insertAtLast(4);        
        list2.insertAtLast(6);
        
        Node ans = new Node();
        ans = MergeSorted(list1, list2);
        display();


    }
}