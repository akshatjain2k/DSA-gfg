import java.util.*;

public class minimum_difference {

    // NaiveSolution
    // TC = Theta(n^2)
    static int minDiff(int[] a, int n) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs((a[i] = a[j])) < res) {
                    res = Math.abs((a[i] = a[j]));
                }
            }
        }
        return res;
    }

    // Efficient Solution
    // Sort the Array
    // Compare with adjacent Array
    // TC = Theta(nlogn)
    static int efficientSolu(int a[], int n) {
        Arrays.sort(a); // Tc = (nlogn)
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) { // Tc = (n)
            res = Math.min(res, a[i] - a[i - 1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 11, 8, 12, 5, 18, 2 };
        int n = a.length;
        System.out.println(efficientSolu(a, n));
    }
}
