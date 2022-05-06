public class Longest_substring_with_Distinct_character {
    static final int CHAR = 256;

    static boolean areDistinct(String s, int i, int j) {
        boolean visited[] = new boolean[256];
        for (int k = i; k <= j; k++) {
            if (visited[s.charAt(k)] == true)
                return false;
            visited[s.charAt(k)] = true;
        }
        return true;
    }

    static int longesDistinct(String s) {
        int n = s.length(), res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (areDistinct(s, i, j))
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcdabc";
        System.out.println(longesDistinct(s));
       
        }

    }
