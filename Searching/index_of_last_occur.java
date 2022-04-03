public class index_of_last_occur {

    // Time Complexity = O(logn)
    // Space Complexity = O(logn)
    static int iterativebinary(int[] arr, int x) {            
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid])
                low = mid + 1;
            else if (x < arr[mid])
                high = mid - 1;
            else {
                if (mid != arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    // Time Complexity = O(logn)
    // Space Complexity = O(1)
    static int recursivebinary(int[] arr, int x, int low, int high) {

        if (low > high)
            return -1;
        int mid = (low + high) / 2;

        if (x > arr[mid])
            return recursivebinary(arr, x, mid + 1, high);
        else if (x < arr[mid])
            return recursivebinary(arr, x, low, mid - 1);
        else {
            if (mid != arr.length - 1 || arr[mid] != arr[mid + 1])
                return mid;
            else {
                return recursivebinary(arr, x, mid + 1, high);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 10, 10, 15, 20, 20 };
        int x = 5;
        System.out.println(iterativebinary(arr, x));
        System.out.println(recursivebinary(arr, x, 0, arr.length - 1));

    }
}
