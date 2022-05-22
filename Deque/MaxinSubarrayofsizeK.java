import java.util.Deque;
import java.util.LinkedList;

public class MaxinSubarrayofsizeK {
    // Naive Solution
    static void printMaxK(int a[], int n, int k) {
        for (int i = 0; i < n - k + 1; i++) {
            int max = a[i];
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(a[j], max);
            }
            System.out.println(max);
        }
    }

    // Optimize Solution
    static void printopMaxk(int a[], int n, int k) {
        Deque<Integer> dq = new LinkedList<Integer>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addFirst(i);
        }

        for (int i = k; i < n; i++) {
            System.out.print(a[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(a[dq.peek()] + " ");
    }

    public static void main(String[] args) {
        int[] a = { 10, 8, 5, 12, 15, 7, 6 };
        int n = a.length;
        int k = 3;
        printopMaxk(a, n, k);
    }
}