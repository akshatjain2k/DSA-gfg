import java.util.Arrays;

public class leftmost_non_repeated {

    // Naive Solution
    static int nonRepeated(String s) {
        for (int i = 0; i < s.length(); i++) {
            Boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return i;
            }
        }
        return -1;
    }

    // Better Approach
    static final int CHAR = 256;

    static int betterNonrepeated(String s) {
        int[] count = new int[CHAR];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    // static final int CHAR = 256;

    static int efficientNonRepeated(String s) {
        int[] fi = new int[256];
        Arrays.fill(fi, -1);
        for (int i = 0; i < s.length(); i++) {
            if (fi[s.charAt(i)] == -1)
                return i;
            else
                fi[s.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++) {
            if (fi[i] >= 0)
                res = Math.min(res, fi(i));
            return (res == Integer.MAX_VALUE) ? -1 : res;
        }

        return -1;
    }

    private static int fi(int i) {
        return 0;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepeated(s));
        System.out.println(betterNonrepeated(s));
    }
}
