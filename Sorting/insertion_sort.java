public class insertion_sort {
    static void insertionSort(int arr[], int n){
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 2, 10, 8, 1, 47 };
        int n = arr.length - 1;
        insertionSort(arr, n);
        printArray(arr);
    }
}

/*
 * Time Complexity:- O(n^2) Worst Case AND O(n) - Best Case
 * In-Place(it does not use any auxillary array or auxillary Space) And Stable
 * Used in practice for small array(TimSort and Intro Sort)
 * ptr:- Sorted and Unsorted part
 */