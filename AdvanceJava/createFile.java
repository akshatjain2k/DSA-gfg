package AdvanceJava;

import java.io.File;

public class createFile {
    public static void main(String[] args) {
        try {
        File obj = new File("S:\\File.txt");
        if (obj.createNewFile()) {
        System.out.println(obj.getName());
        } else {
        System.out.println("File Already Exists");
        }
        } catch (Exception e) {
        System.out.println("An Error Occured");
        }

        // File Operations
        // File obj = new File("S:\\File.txt");
        // if (obj.exists()) {
        //     System.out.println(obj.getName());
        //     System.out.println(obj.getAbsolutePath());
        //     System.out.println(obj.canWrite());
        //     System.out.println(obj.canRead());
        //     System.out.println(obj.length());
        // } else {
        //     System.out.println("File Doesn't Exists");
        // }
    }
}
