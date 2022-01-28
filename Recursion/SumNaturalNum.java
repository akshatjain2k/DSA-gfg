package Recursion;

import java.util.Scanner;

public class SumNaturalNum {

    static int Nsum(int n){
        if(n <= 1)
            return n;
        return n + Nsum(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
        System.out.println(Nsum(n));
    }
}
