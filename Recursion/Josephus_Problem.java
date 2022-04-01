package Recursion;

public class Josephus_Problem {

    static int killkth(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (killkth(n - 1, k) + k) % n;

    }

    public static void main(String[] args) {
        System.out.println(killkth(9, 3));
    }
}
