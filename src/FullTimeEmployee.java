import java.lang.reflect.AccessFlag;

public class FullTimeEmployee extends Employee{
    public int basicSalary = 1000;
    private int employmentYears;

    public FullTimeEmployee(String name){
        super(name);
    }

//    Accessors
    public int getEmploymentYears() {
        return employmentYears;
    }

//    Mutators
    public void setEmploymentYears(int employmentYears) {
        this.employmentYears = employmentYears;
    }

    @Override
    public void calculateSalary(){
        super.setSalary(basicSalary + employmentYears * 100);
    }
}
