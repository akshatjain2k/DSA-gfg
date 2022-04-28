import java.util.Arrays;

public class kth_smallest_element {
    static int hpartition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (a[i] < pivot);
            do {
                j--;
            } while (a[j] > pivot);
            if (i >= j) {
                return j;

            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            System.out.println(i);
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    // Naive Solution
    static void kthSmallest(int a[], int n, int k) {
        Arrays.sort(a);
        System.out.println(a[k - 1]);
    }

    static int efficientkthSmallest(int a[], int n, int k) {
        int l = 0, r = n - 1;

        while (l < r) {
            int p = hpartition(a, l, r);
            if (p == k - 1) {
                return p;
            } else if (p > k - 1) {
                r = p - 1;
            } else {
                l = p + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 10, 4, 5, 8, 11, 6, 26 };
        int n = a.length;
        int k = 7;
        efficientkthSmallest(a, n, k);
    }

}
