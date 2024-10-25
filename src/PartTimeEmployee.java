public class PartTimeEmployee extends Employee{
    private int hours;
    private int wage;

    public PartTimeEmployee(int hours, int wage, String name){
        super(name);
        this.hours = hours;
        this.wage = wage;
    }

//    Accessors
    public int getHours() {
        return hours;
    }

    public int getWage() {
        return wage;
    }

//    Mutators
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public void calculateSalary(){
        super.setSalary(hours*wage);
    }
}
