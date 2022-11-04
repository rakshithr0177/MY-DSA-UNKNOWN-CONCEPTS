package queues;

public class QueuesImplementation {

    private int[] data;
    private static final int DEFAULT_SIZE = 10 ;

    int end = 0 ;

    public QueuesImplementation(){
        this(DEFAULT_SIZE);
    }

    public QueuesImplementation(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0 ;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item ;
        return true ;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front(){
        if(isEmpty()){
            return -1;
        }
        return data[0];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return;
        }
        for (int i = 0; i < end ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        QueuesImplementation q = new QueuesImplementation(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display();
        System.out.println(q.remove()+" removed item");
        q.display();
    }

}
