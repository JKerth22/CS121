package Week10.AbstractClasses;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hours;
    public HourlyEmployee(int id, String name, double wage, int hours) {
        super(id, name);
        this.wage = wage;
        this.hours = hours;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", wage=" + wage + ", hours=" + hours + "]";
    }
    @Override
    public double calculatePay(){
        return wage * hours;
    }
}
