package AdvanceJava;

public class MethodCallStackAndException {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("Exit Main");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught...");

            e.printStackTrace();
        } finally {
            System.out.println("finally-block runs regardless of the states of exception");
        }
        System.out.println("After try-catch-finally, life goes on...");
    }

    public static void methodA() {
        System.out.println("Enter methodA()...");
        int a = 5, b = 0;
        int c = a / b;
        System.out.println(c);
    }
}
