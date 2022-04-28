public class Partition_Lomuto_algo {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static int lpartition(int a[], int l, int h) {
        int pivot = a[h]; // CASE-I: always last elemnt is pivot
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a[i], a[j]);
            }
        }
        swap(a[i + 1], a[h]);

        return (i + 1);
    }
    // CASE II: if pivot is not the last element then swap it with last element
    // swap(a[pivot], a[h])

    public static void main(String[] args) {
        int a[] = { 10, 80, 30, 90, 40, 50, 70 };
        lpartition(a, 0, a.length - 1);
    }
}

/*
 * Lomuto Alogrithm:- Consider last elemnt as pivot element and swap other
 * element according to pivot element
 * TC = O(n)
 ******* Aux Space = O(1)*******
 */
