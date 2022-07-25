package AdvanceJava;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;;

public class MethodReference {
    public static void main(String[] args) {
        // List<Integer> al = Arrays.asList(10, 20, 15, 16);
        // al.forEach(System.out :: println);

        // List<Integer> al = Arrays.asList(10, 20, 7, 8);
        // al.forEach(MethodReference::printSquare);
        // }

        // public static void printSquare(Integer x) {
        // System.out.println(x*x);
        // }

        String a[] = { "GFG", "IDE", "Course" };
        String b[] = { "gfg", "iDe", "course" };

        if (Arrays.equals(a, b, String::compareToIgnoreCase)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}