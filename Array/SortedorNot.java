import java.util.Scanner;

public class SortedorNot {

    static boolean inSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] < arr[i])
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();        
    }
    System.out.println(inSorted(arr));

}
}
