import java.util.Arrays;

public class union_Of_Two_Array {

    static void bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    // Naive Solution
    // O(m+n)* log(m+n)
    static void union(int[] a, int[] b, int n, int m) {
        int[] c = new int[n + m];

        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[n + i] = b[i];
        }
        Arrays.sort(c);

        for (int i = 0; i < n + m; i++) {
            if (i == 0 || c[i] != c[i - 1]) {
                System.out.println(c[i]);
            }
        }

    }

    static void Efficientunion(int[] a, int[] b, int n, int m) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[i] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                System.out.println(b[j]);
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        while (i < n) { 
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.println(a[i]);
                i++;
            }
        }
        while (j < m) {
            if (j > 0 && b[j] != b[j - 1])
                System.out.println(b[j]);
            j++;
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 10, 20, 20 };
        int b[] = { 3, 20, 40 };
        int n = a.length;
        int m = b.length;
        // union(a, b, n, m);
        Efficientunion(a, b, n, m);
    }
}
