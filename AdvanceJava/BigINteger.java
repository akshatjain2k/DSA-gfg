package AdvanceJava;
import java.math.BigInteger;
import java.util.Scanner;

public class BigINteger {

    public static void main(String[] args) {

        // // Initilization
        // // m-1
        // BigInteger a = new BigInteger("515154");

        // // m-2
        // String b = "123456";
        // BigInteger B = new BigInteger(b);

        // // m-3
        // int c = 123456;
        // BigInteger C = BigInteger.valueOf(c);

        // System.out.println(B);

        // // add, subtract, multiply, divide, remainder, compareTo
        // BigInteger addition = a.add(B);
        // BigInteger subtraction = a.subtract(B);
        // BigInteger multiplication = a.multiply(B);
        // BigInteger division = a.divide(B);
        // System.out.println("addition of A and B is: " + addition);
        // System.out.println("subtraction of A and B is: " + subtraction);
        // System.out.println("multiplication of A and B is: " + multiplication);
        // System.out.println("division of A and B is: " + division);

        // // Conversion

        // BigInteger A1 = new BigInteger("200");
        // int x = A1.intValue();
        // long y = A1.longValue();
        // String z = A1.toString();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = in.nextInt();

        System.out.println("Factorial of " + n + " is: " + fact(n));
        System.out.println("Fibonacci  of " +n+ " is: "+fib(n));
    }

    public static BigInteger fib(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }

    public static BigInteger fact(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            BigInteger x = BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;
    }

}
