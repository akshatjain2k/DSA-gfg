public class merge_sort {

    static void merge2Array(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            } else {
                System.out.println(arr2[j]);
                j++;
            }
        }
        while (i < m) {
            System.out.println(arr1[i]);
            i++;
        }
        while (j < n) {
            System.out.println(arr2[j]);
            j++;
        }

    }

    static void bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    static void merge2arrayusingsort(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        bubbleSort(arr);
        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 15, 20 };
        int[] arr2 = { 5, 6, 6, 15 };
        // merge2arrayusingsort(arr1, arr2);
        merge2Array(arr1, arr2, arr1.length, arr2.length);

    }

}
