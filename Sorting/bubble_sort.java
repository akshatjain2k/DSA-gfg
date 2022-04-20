/*
Notes In The End
*/

import java.util.ArrayList;
import java.util.Collections;

public class bubble_sort {

    // public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<Integer>();
    // list.add(2);
    // list.add(10);
    // list.add(8);
    // list.add(7);
    // System.out.println(list);

    // for (int i : list) {
    // if (list.get(i) > list.get(i + 1)) {
    // Collections.swap(list, i, i + 1);
    // }
    // }
    // System.out.println(list);
    // }

    static void bubbleSort(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i]);
        }
    }
    // SOMETHING WRONG IN THE CODE BELOW
    // static void bubble_Sort(int[] arr, int n) {
    // for (int i = 0; i < n; i++) {
    // boolean swapped = false;

    // for (int j = 0; j < n - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // swapped = true;
    // }
    // }
    // if (swapped == false) {
    // System.out.println("already Sorted");
    // }
    // else{
    // System.out.println("We just Sort the array");
    // }
    // }
    // }
    public static void main(String[] args) {
        int[] arr = { 2, 10, 8, 47 };
        int n = arr.length - 1;

        bubbleSort(arr, n);
    }
}

/*
 * Bubble Sort:- In this we just compare elemnt to the adjacent elemnt and swap
 * it. and do this until we find a sorted array.
 * TIME COMPLEXITY = Theta(n^2)
 * Stable Sorting Algorithm
 */