import java.util.Stack;

class evalutiontopostfix {

    static int evalPostfix(String str) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;

                    default:
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("postfix evaluation: " + evalPostfix(exp));
    }
}
