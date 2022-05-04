package Mathematics;

import java.util.Scanner;

public class Factorial_number {

    // public static void main(String[] args) {
    // int n = 5;
    // int res = 1;
    // for (int i = 1; i <= n; i++) {
    // res = res * i;
    // }
    // System.out.println(res);
    // }

    static int findfact(int n) {
        
        int res = 1;
        if (n == 0)
            return 1;
        return n * findfact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findfact(5));
    }

}
