
class SLL{

    private Node head;
    private Node tail;
    
    private int size;

    public SLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        Node node = new Node(val, curr.next);
        curr.next = node;
        size += 1;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }
    
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return value;
    }

    public Node find(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index,head);
    }
    
    public Node insertRec(int val, int index, Node curr) {
        if (index == 0) {
            Node node = new Node(val,curr);
            size++;
            return node;
        }
        curr.next = insertRec(val, index - 1, curr.next);
        return curr;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("End");
    }

    //Questions
    //Remove duplicates in linked list 
    public void duplicates() {
        Node curr = head;
        while (curr.next != null) {
            if (curr.value == curr.next.value) {
                curr.next = curr.next.next;
                size--;
            } else {
                curr = curr.next;
            }
        }
        tail = curr;
        tail.next = null;
    }
    
    // Merge two sorted linked list 
    public SLL merge(SLL first, SLL second) {
        SLL ans = new SLL();
        Node curr1 = first.head;
        Node curr2 = second.head;
        while (curr1 != null && curr2 != null) {
            if (curr1.value < curr2.value) {
                ans.insertLast(curr1.value);
                curr1 = curr1.next;
            } else {
                ans.insertLast(curr2.value);
                curr2 = curr2.next;
            }
        }
        
        while (curr1 != null) {
            ans.insertLast(curr1.value);
            curr1 = curr1.next;
        }
        
        while (curr2 != null) {
            ans.insertLast(curr2.value);
            curr2=curr2.next;
        }

        return ans;
    }


}

public class SLLKonal {
    public static void main(String[] args) {
        SLL list = new SLL();
        // list.insertFirst(17);
        // list.insertFirst(8);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertLast(99);
        // list.insert(100, 3);
        // list.display();
        // // System.out.println(list.deleteFirst());
        // // list.display();
        // // System.out.println(list.deleteLast());
        // // list.display();
        // // System.out.println(list.delete(2));
        // // list.display();
        // // System.out.println(list.find(8));
        // list.insertRec(20, 3);





        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(3);
        // list.display();
        // list.duplicates();
        // list.display();

        SLL list1 = new SLL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);


        SLL list2 = new SLL();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

        SLL ans = new SLL();
        ans=ans.merge(list1, list2);
        ans.display();
    }
   
}