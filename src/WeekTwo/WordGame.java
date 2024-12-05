package WeekTwo;
import java.util.Scanner;
public class WordGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scnr.next();
        System.out.println("Enter your age:");
        int age = scnr.nextInt();
        System.out.println("Enter what city you currently live in:");
        String city = scnr.next();
        System.out.println("Enter your school name:");
        scnr.nextLine();
        String school = scnr.nextLine();

        System.out.println("The user is named " + name + ", is " + age + " years old, and attends " + school + " in " + city + ".");
    }


}
