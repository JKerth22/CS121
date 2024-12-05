package Week10.AbstractClasses;

public class SalariedEmployee extends Employee {
    private double salary;
    public SalariedEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }
    @Override
    public double calculatePay(){
        return salary/52;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}
