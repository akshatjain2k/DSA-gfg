public class count_occur {

    // Naive Solution
    static int countEle(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
            continue;
        }
        return count;
    }

    static int firstoccur(int[] arr, int x) {
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

    static int lastoccur(int[] arr, int x) {
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

    // Tc = O(logn)
    int countOcc(int[] arr, int x) {
        int first = firstoccur(arr, x);
        {
            if (first == -1)
                return 0;
            else
                return (lastoccur(arr, x) - first + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 10, 10, 15, 20, 20 };
        int x = 5;
        System.out.println(countEle(arr, x));
        // System.out.println("Answer By Naive Solution: " + countEle(arr, x));

    }
}
