package WeekFive;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = new String[3];
        int[] ages = new int[3];
        double[] grades = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ": Enter the name.");
            names[i] = scnr.next();
            System.out.println((i + 1) + ": Enter the age.");
            ages[i] = scnr.nextInt();
            System.out.println((i + 1) + ": Enter the grade.");
            grades[i] = scnr.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Grade: " + grades[i] + "\n\n");
        }
    }
}
