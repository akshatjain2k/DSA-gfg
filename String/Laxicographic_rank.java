import Mathematics.Factorial_number;

public class Laxicographic_rank extends Factorial_number {

    // Naive Solution - Get all permutation of the given string and find the
    // position of string in permutation and do + 1(+1 means string position, if not
    // +1 it means total strings we get before our desirable string)

    // Efficient Solution: Count Lexicographically Smaller String +1
    // Tc = O(n*CHAR)
    static final int CHAR = 256;

    static int lexRank(String s) {
        int res = 1;
        int n = s.length();
        int mul = findfact(n);

        int count[] = new int[CHAR];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < n - 1; i++) {
            mul = mul / (n - i);
            res = res + count[s.charAt(i) - 1] * mul;

            for (int j = s.charAt(i); j < CHAR; j++) {
                count[j]--;
            }

        }

        return res;

    }

    public static void main(String[] args) {
        String s = "STRING";
        System.out.println(lexRank(s)) 
        ;
    }
}
