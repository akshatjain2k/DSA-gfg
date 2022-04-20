public class selection_sort {

    static int selectionSort(int[] arr, int n) {
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 8, 47 };
        int n = arr.length - 1;
        System.out.println(selectionSort(arr, n));
    }
}

/*
 * Selection Sort:- FInd the minimum element and place it at 1st position then
 * find the 2nd minimum elemnt and place it 2nd position of array
 * Does less memory writes compare to quick, merge, insertion sort etc.
 * Basic Idea of HEAP SORT
 * Not STABLE
 */