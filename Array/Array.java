public class Array {

    static void printarr() {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printarr();
    }
}
