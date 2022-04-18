import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array_sort {
    public static void main(String[] args) {
        Integer arr[] = { 51, 12, 20, 4, 14 };
        char arr2[] = { 'B', 'A', 'C', 'A' };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr, 1, 4);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
