package Mathematics;

public class least_common_multipler {

    static int gcd(int a, int b) {
        if (b == 0) // Euclidean Algorithm
            return a; // Optimized Solution
        return gcd(b, a % b);

    }

    static int lcm(int a, int b) {

        return (a * b) / gcd(2, 8); // Efficient Solution using Eucidean Algo
        // int num = Math.max(a, b);
        // while (num > 0) {
        // if (num % a == 0 && num % b == 0) {
        // break;
        // }
        // num++;
        // }
        // return num;
    }

    public static void main(String[] args) {
        System.out.println(lcm(2, 8));
    }
}
