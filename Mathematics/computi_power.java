package Mathematics;

public class computi_power {

    static int computePow(int x, int n) {
        // int res = 1 ;
        // for(int i = 1; i<=n; i++){
        // res = res*x;
        // }
        // return res;
        if (n == 0) { // Efficient Solution
            return 1;
        }
        int temp = computePow(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(computePow(3, 4));
    }
}
