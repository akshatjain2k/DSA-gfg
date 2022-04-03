public class index_of_first_occur {

    // Time Complexity = O(logn)
    // Space Complexity = O(logn)
    static int recursivebinary(int[] arr, int x, int low, int high) {

        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                return recursivebinary(arr, x, low, mid - 1);
            }

            else if (x > arr[mid]) {
                return recursivebinary(arr, x, mid + 1, high);
            }

            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    recursivebinary(arr, x, low, mid - 1);
                }
            }
        }
        return -1;
    }

    // Time Complexity = O(logn)
    // Space Complexity = O(1)
    public static int iterativebinary(int[] arr, int x) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 10, 10, 15, 20, 20 };
        int x = 5;
        System.out.println(recursivebinary(arr, x, 0, arr.length - 1));
        System.out.println(iterativebinary(arr, x));

    }
}
