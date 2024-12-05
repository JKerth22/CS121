package WeekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many students are there?");
        int stuNum = scnr.nextInt();
        System.out.println("How many tests per student?");
        int testPerStu = scnr.nextInt();
        for (int i = 1; i <= stuNum; i++) {
            int totalScore = 0;
            double avgScore = 0;
            System.out.println("Student #" + i + "\n");
            for (int j = 1; j <= testPerStu; j++) {
                System.out.println("Enter test score " + j);
                totalScore = totalScore + scnr.nextInt();
            }
            avgScore = (double)totalScore / testPerStu;
            System.out.println("Average score for student " + i + " is " + avgScore);
        }
    }
}
