package WeekSix;

import java.util.Scanner;

public class MoveSimulationOne {
    public static void printMovieDetails(int movieNumber, String[] names, String[] types, int[] seats, double[] price){
        System.out.println("----------------Movie Details----------------");
        System.out.println("Movie Name     Movie Type     Available Seats     Price");
        for (int i = 0; i < movieNumber; i++){
            System.out.printf(names[i] + "     " + types[i] + "     " + seats[i] + "     $" + price[i] + "\n");
        }
    }
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("How many movies would you like to enter?");
        int movies = scnr.nextInt();
        String[] movieNames = new String[movies];
        String[] movieTypes = new String[movies];
        int[] movieSeats = new int[movies];
        double[] moviePrice = new double[movies];
        for (int i = 0; i < movies; i++) {
            System.out.println("What is the name of movie number " + (i+1));
            movieNames[i] = scnr.next();
            System.out.println("What is the type of movie number " + (i+1));
            movieTypes[i] = scnr.next();
            System.out.println("What is the number of available seats for movie number " + (i+1));
            movieSeats[i] = scnr.nextInt();
            System.out.println("What is the price of movie number " + (i+1) + " (Number only)");
            moviePrice[i] = scnr.nextDouble();
        }
        printMovieDetails(movies, movieNames, movieTypes, movieSeats, moviePrice);
    }
}