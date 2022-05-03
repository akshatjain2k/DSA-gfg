public class Search_in_matrix_rowwsie_columnwise {

    // Naive Solution
    static void search(int[][] a, int x) {
        int r = a.length;
        int c = a[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("Found at c ( " + i + ", " + j + " )");
                    return;
                }
            }
        }
        System.out.println("Not Found");

    }

    // Efficient Solution
    /*
     * Steps
     * 1. Begin from th top right corner(or left bottom)
     * 2. if x is same, print position and return
     * 3. if x is smaller, move left
     * 4. if x is greater , move down
     */
    static void efficientSearch(int[][] a, int x) {
        int r = a.length;
        int c = a[0].length;

        int i = 0, j = c - 1;
        while (i < r && j >= 0) {
            if (a[i][j] == x) {
                System.out.println("Found at c ( " + i + ", " + j + " )");
                return;
            } else if (a[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not Found");

    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int x = 13;
        efficientSearch(a, x);

    }
}
