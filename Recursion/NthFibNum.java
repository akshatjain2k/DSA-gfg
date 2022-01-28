package Recursion;

import java.util.Scanner;

public class NthFibNum {

    static int fib(int n) {
        if(n <= 1)
            return n;
            
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
        System.out.println(fib(n));
    }
}
