package Recursion;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) && (isPalindrome(str, start + 1, end - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String s = in.nextLine();
        String str;
        // System.out.println(isPalindrome());

    }
}
