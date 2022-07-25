package AdvanceJava;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileException {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("S:\\File.txt"));
            System.out.println("Exit Main..");
        }

        catch (FileNotFoundException e) {
            System.out.println("File Not Found caught...");
        }

        finally {
            System.out.println("Finally-block runs regardless of the state of exception");
        }

        System.out.println("After try-catch-finally, life goes on...");
    }
}
