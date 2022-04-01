package Array;

public class leftRotatebyone {

    public static void leftRotate() {
        int arr[] = { 5, 20, 14, 25, 45 };
        int n = arr.length;

        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
            arr[n - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        leftRotate();
    }
}
