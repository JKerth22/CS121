package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File inputfile1 = new File("courses.txt");
            Scanner input = new Scanner(inputfile1);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
