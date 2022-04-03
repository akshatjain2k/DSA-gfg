public class sorted_infinite_array {

    // Infinte Sorted Array
    // Naive Solution, will Take long time if searched element in the last
    // TC = O(position) time
    // SC = O(1)aux space

    static int serchEle(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x)
                return i;
            else if (arr[i] > x)
                return -1;
            i++;
        }
    }

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

    static int searchEffi(int[] arr, int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (arr[i] < x) {
            i = i * 2;
            if (arr[i] == x)
                return i;
            return binarySearchRecursive(arr, x, arr.length / 2, arr.length - 1);
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 10, 20, 30, 45, 63, 78, 87, 95, 107, 117, 125, 150 };

        System.out.println(serchEle(arr, 85));
        System.out.println(searchEffi(arr, 63));

    }
}