import java.util.Arrays;
import java.util.MissingResourceException;

public class chocolate_distribution {

    static int minDiff(int[] a, int n, int m) {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        if (m > n) {
            return -1;
        }
        Arrays.sort(a);
        int res = a[m - 1] - a[0];
        for (int i = 1; (i + m - 1) < n; i++) { // Star Condition
            res = min(res, (a[i + m - 1] - a[i]));

        }
        return res;
    }

    public static int min(int res, int x) {
        int min = 0;
        if (res < x) {
            min = res;
        } else {
            min = x;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;
        int n = a.length;
        System.out.println(minDiff(a, n - 1, m));
    }
}
