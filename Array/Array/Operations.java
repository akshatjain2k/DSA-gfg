package Array;

import java.util.Scanner;

public class Operations {

    static int search(int n) {
        int[] arr = { 5, 55, 15, 2, 25 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    static int[] insert(int n, int x, int pos, int arr[]) {

        int newarr[] = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }

        return arr;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println(search(15));

        int[] arr = new int[5];
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Printing all the element: ");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Location at which you want to insert: ");
        int location = in.nextInt();

        System.out.println("Value of Element: ");
        int value = in.nextInt();

        for (int i = arr.length - 1; i > location; i--) {
            arr[i] = arr[i - 1];
        }
        arr[location - 1] = value;

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
