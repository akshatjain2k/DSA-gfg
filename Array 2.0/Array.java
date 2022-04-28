import java.util.Scanner;

public class Array {

    static void makeArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of element: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Entered Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        makeArr();
    }

    public static void sort(int[] c) {
    }
}
