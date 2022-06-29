public class ceilingontheleft {
    // Time Complexity = O(n^2)
    // Aux Space = O(1)
    static void printceiling(int arr[]) {
        System.out.println("-1");
        for (int i = 0; i < arr.length; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    diff = Math.min(diff, arr[j] - arr[i]);
                }
            }
            if (diff == Integer.MAX_VALUE) {
                System.out.println("-1");
            } else {
                System.out.println(arr[i] + diff);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 30, 15, 25, 12 };
        printceiling(arr);
    }
}
