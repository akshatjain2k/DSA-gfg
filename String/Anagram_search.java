public class Anagram_search {

    // check for anagram
    static final int CHAR = 256;

    static Boolean efficientAnagram(String pat, String txt, int i) {
        int count[] = new int[CHAR];
        for (int j = 0; j < txt.length(); j++) {
            count[txt.charAt(j)]++;
            count[txt.charAt(j + i)]--;
        }
        for (int j = 0; j < CHAR; j++) {
            if (count[j] != 0)
                return false;
        }
        return true;
    }

    // Main Program
    // Naive Solution
    static boolean isPresent(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            if (efficientAnagram(pat, txt, i))
                return true;
        }
        return false;
    }

    // Optimized Solution
    // Tc =O(m + (n-m)*CHAR)
    // Aux Space = Theta(CHAR)
    static boolean efficientsPresent(String txt, String pat) {
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];
        for (int i = 0; i < pat.length(); i++) {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for (int i = pat.length(); i < txt.length(); i++) {
            if (areSame(CP, CT))
                return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i - pat.length())]--;
        }
        return false;

    }

    private static boolean areSame(int[] cP, int[] cT) {
        for (int i = 0, j = 0; i < cT.length && j < cP.length; i++, j++) {
            if (cT[i] == cP[j])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        
        System.out.println(isPresent(txt, pat));
        System.out.println(efficientsPresent(txt, pat));
    }
}
