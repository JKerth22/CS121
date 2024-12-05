package WeekTwoLab;

import java.util.Scanner;

public class ScannerTriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the width:");
        int width = Integer.parseInt(scnr.nextLine());
        System.out.println("Enter the height:");
        int height = Integer.parseInt(scnr.nextLine());
        int area = width * height / 2;
        System.out.println("Area: " + area);
    }
}