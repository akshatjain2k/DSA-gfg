public class Partition_Hoare_algo {

    static int hpartition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (a[i] < pivot);
            do {
                j--;
            } while (a[j] > pivot);
            if (i >= j) {
                return j;

            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 3, 8, 4, 2, 7, 1, 10 };
        hpartition(a, 0, a.length - 1);
    }
}
/*
 * Hoare Alogrithm:- Consider first elemnt as pivot element and swap other
 * element according to pivot element
 * TC = O(n)
 ******* Aux Space = O(1)*******
 */