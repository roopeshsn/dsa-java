import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(21);
        stack.push(23);
        stack.push(3);
        stack.push(15);

        System.out.println(stack.pop());
        stack.push(9);
        System.out.println(stack);
    }
}
