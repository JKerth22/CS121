package WeekOne;

public class Firstcodewithme {
    public static void main(String[] args){
        //declare variables
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;
        //initialize variables
        age = 18;
        gpa = 4.0;
        name = "Jack";
        letterGrade = 'A';
        csMajor = true;
        String favoriteColor = "Lime";
        // Printing out vriables use format printing
        //System.out.print(); //print
        System.out.println(); //println
        System.out.printf(""); //printf
        System.out.printf("My age is : $d%n", age);
        System.out.printf("My gpa is : %.2f%n", gpa);
        System.out.printf("You are a cs Major %b%n", csMajor);
        System.out.println("My age is : " + age);
        System.out.println("My gpa is : " + gpa);
        System.out.println("You are a cs Major " + csMajor);
        System.out.print("My age is : " + age);
        System.out.print("My gpa is : " + gpa);
        System.out.print("You are a cs Major " + csMajor);
    }
}
