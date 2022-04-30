import java.nio.file.NotLinkException;

public class sort_array_of_2type {

    // Naive Solution
    // TC = Theta(n)
    // Aux Space = = Theta(n)
    // Two Traversal
    static void segregatePosNeg(int[] a, int n) {
        int temp[] = new int[n], i = 0;

        for (int j = 0; j < n; j++) {
            if (a[j] < 0) {
                temp[i] = a[j]; // without taking i, we are using it...NICE
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (a[j] >= 0) {
                temp[i] = a[j]; // without taking i, we are using it...NICE
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            a[j] = temp[j];
        }
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
    }

    /*
     * Efficient Solution
     * Idea: This problem is mainly a variation of partition of QuickSort
     * ----> Hoare or Lomuto Partition can solve this in --- Theta(n) time &
     * Theta(1) Aux Space
     */
    // Using Hoare Partition
    static void EfficientSolu(int[] a, int n) {
        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (a[i] < 0);
            do {
                j--;
            } while (a[i] > 0);
            if (i >= n) {
                return;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
    }

    public static void main(String[] args) {
        int[] a = { 13, -12, 18, -10 };
        int n = a.length;
        segregatePosNeg(a, n);

    }
}
