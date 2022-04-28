public class merge_function_of_mergeSort {

    static void merge(int[] a, int n, int low, int high) {

        int mid = (low + high) / 2;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[n1 + i];
        }
        // Apply merge2Array method here
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                System.out.println(left[i]);
                i++;
            } else {
                System.out.println(right[j]);
                j++;
            }
        }
        while (i < n1) {
            System.out.println(left[i]);
            i++;
        }
        while (j < n2) {
            System.out.println(right[j]);
            j++;
        }
    }

    public static void main(String[] args) {
        int a[] = { 10, 15, 20, 40, 8, 11, 55 };
        int n = a.length;
        merge(a, n, 0, n - 1);
    }
}

/*
 * Time Complexity = Theta(n)
 * Auxilliary Space = Theta(n)
 */