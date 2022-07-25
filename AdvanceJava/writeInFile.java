package AdvanceJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class writeInFile {
    public static void main(String[] args) {
        // Write Operation
        // try {
        // FileWriter wr = new FileWriter("S:\\File.txt");
        // wr.write("JAvaaaaaaaaaaaa");
        // wr.close();
        // System.out.println("Successfully Wrote...!!!");

        // } catch (Exception e) {
        // System.out.println("Error Occured");
        // }

        // Read Operation
        try {
            File obj = new File("S:\\File.txt");
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                String data = in.nextLine();
                System.out.println(data);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Error Occured");
        }
    }
}
