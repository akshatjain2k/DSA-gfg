import java.util.Scanner;

public class peak_element_and_not_smaller_than_neighnour {

    // Naive Solution
    static int finMaxNeighbour(int[] arr) {

        if (arr.length == 1)
            return arr[0];
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
                return arr[i];

        }
        return 1;
    }

    // TC = O(logn)
    // Sc = O(1)
    static int getpeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == 0 || arr[mid] >= arr[mid - 1] &&
                    mid == arr.length - 1 || arr[mid] >= arr[mid + 1])
                return mid;
            if (mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid - 1;
            else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 40, 60, 80, 70 };
        System.out.println(finMaxNeighbour(arr));
        System.out.println(getpeak(arr));

    }
}
