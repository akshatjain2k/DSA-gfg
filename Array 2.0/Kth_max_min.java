import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Kth_max_min {
    static int findkthmax(ArrayList<Integer> arr, int k) {
        int max = arr.get(arr.size() - k);

        return max;
    }

    static int findkthmin(ArrayList<Integer> arr, int k) {
        int min = arr.get(k - 1);

        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(5);
        arr.add(3);

        Collections.sort(arr);
        for (int list : arr) {
            System.out.println(list);
        }
        System.out.println("Kth Minimum Element is: " + findkthmin(arr, 2));
        System.out.println("Kth Maximum Element is: " + findkthmax(arr, 2));

    }
}
