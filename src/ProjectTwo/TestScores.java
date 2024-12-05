package ProjectTwo;
import java.lang.Math;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int SIZE = (int)(Math.random()*7 + 3);
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        System.out.println("Enter " + testScores.length + " scores");
        for (int i = 0; i < testScores.length; i++) {
            System.out.println("Enter score " + (i+1) + ":");
            testScores[i] = scnr.nextInt();
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        scnr.close();
    }
    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        }
        else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else if (score >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static void printGrades(int[] scores, char[] grades){
        System.out.println("Scores:\tGrades:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "\t" + grades[i]);
        }
    }
    public static void printHighestScore(int[] scores){
        int temp = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > temp) {
                temp = scores[i];
            }
        }
        System.out.println("The highest score was: " + temp);
    }
    public static void printLowestScore(int[] scores){
        int temp = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < temp) {
                temp = scores[i];
            }
        }
        System.out.println("The lowest score was: " + temp);
    }
    public static void printAverageScore(int[] scores){
        int temp = 0;
        for (int i = 0; i < scores.length; i++) {
            temp += scores[i];
        }
        System.out.println("The average score was: " + (temp/scores.length));
    }
}
