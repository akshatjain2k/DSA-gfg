import java.util.Scanner;

public class a1_Natural_num {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter number: ");
        int n = 5;
        sum = n * (n + 1) / 2;
        System.out.println(sum);
        //
        long end = System.currentTimeMillis();
        System.out.println("Counting to 10000000 takes " +
                (end - start) + "ms");
    }
}
// for (int i = 0; i <= n; i++) {
// sum += i;
// }
// System.out.println(sum);
// }
