public class intersection_Of_Two_Array {
    // Time Complexity = O(m x n)
    static void intersection(int a[], int b[], int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i > 0 && a[i] == a[i - 1]) // Skip Duplicate Condition
                continue;
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }

    static void efficientIntersection(int a[], int b[], int n, int m) {
        /*
         * if(a[i] < b[j]) --- i++, continue
         * if(a[i] > b[j]) --- j++, continu
         * if(a[i] == b[j]) --- print a[i] & i++ , j++
         * 
         */
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            } else if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
        int b[] = { 5, 10, 10, 15, 30 };
        // int a[] = { 1, 1, 3, 3, 3 };
        // int b[] = { 1, 1, 1, 1, 3, 5, 7 };
        int n = a.length;
        int m = b.length - 1;
        // intersection(a, b, n, m);
        efficientIntersection(a, b, n, m);
    }
}
