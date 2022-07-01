import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {

    // Tc = Theta(n)
    // Aux Space = O(n)
    static int countDistinct(Integer[] a) {
        // HashSet<Integer> hs = new HashSet<>();
        // for (int i = 0; i < a.length; i++) {
        // hs.add(a[i]);
        // }
        // return hs.size();
        // }

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(a));
        return hs.size();
    }

    public static void main(String[] args) {
        Integer[] a = { 10, 10, 10, 20, 30, 20, 50 };
        System.out.print(countDistinct(a));

    }
}
