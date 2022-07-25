package AdvanceJava;

public class ThrowsException {
    // defining a method
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    // main method
    public static void main(String[] args) {
        ThrowsException obj = new ThrowsException();
        try {
            System.out.println(ThrowsException.divideNum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
}