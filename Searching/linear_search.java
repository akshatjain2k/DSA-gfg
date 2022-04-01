public class linear_search {

    static int serchEle(int[] arr, int k) {
        for (int i = 0; i < arr.length; i = i + 2) {
            if (k == arr[i]) {
                System.out.println("Element Found at " + i + " index");
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        serchEle(arr, 7);

    }
}
