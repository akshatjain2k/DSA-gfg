public class binary_search {

    static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int mid = (end + start) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(binarySearch(arr, 4));
    }
}