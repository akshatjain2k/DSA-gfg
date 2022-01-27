package Mathematics;

public class all_prime {
    static boolean findPrime(int a) {

        if (a == 1)
            return false;

        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    void printPrime(int a) {
        for (int i = 2; i <= a; i++) {
            if (findPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        all_prime pp = new all_prime();
        pp.printPrime(23);
        System.out.println(findPrime(23));
    }
}
