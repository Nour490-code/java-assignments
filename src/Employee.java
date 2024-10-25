public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name){
        this.name = name;
    }

//    Accessors
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
//    Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void calculateSalary();
}
