public class quickSort_Using_Lomuto_partition {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static int lpartition(int a[], int l, int h) {
        int pivot = a[h]; // CASE-I: always last elemnt is pivot
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a[i], a[j]);
            }
        }
        swap(a[i + 1], a[h]);

        return i + 1;
    }

    static void qSort(int[] a, int l, int h) {
        if (l < h) {
            int p = lpartition(a, l, h);
            qSort(a, l, p - 1);
            qSort(a, p + 1, h);
        }

    }

    static void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    static public void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        qSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}