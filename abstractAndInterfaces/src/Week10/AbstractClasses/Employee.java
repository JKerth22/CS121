package Week10.AbstractClasses;

public abstract class Employee {
    protected String name;
    protected int id;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Employee [name=" + name + ", id=" + id + "]";
    }
    public abstract double calculatePay();
}

