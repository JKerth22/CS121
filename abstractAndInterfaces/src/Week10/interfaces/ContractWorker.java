package Week10.interfaces;

public class ContractWorker implements Pay {
    private int contractNumber;
    private String name;
    private double salary;
    public ContractWorker(int contractNumber, String name, double salary) {
        this.contractNumber = contractNumber;
        this.name = name;
        this.salary = salary;
    }
    public int getContractNumber() {
        return contractNumber;
    }
    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
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
