package ClassAct15;

public class printing {
    public static void main(String[] args) {
        Cars bugatti = new Cars(12, "DWA85E3", 2300, 2021);
        Drive californiaTrip = new Drive(1200, 65, 4, bugatti);
        californiaTrip.print();
    }
}
