package Mathematics;

public class Trailing_zeros_in_factorial {
    // static int findfact(int n) {
    // int res = 1;
    // if (n == 0)
    // return 1;
    // return n * findfact(n - 1);
    // }
    // Not working with higher number
    // public static void main(String[] args) {
    // int n = 20;
    // int count = 0;
    // int num = findfact(20);
    // System.out.println(num);

    // while (num % 10 == 0) {
    // count++;
    // num = num / 10;
    // }
    // System.out.println(count);

    // }

    static int trailingzeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n/i;
        }
        return res;

    }

    public static void main(String[] args) {
        int n=251;
        System.out.println(trailingzeros(251));
    }
}