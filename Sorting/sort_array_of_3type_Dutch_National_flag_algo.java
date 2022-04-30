public class sort_array_of_3type_Dutch_National_flag_algo {

    // Naive Solution
    // TC = Theta(n)
    // Aux Space = = Theta(n)
    // Four Traveral
    static void sort(int a[], int n) {
        int temp[] = new int[n], i = 0;

        for (int j = 0; j < n; j++) {
            if (a[j] == 0) {
                temp[i] = a[j]; // without taking i , we are using it...NICE
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (a[j] == 1) {
                temp[i] = a[j]; // without taking i, we are using it...NICE
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (a[j] == 2) {
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

    // Dutch National Flag Algorithm
    // Optimized Solution
    // TC = Theta(n)
    // Aux Space = = Theta(1)
    // One Traveral
    static void efficientSolu(int[] a, int n) {
        int l = 0, h = n - 1, mid = 0;
        while (mid <= h) {
            if (a[mid] == 0) {
                int t = a[l];
                a[l] = a[mid];
                a[mid] = t;
                l++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int t = a[mid];
                a[mid] = a[h];
                a[h] = t;
                h--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);

        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 2, 0, 1 };
        int n = a.length;
        efficientSolu(a, n);

    }
}
