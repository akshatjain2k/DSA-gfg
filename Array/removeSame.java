public class removeSame {

    public static int removeDupl(int arr[], int n) {

        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 20, 20, 25, 25, 25 };

        int n = arr.length;

        n = removeDupl(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
