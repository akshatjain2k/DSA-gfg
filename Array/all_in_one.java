import java.util.Scanner;

public class all_in_one {
    
    static int hellw(int a, int b){
        int c = a + b;
        return c;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = in.nextInt();
        System.out.println("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println(hellw(a, b));
        
        
    }
}
