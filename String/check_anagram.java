import java.util.Arrays;

public class check_anagram {

    static Boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;
        char a[] = s1.toCharArray();
        Arrays.sort(a);

        s1 = new String(a);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);

        s2 = new String(a2);
        return s1.equals(s2);
    }

    static final int CHAR = 256;

    static Boolean efficientAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int count[] = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s1.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if(count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "sitenl";
        System.out.println(checkAnagram(s1, s2));
        System.out.println(efficientAnagram(s1, s2));
    }
}
