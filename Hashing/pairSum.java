import java.util.HashSet;

public class pairSum {

    // Tc = (n)
    // Aux Space = O(n)
    static boolean SumPair(int a[], int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (s.contains(sum - a[i])) {
                return true;
            }
            s.add(a[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 8, 15, -8 };
        int sum = 13;
        System.out.println(SumPair(a, sum));

    }
}
