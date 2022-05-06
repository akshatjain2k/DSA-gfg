public class check_for_rotation {

    // Naive Soltion
    /*
     * Rotatte String by 1 to n times and compare them with input
     * TC = O(n^2)
     */

    // Optimize Solution
    /*
     * TC = Linear
     * concate string s1 with s1
     */
    static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        // we can also find using concate (indexof() in java)
        return ((s1 + s1).indexOf(s2) >= 0);

        // or we can also use below method
        // String s3 = s1 + s1;

        // if (s3.contains((s2)))
        // return true;
        // return false;
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CADB";
        System.out.println(areRotations(s1, s2));
    }
}
