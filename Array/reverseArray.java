public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
