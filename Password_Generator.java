import java.util.Scanner;

public class Password_Generator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Length Of Password: ");
        int num = in.nextInt();

        String upperCase = "ZXCVBNMLKJHGFDSAQWERTYUIOP";
        String lowerCase = "zxcvbnmlkjhgfdsapoiuytrewq";
        String specialChar = "~@#$%^&*()?-[]{}.,:;//";

        String password = "";

        for (int i = 0; i < num; i++) {
            int rand = (int) (4 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    rand = (int) (lowerCase.length() * Math.random());
                    password += String.valueOf(lowerCase.charAt(rand));
                    break;
                case 2:
                    rand = (int) (upperCase.length() * Math.random());
                    password += String.valueOf(upperCase.charAt(rand));
                    break;
                case 3:
                    rand = (int) (specialChar.length() * Math.random());
                    password += String.valueOf(specialChar.charAt(rand));
                    break;
            }
        }
        System.out.println(password);
    }
}
