import java.util.Arrays;
import java.util.List;

public class Median_2_sorted_array {

    // static int[] sort2arr(int[] arr1, int[] arr2) {
    // }

    public static void main(String[] args) {

        int mid1, mid2;
        double fmid;
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 5, 15, 25, 35, 45 };

        int[] arr3 = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        Arrays.toString(arr3);

        Arrays.sort(arr3);

        if (arr3.length % 2 == 0) {
            mid1 = arr3.length / 2;
            mid2 = mid1 - 1;
            fmid = (arr3[mid1] + arr3[mid2]) / 2;

            System.out.println(fmid);
        } else {
            System.out.println(arr3[arr3.length / 2]);
        }

    }
}
