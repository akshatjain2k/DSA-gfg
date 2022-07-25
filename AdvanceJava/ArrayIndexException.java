package AdvanceJava;

public class ArrayIndexException {

    public static void main(String[] args) {
        int a, b, sum;
        try {
            // a = Integer.parseInt(args[0]);
            // b = Integer.parseInt(args[1]);
            a = 10;
            b = 20;
            sum = a + b;
            System.out.println("Addition is " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient No.");
        }
    }
}
