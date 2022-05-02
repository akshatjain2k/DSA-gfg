public class transpose_matrix {

    // Naive Solution
    static void transposeMatrix(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int[][] temp = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = temp[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(a[i][j] + " ");
            }
        }

    }
    // In-Place
    // One Traversal
    static void efficientTranspose(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int[][] temp = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                temp[i][j] = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp[i][j];
            }
        }
    }

    static void printMatrix(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(a[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        efficientTranspose(a);
        printMatrix(a);
    }

}
