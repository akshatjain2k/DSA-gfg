public class check_subsequence {

    // Iterative solution
    // TC = O(m+n), Aux Space = O(1)
    static Boolean inSubseq_Iterative(String s1, String s2, int m, int n) {

        int j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }

        }
        return (j == n);
    }

    // Recursive solution
    // TC = O(m+n), Aux Space = O(m+n)
    static Boolean inSubseq_Recursive(String s1, String s2, int m, int n) {
        if (m == 0)
            return true;
        if (n == 0)
            return false;
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return inSubseq_Recursive(s1, s2, m - 1, n - 1);
        else {
            return inSubseq_Recursive(s1, s2, m - 1, n);
        }
    }

    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "ADE";
        int m = s1.length();
        int n = s2.length();

        System.out.println(inSubseq_Iterative(s1, s2, m, n));
        System.out.println(inSubseq_Recursive(s1, s2, m, n));

    }
}
