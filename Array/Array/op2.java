package Array;

public class op2 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 45, 3, 44 };

        int del_ele = 20;

        for (int i = 0; i < arr.length; i++) {
            if (del_ele == arr[i])
                for (int j = i; j < arr.length; j++) {
                    arr[j] = arr[j + 1];
                }
            break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
