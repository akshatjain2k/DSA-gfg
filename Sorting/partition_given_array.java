import java.util.Arrays;

public class partition_given_array {

    /*
     * Naive Solution
     * TC = O(n)
     * Aux Space = O(n)
     */
    static void partitionArray(int[] a, int l, int h, int p, int n) {
        int temp[] = new int[h - l + 1];
        int index = 0;
        for (int i = l; i <= h; i++) {
            if (a[i] <= a[p]) {
                temp[index] = a[i];
                index++;
            }
        }
        for (int i = l; i <= h; i++) {
            if (a[i] > a[p]) {
                temp[index] = a[i];
                index++;
            }
        }
        for (int i = l; i <= h; i++) {
            a[i] = temp[i - l];
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 6, 12, 10, 7 };
        int n = a.length;
        int p = 6;
        partitionArray(a, 0, 5, p, n);
    }
}
