package Mathematics;

import java.util.Scanner;

public class greatest_common_divisor {

    static int gcd(int a, int b) {
        if(b==0)                      // Euclidean Algorithm
            return a;                 // Optimized Solution
        return gcd(b, a % b);
        // int num = Math.min(a, b);
        // while (num > 0) {
        //     if (a % num == 0 && b % num == 0) {
        //         break;
        //     }
        //     num--;
        // }
        // return num;
    }

    public static void main(String[] args) {
        System.out.print(gcd(9, 15));
    }
}