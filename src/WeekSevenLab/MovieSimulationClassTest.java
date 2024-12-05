package WeekSevenLab;

public class MovieSimulationClassTest {
    public static void main(String[] args) {
        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = {"3D", "2D", "3D", "2D"};
        double[] moviePrices = {15.00, 12.00, 14.00, 12.00};
        MovieSimulationClass movie1 = new MovieSimulationClass(movieNames[0], movieTypes[0], moviePrices[0]);
        MovieSimulationClass movie2 = new MovieSimulationClass(movieNames[1], movieTypes[1], moviePrices[1]);
        MovieSimulationClass movie3 = new MovieSimulationClass(movieNames[2], movieTypes[2], moviePrices[2]);
        MovieSimulationClass movie4 = new MovieSimulationClass(movieNames[3], movieTypes[3], moviePrices[3]);
        movie1.run();
    }
}
