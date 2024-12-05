package WeekFour;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int randNum = (int)(Math.random()*100);
        System.out.println(randNum);
        int userGuess;
        int counter = 0;
        String quitCase = "y";
        System.out.println("Guess a number between 1 and 100.");
        userGuess = scnr.nextInt();
        while (userGuess != randNum && !quitCase.equals("n")) {
            if (userGuess < randNum) {
                System.out.println("Your guess is too low.");
            }
            else if (userGuess > randNum) {
                System.out.println("Your guess is too high.");
            }
            counter++;
            System.out.println("Continue playing y/n?");
            quitCase = scnr.next();
            System.out.println(quitCase);
            if (!quitCase.equals("n")){
                System.out.println("Guess a number between 1 and 100.");
                userGuess = scnr.nextInt();
            }
        }
        if (!quitCase.equals("n")) {
            System.out.println("Correct! It took you " + counter + " guesses.");
        }
        else {
            System.out.println("You played for " + counter + " guesses.");
        }
    }
}
