import java.util.HashSet;

public class unionOf2Arr {
    // Tc = (m+n)
    // Aux Space = O(m)
    static int union(int a[], int b[], int m, int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            s.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            s.add(b[i]);
        }
        return s.size();
    }

    public static void main(String[] args) {
        int[] a = { 15, 20, 5, 15 };
        int[] b = { 15, 15, 15, 20, 10 };
        int m = a.length;
        int n = b.length;
        System.out.println(union(a, b, m, n));

    }
}
