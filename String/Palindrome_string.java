public class Palindrome_string {

    // Naive Solution
    // TC = O(n), Aux space = O(1)
    static Boolean isPal(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    // Efficient Solution
    // TC = Theta(n), Aux space = Theta(n)
    static boolean efficientPalindrome(String str) {
        int begin = 0;
        int end = str.length() - 1;

        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "geeg";
        System.out.println(isPal(str));
        System.out.println(efficientPalindrome(str));
    }
}