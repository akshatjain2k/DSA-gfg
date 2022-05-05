import java.util.Arrays;

public class leftmost_repeated {

    static int checkLeftMostRepeated(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int k = i + 1; k < s.length(); k++) {

                if (s.charAt(i) == s.charAt(k))
                    return i;
            }
        }
        return -1;
    }

    static final int CHAR = 256;

    static int betterapproach(String s) {
        int[] count = new int[CHAR];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] > 1)
                return i;
        }

        return -1;
    }

    // static final int CHAR = 256;

    static int efficientLeftmost(String s) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = s.length(); i >= 0; i--) {
            if (visited[s.charAt(i)])
                res = i;
            else {
                visited[s.charAt(i)] = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(checkLeftMostRepeated(s));
        System.out.println(efficientLeftmost(s));
    }
}