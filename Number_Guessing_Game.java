import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Random rnum = new Random();
        System.out.print("Number of trial: ");
        int n = in.nextInt();
        int x = rnum.nextInt(10); // we can set the limit

        while (n != 0) {
            System.out.print("Guess the Number Between 0 to 10: ");
            int num = in.nextInt();
            if (x > num)
                System.out.println("The Guessed number is greater than the correct answer");
            else if (x < num)
                System.out.println("The Guessed number is less than the correct answer");
            else {
                System.out.println("You Guessed the right answer");
                break;
            }
            n--;

        }
    }
}