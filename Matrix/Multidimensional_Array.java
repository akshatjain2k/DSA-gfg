public class Multidimensional_Array {
    // public static void main(String[] args) {
    // int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

    // // We ca also use
    // // int m =2, n=3;
    // // int a[][] = new int[m][n];

    // for (int i = 0; i < a.length; i++) {
    // for (int j = 0; j < a[i].length; j++) {
    // // a[i][j] = 10;
    // System.out.println(a[i][j] + " ");
    // }
    // System.out.println ();
    // }
    // }

    public static void main(String[] args) {
        int m = 3;
        int a[][] = new int[m][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i;
                System.out.println(a[i][j] + " ");
            }

            System.out.println();
        }

    }
}
