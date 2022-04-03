public class square_root {

    // Naive Solution

    static int square_root(int x) {

        int i = 1;
        while (i * i <= x)
            i++;
        return (i - 1);
    }

    // use Binary Search
    // Tc = O(logn)
    static int sqRootEffi(int x) {
        int low = 1;
        int high = x;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int mSq = mid * mid;
            if (mSq == x)
                return mid;
            else if (x < mSq)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(square_root(24));
        System.out.println(sqRootEffi(24));
    }
}
