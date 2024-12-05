package WeekSix;

import java.util.Scanner;

public class LabSix {
    static double length;
    static double width;
    static double area;
    static Scanner scnr = new Scanner(System.in);
    public static double getLength(){
        System.out.println("Enter the rectangle length.(Double)");
        length = scnr.nextDouble();
        return length;
    }
    public static double getWidth(){
        System.out.println("Enter the rectangle width.(Double)");
        width = scnr.nextDouble();
        return width;
    }
    public static double getArea(double len, double wid){
        area = len*wid;
        return area;
    }
    public static void displayData(double len, double wid, double area){
        System.out.println("The Length of the rectangle is "+length);
        System.out.println("The Width of the rectangle is "+width);
        System.out.println("The area of the rectangle is "+area);
    }
    public static void main(String[] args) {
        getLength();
        getWidth();
        getArea(length,width);
        displayData(length,width,area);

        scnr.close();
    }
}
