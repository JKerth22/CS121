package Week10.interfaces;

public class TempWorker implements Pay {
    private int departmentNumber;
    private String name;
    private double salary;
    public TempWorker(int departmentNumber, String name, double salary) {
        this.departmentNumber = departmentNumber;
        this.name = name;
        this.salary = salary;
    }
    public int getDepartmentNumber() {
        return departmentNumber;
    }
    public void setDepartmentNumber(int contractNumber) {
        this.departmentNumber = contractNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculatePay(){
        return salary / 12;
    }
}
