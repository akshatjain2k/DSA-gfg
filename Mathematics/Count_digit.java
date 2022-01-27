package Mathematics;
import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = num();
        System.out.println(ans);
    }

    static int num() {

        int n = 12453;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;

    }
}
