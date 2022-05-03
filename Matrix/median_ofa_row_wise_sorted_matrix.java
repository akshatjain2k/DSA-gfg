import java.util.Arrays;

public class median_ofa_row_wise_sorted_matrix {
    // Assumption
    // * Odd Signed Matrix
    // * All Distict Elements

    // Naive TC= O(r*c)
    /*
     * Steps
     * 1. Put all elements in an array
     * 2. sort the array
     * 3. return the middle element
     */
    static void median(int[][] a) {
        int n = a.length * a[0].length;
        int[] temp = new int[n];
        int count = 0;
        // 1. Put all elements in an array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                temp[count] = a[i][j];
                count++;
            }
        }
        // 2. sort the array
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }

        // 3.return the middle element
        int mid;
        if (count % 2 == 0) {
            mid = temp[(count + (count + 1)) / 2];
            System.out.println("Middle element:" + mid);
        } else {
            mid = temp[count / 2];
            System.out.println("Middle element:" + mid);

        }
    }

    static int efficientMedian(int[][] a, int r, int c) {
        int min = a[0][0]; // first lement
        int max = a[0][c - 1]; // last element

        for (int i = 0; i < r; i++) {
            if (a[i][0] < min) {
                min = a[i][0];
            }
            if (a[i][c - 1] > max) {
                max = a[i][c - 1];
            }
        }
        int medPos = (r * c + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            int midPos = 0;

            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(a[i], mid) + 1;
                midPos += Math.abs(pos);
            }

            if (midPos < medPos) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int a[][] = { { 5, 10, 20, 30, 40 },
                { 1, 2, 3, 4, 6 },
                { 11, 13, 15, 17, 19 },
        };
        efficientMedian(a, a.length, a[0].length);
    }
}
