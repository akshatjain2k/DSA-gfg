public class swap {

    static void swapEle(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        swapEle(4, 5);
    }
}
