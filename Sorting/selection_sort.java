public class selection_sort {

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
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
        selectionSort(arr, n); 
        printArray(arr);

    }
}

/*
 * Selection Sort:- FInd the minimum element and Swap with the first element in
 * array AND find 2nd minimum and swap with 2nd element in the array
 * Does less memory writes compare to quick, merge, insertion sort etc.
 * TIME COMPLEXITY = Theta(n^2)
 * UnStable Sorting Algorithm
 * Basic Idea of HEAP SORT
 */