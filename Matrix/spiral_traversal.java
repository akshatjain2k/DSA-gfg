public class spiral_traversal {
    /*
     * -->--
     * | |
     * --<--
     */

    // Naive Solution
    /*
     * Steps to follow
     * Top Row and do top ++
     * Right Column and right --
     * Bottom Row(Reverse) and do bottom --
     * left Column (Reverse) and do left ++
     */
    static void printSpiral(int a[][], int r, int c) {
        int top = 0, left = 0, bottom = r - 1, right = c - 1;

        while (top <= bottom && left <= right) {
            // Top Row
            for (int i = left; i <= right; i++) {
                System.out.println(a[left][i] + " ");
            }
            top++;

            // Right Column
            for (int i = top; i <= bottom; i++) {
                System.out.println(a[i][right] + " ");
            }
            right--;

            // Bottom Row (Reverse Order)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
        printSpiral(a, a.length, a[0].length);

    }
}
