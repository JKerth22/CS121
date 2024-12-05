package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("myCourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;
        Scanner scnr = new Scanner(System.in);

        output.printf("%s %s %s\n", "course", "credits", "score");
        for (int i=0; i<3; i++){
            System.out.println("Enter course name: ");
            course = scnr.next();
            System.out.println("Enter credits: ");
            credits = scnr.next();
            System.out.println("Enter score: ");
            score = scnr.next();
            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();
    }
}
