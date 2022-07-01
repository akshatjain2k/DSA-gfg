import java.util.HashSet;

public class Intersectionof2Arr {

    // Tc = O(m+n)
    // Aux Space = O(m)
    static int intersection(int a[], int b[], int m, int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            s.add(a[i]);
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            if (s.contains(b[j])) {
                res++;
                s.remove(b[j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 15, 30, 30, 5 };
        int[] b = { 30, 5, 30, 80 };
        int m = a.length;
        int n = b.length;
        System.out.println(intersection(a, b, m, n));

    }
}