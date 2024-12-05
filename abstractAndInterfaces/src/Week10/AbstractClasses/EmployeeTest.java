package Week10.AbstractClasses;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee(55555, "James", 80000);
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println(employee1);
    }
}
