package WeekSix;

public class MovieSimulationTwo    {

    public static void printMovieDetails(int movieNumber, String[] names, String[] types, double[] price) {
        System.out.println("----------------Movie Details----------------");
        System.out.println("Movie Name     Movie Type     Available Seats     Price");
        for (int i = 0; i < movieNumber; i++) {
            System.out.printf(names[i] + "     " + types[i] + "     $" + price[i] + "\n");
        }
    }
    public static void setMovieAvailability(int[][] movieAvail){
        for (int i = 0; i < movieAvail.length; i++) {
            for (int j = 0; j < movieAvail[i].length; j++) {
                movieAvail[i][j] = 0;
            }
        }
    }
    public static void randomizeMovieAvailability(int[][] movieAvail) {
        for (int i = 0; i < movieAvail.length; i++) {
            for (int j = 0; j < movieAvail[i].length; j++) {
                if (Math.random() > 0.50) {
                    movieAvail[i][j] = 0;
                }
                else{
                    movieAvail[i][j] = 1;
                }
            }
        }
    }
    public static void displayMovieAvailability(int[][] movieAvail) {
        System.out.println("Seat Availability: (1 = available)");
        for (int i = 0; i < movieAvail.length; i++) {
            System.out.println();
            for (int j = 0; j < movieAvail[i].length; j++) {
                System.out.print(movieAvail[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        String[] movieNames = {"Star Wars", "Back To The Future", "Scary Movie 3", "The Matrix"};
        String[] movieTypes = {"2D", "3D", "2D", "3D"};
        int[][] movieAvailability = new int[5][10];
        double[] moviePrice = {10.50, 5.50, 5.00, 11.50};
        printMovieDetails(4, movieNames, movieTypes, moviePrice);
        setMovieAvailability(movieAvailability);
        displayMovieAvailability(movieAvailability);
        randomizeMovieAvailability(movieAvailability);
        displayMovieAvailability(movieAvailability);
    }
}
