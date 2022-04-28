import java.util.*;

public class count_inversion {

    static void countInversionInSorted(int[] a, int n) {
        Arrays.sort(a);
        System.out.println("After Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Reverse of Array ");

        int[] b = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }

        int x = n * (n - 1) / 2;
        System.out.println("Total Count Inversion in given Array: " + x);

    }

    /*
     * A Pair (a[i],a[j]) forms an inversion when i<j AND a[i] > a[j]
     */

    /*
     * Naive Solution
     * TC = O(n^2)
     */
    static void countInversion(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    count++;

                }
            }
        }
        System.out.println("Total Inversion in given array: " + count);
    }

    public static int countandMerge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[i + 1];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[m + i + 1];
        }
        int count = 0, i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
                count += (n1 - i);
                k++;
            }
        }
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
        return count;
    }

    /*
     * TC = O(nlogn)
     * Aux Space = O(n )
     */
    static int EfficientCountInv(int[] a, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += EfficientCountInv(a, l, m);
            count += EfficientCountInv(a, m + 1, r);
            count += countandMerge(a, l, m, r);

        }

        return count;

    }

    public static void main(String[] args) {
        int a[] = { 40, 30, 20, 10 };
        int n = a.length - 1;
        System.out.println(EfficientCountInv(a, 0, n));
    }
}
