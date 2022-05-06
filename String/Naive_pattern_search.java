public class Naive_pattern_search {

    // Naive Algorithm
    static void patSearching(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println(i + " ");
            }
            if (j == 0) {
                i++;

            }
        }
    }

    //Improved Naive Pattern Matching Algo
    static void improvedpatSearching(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= n - m; ) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println(i + " ");
            }
            if (j == 0) {
                i++;
            }
            else{
                i = (i+j);
            }
            // improvement here
            // when i != j
            // we'll start i from where i != j and j from 0th index 
            
        }
    }


    public static void main(String[] args) {
        String txt = "ABCABCD";
        String pat = "ABCD";
        patSearching(txt, pat);
        improvedpatSearching(txt, pat);

    }
}
