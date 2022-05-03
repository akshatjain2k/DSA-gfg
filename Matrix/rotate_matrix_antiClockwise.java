public class rotate_matrix_antiClockwise extends transpose_matrix {

    // Naive Solution
    // TC = Aux Space = Theta(n^2)
    // Step 1. Last Column becomes first Row
    // Step 1. Second Last Column becomes Second Row

    static void swapEle(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    static void rotateMatrix(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int[][] temp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[c - j - 1][i] = a[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = temp[i][j];
            }
        }
        printMatrix(a);
    }

    // Optimize Solution
    // TC = Theta(n^2), Aux Space = Theta(1)
    // Step 1: Find transpose of matrix
    // step 2: Reverse individual Columns

    static void efficientRotate90(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int[][] temp = new int[r][c];

        // efficientTranspose(a);
        // int r = a.length;
        // int c = a[0].length;
        // int[][] temp = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                temp[i][j] = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp[i][j];
            }
        }

        // Reverse
        for (int i = 0; i < r; i++) {
            int start = 0;
            int end = r - 1;

            while (start < end) {
                temp[start][end] = a[start][i];
                a[start][i] = a[end][i];
                a[end][i] = temp[start][end];

                start++;
                end--;
            }
        }
        printMatrix(a);
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        efficientRotate90(a);
    }
}
