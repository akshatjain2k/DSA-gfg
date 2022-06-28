import java.util.Scanner;

public class SecondLargestElement {

    static int SecMax() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int max = 0;
        int secmax = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr[max])
                secmax = max;
            max = j;

            if (arr[j] != arr[max]) {
                if (secmax == -1 || arr[j] > arr[secmax])
                    secmax = j;
            }
        }

        return secmax; 
    }

    public static void main(String[] args) {
        System.out.println(SecMax());

    }

}
