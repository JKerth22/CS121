package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("mycourses.txt", true);
        PrintWriter output = new PrintWriter(fileWriter);
        Scanner scnr =  new Scanner(System.in);
        System.out.println("Enter course name: ");
        String course = scnr.next();
        System.out.println("Enter credits: ");
        String credits = scnr.next();
        System.out.println("Enter score: ");
        String score = scnr.next();

        output.printf("%s %s %s\n", course, credits, score);
        fileWriter.close();
        output.close();
    }
}
