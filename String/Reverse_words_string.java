public class Reverse_words_string extends reverse_String {

    static void reverse(char s[], int low, int high) {
        while (low <= high) {
            int temp = s[low];
            s[low] = s[high];
            s[high] = (char) temp;
            low++;
            high--;
        }
    }

    static void reverseWords(char str[], int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }

    public static void main(String[] args) {
        String s = "welcome to club";
        char[] str = s.toCharArray();

        int n = s.length();
        reverseWords(str, n);
        System.out.println(str);
    }
}
