public class Heap_sort {

    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    // Step 1 Build a Max Heap
    static void maxHeapify(int a[], int n, int i) {

        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left node
        int right = 2 * +2; // right node
        if (left < n && a[left] > a[largest])
            largest = left;
        if (right < n && a[right] > a[largest])
            largest = right;
        if (largest != i) {
            swap(a[largest], a[i]);
            maxHeapify(a, n, largest);
        }
    }

    static void buildHeap(int[] a, int n) {
        for (int i = (n - 2) / 2; i >= 0; i--) {
            maxHeapify(a, n, i);
        }
    }

    // Step 2 Repeatedly swap root with last node, reduce heap size by one, and
    // heapify.

    static void heapSort(int[] a, int n) {
        buildHeap(a, n);
        for (int i = n - 1; i >= 1; i--) {
            swap(a[0], a[i]);
            maxHeapify(a, i, 0);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 50, 4, 20 };
        int n = a.length;
        int i = 0;
        heapSort(a, n);

    }
}
