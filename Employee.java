package Project;

/**
 * Created by khaled on 12/10/2020.
 */
public class Employee extends Person {
    private double salary ;

    public Employee(String name, String id, String phone, double salary) {
        super(name, id, phone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString()
    {

        return super.toString()+"               "+getSalary();
    }
}
