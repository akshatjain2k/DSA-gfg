package AdvanceJava;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava {
    // public static void main(String[] args) {
    // int arr[] = { 30, 20, 10 };
    // //sum
    // int sum = Arrays.stream(arr).sum();
    // System.out.println(sum);
    // //maximum
    // int maxx = Arrays.stream(arr).max().getAsInt();
    // System.out.println(maxx);
    // //minimum
    // int minn = Arrays.stream(arr).min().getAsInt();
    // System.out.println(minn);
    // //average
    // double avg = Arrays.stream(arr).average().getAsDouble();
    // System.out.println(avg);
    // }
    class Student {
        int roll;
        int marks;
        String name;

        Student(int r, int m, String n) {
            roll = r;
            marks = m;
            name = n;
        }

        int getRoll() {
            return roll;
        }

        String getname() {
            return name;
        }

        int getmarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        // Print first n natural number with given digit d
        // Stream.iterate(1, x -> x + 1)
        // .filter(x -> x.toString().contains("5"))
        // .limit(10)
        // .forEach(System.out::println);

        // String arr[] = { "abc", "cde", "acd", "aec", "xyz" };
        // Arrays.stream(arr).filter(x -> x.startsWith("a"))
        // .filter(x -> x.endsWith("c"))
        // .sorted()
        // .forEach(System.out::println);

        // Student arr[] = {
        //         new Student(100, 70, "abc"),
        //         new Student(101, 80, "bcd"),
        //         new Student(120, 60, "xyz")
        // };
        // Map<Integer, String> m = Arrays.stream(arr).collect
        // (Collectors.toMap(Student :: getRoll, Student :: getname));
    }
}
