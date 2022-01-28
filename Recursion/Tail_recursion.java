package Recursion;

// Tail Recursio means when recursion will take place at the end of program
// these recursion will take less time on modern compiler

class Tail_recursion {
    static void printNto1(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printNto1(n - 1);

    }

    public static void main(String[] args) {
        printNto1(4);
    }
}