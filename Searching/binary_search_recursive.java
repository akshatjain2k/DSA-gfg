public class binary_search_recursive {

    static int binarySearchRecursive(int[] arr, int x, int start, int end) {
        if (end > start) {

            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                return binarySearchRecursive(arr, x, start, mid - 1);
            else
                return binarySearchRecursive(arr, x, mid + 1, end);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(binarySearchRecursive(arr, 4, 0, 4));
    }
}
