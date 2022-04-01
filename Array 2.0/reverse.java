public class reverse {

    static void reverseArr(int start, int end) {
        int arr[] = { 1, 2, 3, 4, 5 };
        start = 0;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        reverseArr(0, 5);

    }
}
