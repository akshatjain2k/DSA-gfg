package Mathematics;

public class all_divisors {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("1");
        for (int i = 2; i*i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);

                if(i != a/i){
                    System.out.println(a/i);
                }
            }

        }
    }
}
