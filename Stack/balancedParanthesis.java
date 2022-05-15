import java.util.Stack;

public class balancedParanthesis {

    static Boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    static boolean isBaanced(String str) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                s.push(x);
            } else {
                if (str.isEmpty() == true) {
                    return false;
                } else if (matching(s.peek(), x) == false) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return (s.empty() == true);
    }

    public static void main(String[] args) {
        String str = "([[{}]])";
        // balancedParanthesis bp = new balancedParanthesis();
        // bp.isBaanced(str);

        if (isBaanced(str))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
