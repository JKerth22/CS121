package WeekSevenLab;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationClass
{
    private String movieName;
    private String movieType;
    private double moviePrice;
    private int[][] movieAvailability;
    public MovieSimulationClass(String name, String type, double price){
        this.movieName = name;
        this.movieType = type;
        this.moviePrice = price;
        this.movieAvailability = new int[5][10];
    }
    private String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
    private String[] movieTypes = {"3D", "2D", "3D", "2D"};
    private double[] moviePrices = {15.00, 12.00, 14.00, 12.00};
    private static Scanner scanner = new Scanner(System.in);

    int selectMovie() {
        String selectedMovie;
        // Infinite loop until the user enters a valid movie name
        while (true) {
            System.out.print("\nEnter the movie name: ");
            selectedMovie = scanner.nextLine();
            // Check if the entered movie name exists in the movieNames array
            for (int i = 0; i < this.movieName.length(); i++) {
                if (selectedMovie.equals(movieNames[i])) {
                    return i; // Return the index of the selected movie
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }
    void displaySelectedMovie() {
        // Print formatted details of the selected movie
        System.out.printf("\n%s MOVIE SELECTION %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-23s %-20s $%.2f\n", this.movieName, this.movieType, this.moviePrice);
    }
    void randomizeAvailability() {
        Random random = new Random();
        // Loop through each seat and randomly assign its availability (0 or 1)
        for (int i = 0; i < this.movieAvailability.length; i++) {
            for (int j = 0; j < this.movieAvailability[i].length; j++) {
                this.movieAvailability[i][j] = random.nextInt(2);                    // Randomly assign availability (0 or 1)
            }
        }
    }

    void displaySeatAvailability() {
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("\n%s AVAILABLE SEATS %s\n", "-".repeat(25), "-".repeat(25));
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available]\n\n  ");

        // displays column numbers
        for (int col = 1; col <= this.movieAvailability[0].length; col++) {
            System.out.printf(" %d", col);
        }
        System.out.printf("\n %s\n", "-".repeat(20));

        // displays row labels and seat availability
        for (int i = 0; i < this.movieAvailability.length; i++) {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < this.movieAvailability[i].length; j++) {
                System.out.printf("%d ", this.movieAvailability[i][j]);
            }
            System.out.println();
        }
    }


    void selectSeats() {
        // ask the user how many tickets they'd like to purchase
        System.out.print("\nEnter the number of tickets you'd like to purchase: ");
        int tickets = Integer.parseInt(scanner.nextLine());

        // loop through each ticket and allow the user to pick a seat
        for (int t = 1; t <= tickets; t++) {
            while (true) {
                System.out.printf("Please pick an available seat (e.g., A2) for ticket #%d: ", t);
                String seat = scanner.nextLine().toUpperCase();

                // extract row and column index from seat input
                int rowIndex = seat.charAt(0) - 65;                              // convert row character (e.g., 'A') to index
                int seatIndex = Integer.parseInt(seat.substring(1)) - 1;         // convert seat number to index

                // check if the selected seat is available
                if (this.movieAvailability[rowIndex][seatIndex] == 0) {
                    this.movieAvailability[rowIndex][seatIndex] = 1;                  // marks the seat as booked
                    System.out.printf("\nYou have successfully booked seat %s\n", seat);
                    break;
                } else {
                    System.out.printf("\nSorry, seat %s is already booked. Try again!\n", seat);
                }
            }
        }
        System.out.println("\nAll seats are booked! Enjoy your movie!!");
    }
    void run(){
        selectMovie();
        displaySelectedMovie();
        randomizeAvailability();
        displaySeatAvailability();
        selectSeats();
    }
}
