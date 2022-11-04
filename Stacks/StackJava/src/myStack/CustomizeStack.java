package myStack;

public class CustomizeStack {
    protected int []data;
    private static final int DefaultSize =10;
    int ptr;

    public CustomizeStack(){
        this(DefaultSize);
    }

    public CustomizeStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");
            return  false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return data[ptr--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr > data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
