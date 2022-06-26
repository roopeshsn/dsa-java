public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) {
        if(isFull()) {
            System.out.println("Stack is full.");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack.");
        }
        return data[0];
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot pop from an empty stack.");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

        // short-hand -> return data[ptr--];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
