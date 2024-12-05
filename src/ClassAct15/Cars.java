package ClassAct15;

public class Cars {
    private int MPG;
    private String license;
    private int miles;
    private int buildYear;
    public Cars(int MPG2, String licensePlate, int milesDriven, int yearOfBuild){
        this.MPG = MPG2;
        this.license = licensePlate;
        this.miles = milesDriven;
        this.buildYear = yearOfBuild;
    }
    public void print() {
        System.out.println("MPG: " + MPG);
        System.out.println("License: " + license);
        System.out.println("Miles: " + miles);
        System.out.println("Build Year: " + buildYear);
    }
}
