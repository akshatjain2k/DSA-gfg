public class quickSort_Using_hoare_partition {
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
        }
    }

    static void qSort(int[] a, int l, int h) {
        if (l < h) {
            int p = hpartition(a, l, h);
            qSort(a, l, p);
            qSort(a, p + 1, h);
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        qSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n - 1);
    }
}
