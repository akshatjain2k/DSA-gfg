import java.util.HashSet;

public class subarraywithGivenSum {

    static boolean subarraySum(int[] a, int sum) {
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0; // prefix sum;
        for (int i = 0; i < a.length; i++) {
            pre_sum += a[i];
            if (h.contains(pre_sum - sum)) {
                return true;
            }
            if (pre_sum == sum) {
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 5, 8, 6, 13, 3, -1 };
        int sum = 22;
        System.out.println(subarraySum(a, sum));
    }
}
