public class first_occur {

    static int firstOccur(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i])
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 5, 5, 7, 7, 8, 8 };

        System.out.println(firstOccur(arr, 5));
    }
}
