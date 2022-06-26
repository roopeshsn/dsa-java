import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StackException{
        DynamicStack stack = new DynamicStack(5);
        stack.push(21);
        stack.push(21);
        stack.push(21);
        stack.push(21);
        stack.push(21);
        stack.push(21);
        stack.pop();
        stack.pop();
    }
}
