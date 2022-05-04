package Mathematics;

public class prime_number {

    static boolean findPrime(int a) {

        if (a == 1)
            return false;

        if (a == 2 || a == 3)
            return false;

        if (a % 2 == 0 || a % 3 == 0)
            return false;

        for (int i = 5; i * i <= a; i = i + 6) {
            if (a % i == 0 || a % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findPrime(23));
    }
}
