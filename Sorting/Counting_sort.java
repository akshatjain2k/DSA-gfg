public class Counting_sort {

    // Naive Solution
    // Theta(n+k)
    static void countingSort(int[] a, int n, int k) {
        int count[] = new int[k];
        for (int i = 0; i < k; i++) { // Theta(k)
            count[i] = 0; // all element initialize to zero in count array
        }
        for (int i = 0; i < n; i++) { // Theta(n)
            count[a[i]]++;
        }

        int index = 0;
        for (int i = 0; i < k; i++) { // Theta(n+k)
            for (int j = 0; j < count[i]; j++) {
                a[index] = i;
                index++;
            }
        }
    }

    // OPtimized Solution
    // Tc =
    static void efficientCountSort(int[] a, int n, int k) {
        int count[] = new int[k];
        for (int i = 0; i < k; i++) { // Theta(k)
            count[i] = 0; // all element initialize to zero in count array
        }

        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i]; // make another array by adding current + last element
        }

        int output[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        for (int i=0; i<n; i++) {
            a[i] = output[i];
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 4, 1, 0, 1 };
        int n = a.length;
        int k = 5;
        efficientCountSort(a, n, k);
    }
}
