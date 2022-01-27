package Mathematics;

public class Palindrome_number {
    public static void main(String[] args) {
        int n = 156;
        int rev = 0;
        while(n!=0){
            int lnum = n % 10;
            rev = rev*10 + lnum;
            n = n/10;
        }
        System.out.println(rev);

    }
}
