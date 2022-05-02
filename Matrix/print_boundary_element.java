public class print_boundary_element {
    static void printBoundaryele(int a[][]) {
        int r = a.length;
        int c = a[0].length;
        if (r == 1) {
            for (int i = 0; i < r; i++) {
                System.out.print(a[0][i] + " ");
            }
        } else if (c == 1) {
            for (int i = 0; i < r; i++) {
                System.out.print(a[i][0] + " ");
            }
        } else {
            for (int i = 0; i < c; i++) {
                System.out.print(a[0][i] + " ");
            }
            for (int i = 1; i < r; i++) {
                System.out.print(a[i][c - 1] + " ");
            }
            for (int i = c - 2; i >= 0; i--) {
                System.out.print(a[r - 1][i] + " ");
            }
            for (int i = r - 2; i >= 1; i--) {
                System.out.print(a[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printBoundaryele(a);
    }
}
