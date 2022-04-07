public class two_pointer_addition {

    static boolean add2(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (x == arr[i] + arr[j])
                    ;
                return true;
            }
        }
        return false;

    }

    // Only in Sorted Array
    // TC = O(n)
    // SC = O(1)
    // Two Pointer Approach
    static boolean sumof2(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int sum = arr[left] + arr[right];
        while (left <= right) {
            if (x == arr[left] + arr[right])
                return true;
            if (x < arr[left] + arr[right])

                right--;
            if (x > arr[left] + arr[right])
                left++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 40, 60, 80, 70 };
        int x = 40;
        System.out.println(sumof2(arr, x));

    }
}
