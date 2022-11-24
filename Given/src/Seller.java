
public class Seller extends Employee {
    private double revenue;

    public Seller() {

    }


    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }

    /*Complete the below function for second test case*/
    public double getSalary() {
        return this.salary;
    }


    //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", revenue=" + revenue +
                '}';
    }
}
