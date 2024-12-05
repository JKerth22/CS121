package WeekFive;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        final int numSize = scnr.nextInt();
        int[] array1 = new int[numSize];
        int[] array2 = new int[numSize];
        int[] array3 = new int[numSize];
        int[] array4 = new int[numSize];
        for (int i = 0; i < numSize; i++) {
            System.out.println("Enter the int for index: " + i);
            array1[i] = scnr.nextInt();
        }
        System.out.println("\n Array 1:");
        for (int i = 0; i < numSize; i++) {
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < numSize; i++) {
            array2[i] = array1[i];
        }
        System.out.println("\n Array 2:");
        for (int i = 0; i < numSize; i++) {
            System.out.print(array2[i] + " ");
        }
        for (int i = 0; i < numSize; i++) {
            array3[i] = (int)Math.pow(array1[i], 2);
        }
        System.out.println("\n Array 3:");
        for (int i = 0; i < numSize; i++) {
            System.out.print(array3[i] + " ");
        }
        for (int i = 0; i < numSize; i++) {
            array4[i] = array1[numSize - 1 - i];
        }
        System.out.println("\n Array 4:");
        for (int i = 0; i < numSize; i++) {
            System.out.print(array4[i] + " ");
        }
    }
}
