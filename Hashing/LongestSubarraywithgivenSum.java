import java.util.HashSet;

public class LongestSubarraywithgivenSum {

    static int maxlen(int a[], int sum) {
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0, res = 0; // prefix sum;
        for (int i = 0; i < a.length; i++) {
            pre_sum += a[i];
            if (pre_sum == sum) {
                res = i + 1;
            }
            if (h.contains(pre_sum) == false) {
                h.add(pre_sum);
            }
            //ERROR
            // if (h.contains(pre_sum - sum)) {
            //     res = Math.max(res, i - h[pre_sum - sum]);
            // }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 5, 8, 6, 13, 3, -1 };
        int sum = 22;
        System.out.println(maxlen(a, sum));
    }
}
