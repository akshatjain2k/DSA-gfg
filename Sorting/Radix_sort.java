public class Radix_sort {
    // Tc= Theta(d*(n+b))
    // Theta(n+b) extra space required
    
    static void radixSort(int a[], int n) {
        // step 1 Find the max element in the array
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // step 2 Called counting sort for every digit in max num
        // exp initialize power of 10 --- 1st go with 10(10^1) then 100(10^2) then
        // 1000(10^3)
        // for 319 run till ex == 100
        for (int exp = 1; max / exp > 0; exp = exp * 10) {
            CountSort(a, n, exp);
        }
    }

    static void CountSort(int[] a, int n, int exp) {
        int count[] = new int[10];
        int output[] = new int[n];
        for (int i = 0; i < 10; i++) { // Theta(k)
            count[i] = 0; // all element initialize to zero in count array
        }

        for (int i = 0; i < n; i++) {
            count[(a[i] / exp) % 10]++;
        }
        for (int i = 0; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int a[] = { 319, 212, 6, 8, 100, 50 };
        int n = a.length;
        radixSort(a, n);
    }
}
