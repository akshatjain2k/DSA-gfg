import java.util.Stack;

public class stackinJava {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        // checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        System.out.println(stk.peek());
        System.out.println("Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
