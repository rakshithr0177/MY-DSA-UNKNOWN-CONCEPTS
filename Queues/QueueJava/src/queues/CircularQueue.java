package queues;

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.display();
        System.out.println(q.remove() + " removed");
        q.display();
        q.insert(9);
        q.display();
        q.print();
    }
    protected int[] data;
    private static final int DEFAULT_SIZE = 10 ;

    protected int front = 0 ;
    protected int end = 0 ;
    private int size = 0 ;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item ;
        end =  end % data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            return -1 ;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("No element in the Queue");
        }
        int i = 0 ;
        int j = front ;
        while(i < size){
            System.out.print(data[j++] + "<-");
            j = j % data.length;
            i++;
        }
        System.out.println("end");
    }

    public void print(){
        if(isEmpty()){
            System.out.println("No element in the Queue");
        }
        int i = front ;
        do{
            System.out.print(data[i++]+" ");
            i = i % data.length;
        }while(i != end);
        System.out.println("end");
    }

}
