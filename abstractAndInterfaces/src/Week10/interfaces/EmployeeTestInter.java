package Week10.interfaces;

public class EmployeeTestInter {
    public static void main(String[] args) {
        HourlyEmployeeInter employee1 = new HourlyEmployeeInter(44444, "Charles", 14.5, 8);
        TempWorker employee2 = new TempWorker(22222, "Jasmine", 85000);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
