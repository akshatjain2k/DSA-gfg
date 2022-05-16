import java.io.*;
import java.util.*;

class evalprefix {
    static boolean isoperand(char c) {
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

    static double evalPrefix(String str) {
        Stack<Double> stack = new Stack<Double>();

        for (int j = str.length() - 1; j >= 0; j--) {
            if (isoperand(str.charAt(j)))
                stack.push((double) (str.charAt(j) - 48));
            else {
                double o1 = stack.peek();
                stack.pop();
                double o2 = stack.peek();
                stack.pop();

                switch (str.charAt(j)) {
                    case '+':
                        stack.push(o1 + o2);
                        break;
                    case '-':
                        stack.push(o1 - o2);
                        break;
                    case '*':
                        stack.push(o1 * o2);
                        break;
                    case '/':
                        stack.push(o1 / o2);
                        break;
                }
            }

        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String exprsn = "+9*26";
        System.out.println(evalPrefix(exprsn));
    }
}
