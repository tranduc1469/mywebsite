package frontend;

import utils.FileManager;

import java.io.IOException;

public class Program03 {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        boolean q1 = FileManager.isFileExists(path);
        System.out.println("q1 = " + q1);

        boolean q2 = FileManager.createNewFile(path);
        System.out.println("q2 = " + q2);

        boolean q4 = FileManager.deleteFile(path);
        System.out.println("q4 = " + q4);

        String[] q6 = FileManager.getAllFileName(".");
        for (String fileName : q6) {
            System.out.println("       - " + fileName);
        }
        boolean q7 = FileManager.copyFile("./README.md","./assignment-07/README.md");
        System.out.println("q7 = " + q7);

    }
}
