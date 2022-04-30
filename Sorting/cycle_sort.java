public class cycle_sort {
    static void cycleSortDistinct(int a[], int n) {
        for (int cs = 0; cs < n - 1; cs++) {
            int item = a[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++) {
                if (a[i] < item) {
                    pos++;
                }
            }
            int t = item;
            item = a[pos];
            a[pos] = t;

            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++) {
                    if (a[i] < item)
                        pos++;
                }
                t = item;
                item = a[pos];
                a[pos] = t;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = { 20, 40, 50, 10, 30 };
        int n = a.length;
        cycleSortDistinct(a, n);    
    }
}

/*
 * ---A worst case O(n^2) sorting algorithm
 * ---Does Minimum Memory writes and can be useful for cares where memory write
 * in costly
 * --- In=Place and Not Stable
 * --- Useful to solve question like find minimum swaps required to sort an
 * array
 */