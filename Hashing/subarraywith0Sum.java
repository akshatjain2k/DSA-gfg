import java.util.HashSet;

public class subarraywith0Sum {

    // Naive Solution
    // O(n^2)
    static boolean is0Subarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < a.length; j++) {
                curr_sum += a[j];
                if (curr_sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // Efficient Solution
    // Tc = O(n)
    static boolean effi(int[] a) {
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0; // prefix sum;
        for (int i = 0; i < a.length; i++) {
            pre_sum += a[i];
            if (h.contains(pre_sum)) {
                return true;
            }
            if (pre_sum == 0) {
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 4, -3, 2, 1 };
        System.out.println(effi(a));
    }
}
