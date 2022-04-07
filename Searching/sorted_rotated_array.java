public class sorted_rotated_array {

    // Naive Solution
    // TC = O(n) & SC = O(logn)
    static int searchEle(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    static int efficientSolu(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > arr[low]) {
                if (x >= arr[low] && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (x > arr[mid] && x > arr[high])
                low = mid + 1;
            else
                high = mid - 1;

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 500, 1000, 2000, 10, 20 };
        int x = 200;
        System.out.println(efficientSolu(arr, 10));
    }

}
